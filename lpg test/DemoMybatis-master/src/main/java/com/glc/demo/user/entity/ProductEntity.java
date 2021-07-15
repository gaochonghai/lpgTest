package com.glc.demo.user.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class ProductEntity {

    /**
     *
     */
    private static final long serialVersionUID = -8539609571626073634L;

    private int id;

    private String name;

    private String description;
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date createDate;

    private int categoryId;

//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
@JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date updateDate;

//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
@JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date lastPurchasedDate;


    public ProductEntity() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getLastPurchasedDate() {
        return lastPurchasedDate;
    }

    public void setLastPurchasedDate(Date lastPurchasedDate) {
        this.lastPurchasedDate = lastPurchasedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductEntity(int id, String name, String description, Date createDate, int categoryId, Date updateDate, Date lastPurchasedDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createDate = createDate;
        this.categoryId = categoryId;
        this.updateDate = updateDate;
        this.lastPurchasedDate = lastPurchasedDate;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createDate=" + createDate +
                ", categoryId=" + categoryId +
                ", updateDate=" + updateDate +
                ", lastPurchasedDate=" + lastPurchasedDate +
                '}';
    }
}
