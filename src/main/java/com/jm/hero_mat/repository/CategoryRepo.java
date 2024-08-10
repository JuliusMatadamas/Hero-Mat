package com.jm.hero_mat.repository;

import com.jm.hero_mat.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
