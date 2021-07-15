package com.glc.demo.user.dao;

import com.glc.demo.user.entity.ProductEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProductDao {

    @Select("select id, name, description, category_id, create_date, update_date, last_purchased_date from products")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "description",property = "description"),
            @Result(column = "category_id",property = "categoryId"),
            @Result(column = "create_date",property = "createDate"),
            @Result(column = "update_date",property = "updateDate"),
            @Result(column = "last_purchased_date",property = "lastPurchasedDate")
    })
    List<ProductEntity> getList();

    List<ProductEntity> getProduct(Map<String, Object> params);


    @Select("select id, name, description, category_id, create_date, update_date, last_purchased_date from products where id=#{id}")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "description",property = "description"),
            @Result(column = "category_id",property = "categoryId"),
            @Result(column = "create_date",property = "createDate"),
            @Result(column = "update_date",property = "updateDate"),
            @Result(column = "last_purchased_date",property = "lastPurchasedDate")
    })
    public ProductEntity getProductById(Integer id);

    @Update("update products set name=#{name} where id=#{id}")
    public void updateProductById(ProductEntity productEntity);

    @Select("select id, name, description, category_id, create_date, update_date, last_purchased_date from products where name=#{name}")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "description",property = "description"),
            @Result(column = "category_id",property = "categoryId"),
            @Result(column = "create_date",property = "createDate"),
            @Result(column = "update_date",property = "updateDate"),
            @Result(column = "last_purchased_date",property = "lastPurchasedDate")
    })
    public List<ProductEntity> getAllByName(@Param("name") String name);

    @Select("select id, name, description, category_id, create_date, update_date, last_purchased_date from products")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "description",property = "description"),
            @Result(column = "category_id",property = "categoryId"),
            @Result(column = "create_date",property = "createDate"),
            @Result(column = "update_date",property = "updateDate"),
            @Result(column = "last_purchased_date",property = "lastPurchasedDate")
    })
    List<ProductEntity> getCategories();

}
