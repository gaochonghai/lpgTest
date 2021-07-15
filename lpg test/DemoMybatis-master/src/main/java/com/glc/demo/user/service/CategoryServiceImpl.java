package com.glc.demo.user.service;


import com.glc.demo.user.dao.CategoryDao;
import com.glc.demo.user.dao.ProductDao;
import com.glc.demo.user.entity.CategoryEntity;
import com.glc.demo.user.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDao categoryDao;


    @Override
    public List<CategoryEntity> getCategories() {
        List<CategoryEntity> list = categoryDao.getCategories();
        return list;
    }
}
