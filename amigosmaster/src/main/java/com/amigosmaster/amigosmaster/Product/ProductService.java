package com.amigosmaster.amigosmaster.Product;

import com.amigosmaster.amigosmaster.exception.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.apache.logging.log4j.LogManager;

import java.util.List;

//@Component
@Service
public class ProductService {

    // First you will need to refrence the Repo which you will pull the data from
    // inject it by @component and @Autowired

    // in case of testing use ProductRepo
    //private final ProductRepo productRepo;

    // point to the actual REPO interface which connect to JPA ProductRepository
    private final ProductRepository productRepository;

    // Logger var to be used at any method
    private final static Logger LOGGER = LoggerFactory.getLogger(ProductService.class);
    // private final static Logger LOGGER = (Logger) LogManager.getLogger(ProductService.class);

    @Autowired
    public ProductService(
            // @Qualifier("real")
            ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Method to list all the products from productRepo when it was not DB
//    List<Product> getProducts() {return productRepo.getProducts();
//    }

    // Method to list the products from the JPA interface we use findAll
    List<Product> getProducts() {
        // log when the method executed
        LOGGER.info("getProducts was called");
        return productRepository.findAll();
    }

    // Method to get one product from productRepo when it was not DB
//    Product getProduct(Long id) {
//        return productRepo.getProducts()
//                .stream()
//                .filter(product -> product.getId().equals(id)).findFirst()
//                // .orElseThrow(() -> new IllegalStateException("Product not found"));
//                .orElseThrow(() -> new NotFoundException("Product not found"));


    Product getProduct(Long id) {
        return productRepository.findById(id)
                // if not exist throw this error and log it
                .orElseThrow(() -> {
                    NotFoundException notFoundException = new NotFoundException("Product with ID {} "+ id + "Not Found");
                    LOGGER.error("Get Product was called and product with ID {} not found "+id,
                                notFoundException);
                    return notFoundException;
                });
    }
}
