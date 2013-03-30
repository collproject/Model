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
@XmlRootElement(name="maker")
public class Maker {
    @XmlElement(name="makid")
    private Integer makID;
    @XmlElement(name="makname")
    private String makName;
    @XmlElement(name="makdescr")
    private String makDescr;
    @XmlElementWrapper(name = "products")
    @XmlElement(name = "product")
    private List<Product> productsList;

    public Maker() {
    }

    public Maker(Integer makID) {
        this.makID = makID;
    }

    public Maker(Integer makID, String makName) {
        this.makID = makID;
        this.makName = makName;
    }

    public Integer getMakID() {
        return makID;
    }

    public void setMakID(Integer makID) {
        this.makID = makID;
    }

    public String getMakName() {
        return makName;
    }

    public void setMakName(String makName) {
        this.makName = makName;
    }

    public String getMakDescr() {
        return makDescr;
    }

    public void setMakDescr(String makDescr) {
        this.makDescr = makDescr;
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
        hash += (makID != null ? makID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Maker)) {
            return false;
        }
        Maker other = (Maker) object;
        if ((this.makID == null && other.makID != null) || (this.makID != null && !this.makID.equals(other.makID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pb.shop.model.Maker[ makID=" + makID + " ]";
    }
    
}
