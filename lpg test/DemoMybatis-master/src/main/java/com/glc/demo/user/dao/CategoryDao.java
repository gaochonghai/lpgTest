package com.glc.demo.user.dao;

import com.glc.demo.user.entity.CategoryEntity;
import com.glc.demo.user.entity.ProductEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoryDao {

    @Select("select id, category_name from categories")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "category_name",property = "categoryName")
    })
    List<CategoryEntity> getCategories();



}
