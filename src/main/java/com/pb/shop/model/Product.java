/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.shop.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Madness
 */
@XmlType
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="product")
public class Product {
    @XmlElement(name = "prodid")
    private Integer prodID;
    @XmlElement(name = "prodname")
    private String prodName;
    @XmlElement(name = "prodprice")
    private BigDecimal prodPrice;
    @XmlElement(name = "proddescription")
    private String prodDescription;
    @XmlElement(name = "prodimg")
    private String prodImg;
    //in db this type is char
    @XmlElement(name = "prodexist")
    private Boolean prodExist;
    @XmlElement(name = "catid")
    private Integer catID;
    @XmlElement(name = "makid")
    private Integer makID;

    public Product() {
    }

    public Product(Integer prodID) {
        this.prodID = prodID;
    }

    public Product(Integer prodID, String prodName, BigDecimal prodPrice, Boolean prodExist) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.prodExist = prodExist;
    }

    public Integer getProdID() {
        return prodID;
    }

    public void setProdID(Integer prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public BigDecimal getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(BigDecimal prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public String getProdImg() {
        return prodImg;
    }

    public void setProdImg(String prodImg) {
        this.prodImg = prodImg;
    }

    public Boolean getProdExist() {
        return prodExist;
    }

    public void setProdExist(Boolean prodExist) {
        this.prodExist = prodExist;
    }

    public Integer getCatID() {
        return catID;
    }

    public void setCatID(Integer catID) {
        this.catID = catID;
    }

    public Integer getMakID() {
        return makID;
    }

    public void setMakID(Integer makID) {
        this.makID = makID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodID != null ? prodID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.prodID == null && other.prodID != null) || (this.prodID != null && !this.prodID.equals(other.prodID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return prodName;
    }
    
}
