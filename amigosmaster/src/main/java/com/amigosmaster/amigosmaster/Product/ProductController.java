package com.amigosmaster.amigosmaster.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    // instintiate the service by creating new object from the service class
    // access modifier - ref type the actual refrence - var name = new - value from ref
    // private final ProductService productService = new ProductService();

    // another way by creating ref type var + constructor (@Autowired + @Component)
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    // Method to call service data
    // Type which will return from the service(Class) methodName()
    // {return the insider method}
    List<Product> getProducts(){
        return productService.getProducts();
    }

}
