package com.amigosmaster.amigosmaster.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;


// Connecting to H2 database via JPA

public interface ProductRepository extends JpaRepository<Product, Long> {
    // This class will be used for connecting to the DB

    }



// This for not real DB just new Product object
//@Component(value = "real")
//@Repository(value = "real")
//public class ProductRepository implements ProductRepo{
//    // This class will be used for connecting to the DB
//    @Override
//    public List<Product> getProducts(){
//        return Arrays.asList(
//                new Product(2L, 002, "Real Repository", "password", "email@gmail.com")
//        );
//    }

