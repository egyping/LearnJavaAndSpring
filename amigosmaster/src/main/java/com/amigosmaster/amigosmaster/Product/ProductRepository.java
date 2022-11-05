package com.amigosmaster.amigosmaster.Product;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

//@Component(value = "real")
@Repository(value = "real")
public class ProductRepository implements ProductRepo{
    // This class will be used for connecting to the DB
    @Override
    public List<Product> getProducts(){
        return Arrays.asList(
                new Product(2L, 002, "Real Repository", "password")
        );
    }
}
