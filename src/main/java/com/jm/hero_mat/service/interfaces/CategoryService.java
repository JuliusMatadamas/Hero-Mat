package com.jm.hero_mat.service.interfaces;

import com.jm.hero_mat.dto.CategoryDto;
import com.jm.hero_mat.dto.Response;

public interface CategoryService {
    Response createCategory(CategoryDto categoryRequest);
    Response updateCategory(Long categoryId, CategoryDto categoryRequest);
    Response getAllCategories();
    Response getCategoryById(Long categoryId);
    Response deleteCategory(Long categoryId);
}
