/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.shop.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Madness
 */
@XmlType
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="category")
public class Category {
    @XmlElement(name="catid")
    private Integer catID;
    @XmlElement(name="catname")
    private String catName;
    @XmlElementWrapper(name = "categorys")
    @XmlElement(name = "category")
    private List<Category> categoryList;
    @XmlElement(name="parentcatid")
    private Category parentCatID;
    @XmlElementWrapper(name = "products")
    @XmlElement(name = "product")
    private List<Product> productsList;

    public Category() {
    }

    public Category(Integer catID) {
        this.catID = catID;
    }

    public Category(Integer catID, String catName) {
        this.catID = catID;
        this.catName = catName;
    }

    public Integer getCatID() {
        return catID;
    }

    public void setCatID(Integer catID) {
        this.catID = catID;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public Category getParentCatID() {
        return parentCatID;
    }

    public void setParentCatID(Category parentCatID) {
        this.parentCatID = parentCatID;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (catID != null ? catID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Category)) {
            return false;
        }
        Category other = (Category) object;
        if ((this.catID == null && other.catID != null) || (this.catID != null && !this.catID.equals(other.catID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pb.shop.model.Category[ catID=" + catID + " ]";
    }
    
}
