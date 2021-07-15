package com.glc.demo.user.service;


import com.glc.demo.user.dao.ProductDao;
import com.glc.demo.user.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;


    @Override
    public List<ProductEntity> getList() {
        List<ProductEntity> list = new ArrayList<>();
        return productDao.getList();
    }

    @Override
    public ProductEntity getProductById(Integer id) {
        return productDao.getProductById(id);
    }

    @Override
    public void updateProductById(ProductEntity productEntity) {
        productDao.updateProductById(productEntity);
    }

    @Override
    public List<ProductEntity> getAllByName(String name) {
        List<ProductEntity> list = productDao.getAllByName(name);
        return list;
    }

    @Override
    public List<ProductEntity> getProduct(Map<String, Object> params) {
        return productDao.getProduct(params);
    }
}
