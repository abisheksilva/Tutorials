package uk.ac.westminster.products_api;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService{
    private ArrayList<Product> products =  new ArrayList<>();
    private Long nextId = 1L;

    public ArrayList<Product> getProducts(){
        return products;
    }

    public Product addProduct(Product product){
        product.setId(nextId++);
        products.add(product);

        return product;
    }
}