// Complete File for this project
package com.javaapilearning.crud.example.repository;

import com.javaapilearning.crud.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Let's push it on Github
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);

}
