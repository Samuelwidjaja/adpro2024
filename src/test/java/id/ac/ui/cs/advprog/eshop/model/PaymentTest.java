package id.ac.ui.cs.advprog.eshop.model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import enums.OrderStatus;
import id.ac.ui.cs.advprog.eshop.controller.model.Order;
import id.ac.ui.cs.advprog.eshop.controller.model.Product;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class PaymentTest {
    private List<Product> products;
    private Order order;
    private List<Order> orders;

    @BeforeEach
    void setUp() {
        this.products = new ArrayList<>();
        Product product1 = new Product();
        product1.setProductId("eb558e9f-1c39-460e-8860-71af6af63bd6");
        product1.setProductName("Sampo Cap Bambang");
        product1.setProductQuantity(2);

        Product product2 = new Product();
        product2.setProductId("a2c62328-4a37-4664-83c7-f32db8620155");
        product2.setProductName("Sabun Cap Usep");
        product2.setProductQuantity(1);

        this.products.add(product1);
        this.products.add(product2);

        this.orders = new ArrayList<>();
        Order order1 = new Order("13652556-012a-4c07-b546-54eb1396d79b", this.products, 1708560000L, "Safira Sudrajat", OrderStatus.SUCCESS.getValue());
        Order order2 = new Order("24652556-012a-4c07-b546-54eb1396d79a", this.products, 170856000L, "Safira Widjaja", OrderStatus.SUCCESS.getValue());
        this.orders.add(order1);
        this.orders.add(order2);
        this.order = order1;
    }

    // Main Payment
    @Test
    void testDuplicatePayment() {
        Map<String, String> paymentData = new HashMap<String, String>();
        paymentData.put("voucherCode", "ESHOP1234ABC5678");
        Payment payment = new Payment("1994cddb-6f3b-40ca-aed1-eba78db32295", "VOUCHER_CODE", this.orders.getFirst(), paymentData);

        assertSame(this.orders.getFirst(), payment.getOrder());
    }

    @Test
    void testPaymentInvalidPaymentMethod() {
        Map<String, String> paymentData = new HashMap<>();
        paymentData.put("voucherCode", "ESHOP1234ABC5678");

        assertThrows(IllegalArgumentException.class, () -> {
            Payment payment = new Payment("1994cddb-6f3b-40ca-aed1-eba78db32295", "QRIS", this.orders.getFirst(), paymentData);
        });
    }

    @Test
    void testRejectedPaymentEmptyData() {
        Map<String, String> paymentData = new HashMap<>();

        assertThrows(IllegalArgumentException.class, () -> {
            Payment payment = new Payment("1994cddb-6f3b-40ca-aed1-eba78db32295", "VOUCHER_CODE", this.orders.getFirst(), paymentData);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            Payment payment = new Payment("1994cddb-6f3b-40ca-aed1-eba78db32295", "PAYMENT_BY_BANK_TRANSFER", this.orders.getFirst(), paymentData);
        });
    }

    // Voucher Code
    @Test
    void testSuccessValidVoucherCode() {
        Map<String, String> paymentData = new HashMap<>();
        paymentData.put("voucherCode", "ESHOP1234ABC5678");

        Payment payment = new Payment("1994cddb-6f3b-40ca-aed1-eba78db32295", "VOUCHER_CODE", this.orders.getFirst(), paymentData);
        assertEquals("SUCCESS", payment.getStatus());
    }

    @Test
    void testRejectedVoucherCodeNot16Chars() {
        Map<String, String> paymentData = new HashMap<>();
        paymentData.put("voucherCode", "ESHOP123");

        Payment payment = new Payment("1994cddb-6f3b-40ca-aed1-eba78db32295", "VOUCHER_CODE", this.orders.getFirst(), paymentData);
        assertEquals("REJECTED", payment.getStatus());
    }

    @Test
    void testRejectedVoucherCodeWrongPrefix() {
        Map<String, String> paymentData = new HashMap<>();
        paymentData.put("voucherCode", "EEHOP1234ABC5678");

        Payment payment = new Payment("1994cddb-6f3b-40ca-aed1-eba78db32295", "VOUCHER_CODE", this.orders.getFirst(), paymentData);
        assertEquals("REJECTED", payment.getStatus());
    }

    @Test
    void testRejectedVoucherCodeNot8CharNumerical() {
        Map<String, String> paymentData = new HashMap<>();
        paymentData.put("voucherCode", "ESHOP1234ABC567Z");

        Payment payment = new Payment("1994cddb-6f3b-40ca-aed1-eba78db32295", "VOUCHER_CODE", this.orders.getFirst(), paymentData);
        assertEquals("REJECTED", payment.getStatus());
    }

    // Payment By Bank Transfer
    @Test
    void testSuccessValidPaymentByBankTransfer() {
        Map<String, String> paymentData = new HashMap<>();
        paymentData.put("bankName", "OCBC");
        paymentData.put("referenceCode", "028");

        Payment payment = new Payment("1994cddb-6f3b-40ca-aed1-eba78db32295", "PAYMENT_BY_BANK_TRANSFER", this.orders.getFirst(), paymentData);

        assertEquals("SUCCESS", payment.getStatus());
    }

    @Test
    void testRejectedPaymentByBankTransferBankName() {
        Map<String, String> paymentData = new HashMap<String, String>();
        paymentData.put("referenceCode", "028");
        Payment payment = new Payment("1994cddb-6f3b-40ca-aed1-eba78db32295", "PAYMENT_BY_BANK_TRANSFER", this.orders.getFirst(), paymentData);

        assertEquals("REJECTED", payment.getStatus());
    }

    @Test
    void testRejectedPaymentByBankTransferEmptyReferenceCode() {
        Map<String, String> paymentData = new HashMap<String, String>();
        paymentData.put("bankName", "OCBC");
        Payment payment = new Payment("1994cddb-6f3b-40ca-aed1-eba78db32295", "PAYMENT_BY_BANK_TRANSFER", this.orders.getFirst(), paymentData);

        assertEquals("REJECTED", payment.getStatus());
    }

}