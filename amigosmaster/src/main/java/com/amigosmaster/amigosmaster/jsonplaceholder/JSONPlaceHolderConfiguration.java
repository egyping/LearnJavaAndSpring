package com.amigosmaster.amigosmaster.jsonplaceholder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JSONPlaceHolderConfiguration {

    @Bean("jsonplaceholder")
    CommandLineRunner runner(JSONPlaceHolderClient jsonPlaceHolderClient) {
        return args -> {
            System.out.println("Number of posts is:  "+ jsonPlaceHolderClient.getPosts().size());
            System.out.println();
            System.out.println("First post is:  "+ jsonPlaceHolderClient.getPost(1));
        };
    }
}
