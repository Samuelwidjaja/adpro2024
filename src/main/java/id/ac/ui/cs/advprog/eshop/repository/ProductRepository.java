package id.ac.ui.cs.advprog.eshop.repository;

import org.springframework.stereotype.Repository;

import id.ac.ui.cs.advprog.eshop.controller.model.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();

    public Product create(Product product) {
        productData.add(product);
        return product;
    }

    public Product edit(Product updatedProduct){
        if(updatedProduct.getProductQuantity() < 0){
            updatedProduct.setProductQuantity(0);
        }
        for (int i = 0; i < productData.size(); i++) {
            Product product = productData.get(i);
            if(product.getProductId().equals(updatedProduct.getProductId())){
                productData.set(i, updatedProduct);
                return updatedProduct;
            }
        }
        return null;
    }
  
    public Product delete(Product item) {
          Product product = findById(item.getProductId());
          if (product != null) {
              productData.remove(product);
              return product;
          }
          return null;
      }

     public Product findById(String productId){
        for(Product product: productData){
            if(product.getProductId().equals(productId)){
                return product;
            }
        }
        return null;
    }

    public Iterator<Product> findAll(){
        return productData.iterator();
    }
}
