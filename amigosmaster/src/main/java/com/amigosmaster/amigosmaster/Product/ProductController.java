package com.amigosmaster.amigosmaster.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

// @RequestMapping(path = "api/v1/product") // to path the entire controller instead of each method
@RestController
// @Deprecated use it to deprcate the controller
public class ProductController {
    // instintiate the service by creating new object from the service class
    // access modifier - ref type the actual refrence - var name = new - value from ref
    // private final ProductService productService = new ProductService();

    // another way by creating ref type var + constructor (@Autowired + @Component)
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "api/v1/product")
    // Method to call service data
    // Type which will return from the service(Class) methodName()
    // {return the insider method}
    List<Product> getProducts(){
        return productService.getProducts();
    }
    @GetMapping(path = "api/v1/product/{productId}")
    Product getProduct(@PathVariable("productId") Long id){
        return productService.getProduct(id);
    }

    // @Valid to make sure of the @NotBlank of the class property
    @PostMapping(path = "api/v1/product")
    void createNewProduct(@Valid @RequestBody Product product){
        System.out.println("POST Request");
        System.out.println(product);
    }

    @PutMapping(path = "api/v1/product")
    void updateProduct(@RequestBody Product product){
        System.out.println("Update Request");
        System.out.println(product);
    }

    @DeleteMapping(path = "api/v1/product/{productId}")
    void deleteProduct(@PathVariable("productId") Long id){
        System.out.println("Delet product with ID of "+ id);
    }

}
