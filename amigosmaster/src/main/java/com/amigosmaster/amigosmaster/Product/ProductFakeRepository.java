package com.amigosmaster.amigosmaster.Product;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

//@Component(value = "fake")  // it works too
@Repository(value = "fake")
public class ProductFakeRepository implements ProductRepo{

    @Override
    public List<Product> getProducts() {
    return Arrays.asList(
            new Product(1L, 001, "Fake Product 1", "password", "email_1@gmail.com"),
            new Product(2L, 002, "Fake Product 2", "password", "email_2@gmail.com"),
            new Product(3L, 003, "Fake Product 3", "password", "email_3@gmail.com")
            );
    }
}
