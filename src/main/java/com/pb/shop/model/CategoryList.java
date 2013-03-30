/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.shop.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Дмитрий
 */

@XmlType
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="categoryes")
public class CategoryList {
    
    @XmlElement(name="category")
    private List<Category> categoryes;

    public CategoryList() {
    }

    public CategoryList(List categoryes) {
        this.categoryes = categoryes;
    }

    public List getCategoryes() {
        return categoryes;
    }

    public void setCategoryes(List categoryes) {
        this.categoryes = categoryes;
    }
        
}
