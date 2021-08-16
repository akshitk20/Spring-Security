package com.exam.examserver.service;

import com.exam.examserver.models.Category;

import java.util.List;

public interface CategoryService {
    Category addCategory(Category category);
    Category updateCategory(Category category);
    List<Category> getCategories();
    Category getCategory(Long categoryId);
    void deleteCategory(Long categoryId);
}
