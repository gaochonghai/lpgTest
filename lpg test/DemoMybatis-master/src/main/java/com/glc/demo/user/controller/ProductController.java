package com.glc.demo.user.controller;


import com.glc.demo.user.entity.ProductEntity;
import com.glc.demo.user.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


/**
 * RestController=@ResponseBody+@Controller
 *
 */

@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/getProduct")
    @ResponseBody
    List<ProductEntity> getProduct(@RequestBody Map<String,Object> params) {
        List<ProductEntity> menus = productService.getProduct(params);
        return menus;
    }

    @RequestMapping("/list")
    @ResponseBody
    List<ProductEntity> list() {
        List<ProductEntity> menus = productService.getList();
        return menus;
    }

    @RequestMapping("/getProductById")
    @ResponseBody
    public ProductEntity getProductById(Integer id){
        return  productService.getProductById(id);
    }

    @RequestMapping("/updateProductById")
    @ResponseBody
    public String updateProductById(@RequestBody ProductEntity productEntity){
        productService.updateProductById(productEntity);
        return "success";

    }

    @RequestMapping("/getAllByName")
    @ResponseBody
    public List<ProductEntity> getAllByName(String name) {
        List<ProductEntity> list = productService.getAllByName(name);
        return list;
    }

}
