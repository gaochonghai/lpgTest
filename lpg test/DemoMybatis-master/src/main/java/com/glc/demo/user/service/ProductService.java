package com.glc.demo.user.service;

import com.glc.demo.user.entity.ProductEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface ProductService {

    List<ProductEntity> getList();


    public ProductEntity getProductById(Integer id);

    public void updateProductById(@RequestBody ProductEntity productEntity);

    public List<ProductEntity> getAllByName(String name);

    List<ProductEntity> getProduct(Map<String, Object> params);

}
