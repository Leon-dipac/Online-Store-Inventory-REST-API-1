// Complete File for this project
package com.javaapilearning.crud.example.controller;

import com.javaapilearning.crud.example.entity.Product;
import com.javaapilearning.crud.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// The controller will handle the navigation between the different views.

@RestController
// Let's push it on Github
public class ProductController {

    @Autowired
    // This Product Controller will talk to the Service Class to execute all the methods based on HTTP Request:

    private ProductService service;

    // Controller for Create or Add API Service:

    @PostMapping("/addProduct")
    // The HTTP or URL Request should be : http://localhost:9191/addProduct
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }

    // Controller for Retrieve, Post or Get API Service:
    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }

    @GetMapping("/productByID/{id}")
    public Product findProductById(@PathVariable int id){
        return service.getProductById(id);
    }

    @GetMapping("/productByName/{name}")
    public Product findProductByName(@PathVariable String name){
        return service.getProductByName(name);
    }

    // Controller for Put or Update API Service:
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

    // Controller for Delete API Service:
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }
}
