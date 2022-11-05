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
            new Product(2L, 002, "Fake Product 2", "password", "email@gmail.com"),
            new Product(4L, 004, "Fake Product 4", "password", "email@gmail.com")
            );
    }
}
