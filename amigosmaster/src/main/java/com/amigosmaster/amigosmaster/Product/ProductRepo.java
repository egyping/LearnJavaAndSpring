package com.amigosmaster.amigosmaster.Product;

import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface ProductRepo {
    //
    List<Product> getProducts();
}
