package com.amigosmaster.amigosmaster.Product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class ProductConfiguration {

    // create var of useFakeRepo the value true or false will come from the config file of the app
    // the $ used to obtaing the following value from the app config file and if not provided default
    // is false
    // we ared oing that
    @Value("${app.useFakeRepo:false}")
    private Boolean useFakeRepo;

     // to run commands while starting the app
    @Bean
    CommandLineRunner commandLineRunner (){
        return args ->{
            System.out.println("Bean commandLineRunner initiated");
        };
    }

    // useFakeRepo now either got it from the config file OR fales so now we have the value
    // productRepo method will use the value and pass it to the service to determine in using
    // the Fake or the Real (FakeRepo or Repository
    // @Bean must exist as it has to run while app starting to determine
//    @Bean
//    ProductRepo productRepo(){
//        System.out.println("Use the Fake Repo?:"+ " " + useFakeRepo);
//        return useFakeRepo ?
//                // if there is value to useFakeRepo and True use the Fake otherwise use the Repository
//                // disable the qualifier and this method will initiate based on config
//                new ProductFakeRepository() :
//                new ProductRepository();
//        // to change the value to true go to app config  > program arguments
//        // --app.useFakeRepo=true
//    }

    // same above after introducing the productRepository connected to the JPA
    @Bean
    ProductRepo productRepo(){
        System.out.println("Use the Fake Repo?:"+ " " + useFakeRepo);
        return new ProductFakeRepository();
    }
}
