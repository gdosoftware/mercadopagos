/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago.domain;

/**
 *
 * @author Daniel Gago
 */
public class MPNotify {
    private String topic;
    private String id;

    public MPNotify(String topic, String id) {
        this.topic = topic;
        this.id = id;
    }
    
    

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   
    
    
}
