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
 * @author Madness
 */
@XmlType
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="makers")
public class MakersList {
    @XmlElement(name="maker")
    private List<Maker> makers;

    public MakersList() {
    }

    public MakersList(List<Maker> makers) {
        this.makers = makers;
    }

    public List<Maker> getMakers() {
        return makers;
    }

    public void setMakers(List<Maker> makers) {
        this.makers = makers;
    }

}
