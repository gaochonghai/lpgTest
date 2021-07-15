package com.glc.demo.user.service;

import com.glc.demo.user.entity.CategoryEntity;
import com.glc.demo.user.entity.ProductEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CategoryService {

    List<CategoryEntity> getCategories();


}
