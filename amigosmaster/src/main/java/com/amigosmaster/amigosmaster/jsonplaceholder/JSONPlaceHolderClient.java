package com.amigosmaster.amigosmaster.jsonplaceholder;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@FeignClient(
        value = "jsonplaceholder",
        url = "https://jsonplaceholder.typicode.com/"
)
public interface JSONPlaceHolderClient {

    @GetMapping(path = "posts")
    List<Post> getPosts();

    @GetMapping(path = "posts/{postId}")
    Post getPost(@PathVariable("postId") Integer postId);
}
