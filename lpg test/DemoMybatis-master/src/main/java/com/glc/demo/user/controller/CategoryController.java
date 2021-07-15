package com.glc.demo.user.controller;


import com.glc.demo.user.entity.CategoryEntity;
import com.glc.demo.user.entity.ProductEntity;
import com.glc.demo.user.service.CategoryService;
import com.glc.demo.user.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Locale;


/**
 * RestController=@ResponseBody+@Controller
 *
 */

@Controller
@RequestMapping("category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;



    @RequestMapping("/getCategories")
    @ResponseBody
    List<CategoryEntity> list() {
        List<CategoryEntity> menus = categoryService.getCategories();
        return menus;
    }
}
