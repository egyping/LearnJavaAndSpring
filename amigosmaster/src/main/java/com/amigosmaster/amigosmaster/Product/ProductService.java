package com.amigosmaster.amigosmaster.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
public class ProductService {

    // First you will need to refrence the Repo which you will pull the data from
    // inject it by @component and @Autowired
    private final ProductRepo productRepo;

    @Autowired
    public ProductService(
            // @Qualifier("real")
            ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    List<Product> getProducts() {
        return productRepo.getProducts();
    }
}
