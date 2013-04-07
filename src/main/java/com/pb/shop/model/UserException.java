/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pb.shop.model;

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
@XmlRootElement(name="exception")
public class UserException {

    @XmlElement(name="message")
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return message;
    }
    
}
