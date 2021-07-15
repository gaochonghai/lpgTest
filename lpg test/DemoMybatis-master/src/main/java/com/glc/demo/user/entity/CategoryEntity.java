package com.glc.demo.user.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class CategoryEntity {

    /**
     *
     */
    private static final long serialVersionUID = -8539609571626073634L;

    private int id;

    private String categoryName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public CategoryEntity() {
    }


    public CategoryEntity(int id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }
}
