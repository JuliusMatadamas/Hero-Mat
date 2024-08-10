package com.jm.hero_mat.repository;

import com.jm.hero_mat.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findByCategoryId(String categoryId);
    List<Product> findByNameContainingOrDescriptionCaontaining(String name, String description);
}
