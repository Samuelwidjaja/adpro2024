package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> products = new ArrayList<>();

    public Product create(Product product) {
        if (product.getProductQuantity() < 0) {
            product.setProductQuantity(0);
        }
        products.add(product);
        return product;
    }

    public Product edit(Product editedProduct) {
        if (editedProduct.getProductName().isEmpty()) {
            editedProduct.setProductName("Unnamed Product");
        }

        if (editedProduct.getProductQuantity() < 0) {
            editedProduct.setProductQuantity(0);
        }

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getProductId().equals(editedProduct.getProductId())) {
                products.set(i, editedProduct);
                return editedProduct;
            }
        }
        return null;
    }

    public Iterator<Product> findAll() {
        return products.iterator();
    }

    public Product delete(Product product) {
        productData.removeIf(prod -> prod.getProductId().equals(product.getProductId()));
        return null;
    }
}
