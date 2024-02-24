package id.ac.ui.cs.advprog.eshop.service;

import java.util.List;

import id.ac.ui.cs.advprog.eshop.controller.model.Product;

public interface ProductService {
    public Product create(Product product);
    public List<Product> findAll();
    public Product delete(Product product);
    public Product edit(Product product);
}
