package id.ac.ui.cs.advprog.eshop.service;

import java.util.Map;

import id.ac.ui.cs.advprog.eshop.controller.model.Order;
import id.ac.ui.cs.advprog.eshop.controller.model.Payment;

import java.util.List;

public interface PaymentService {
    public Payment addPayment(String paymentId, Order order, String method, Map<String, String> paymentData);
    public Payment setStatus(Payment payment, String status);
    public Payment getPayment(String paymentId);
    public List<Payment> getAllPayments();
}