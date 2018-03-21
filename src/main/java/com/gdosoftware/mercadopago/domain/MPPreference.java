/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago.domain;

import java.util.Date;

/**
 *
 * @author Daniel Gago
 */
public class MPPreference {
    private String id;
    private MPItem[] items;
    private String additional_info;
    private String auto_return;//approved / all
    private Boolean expires;
    private String expiration_date_to; //Date(ISO_8601)
    private String notification_url;
    private MPBackUrls back_urls;
    private String init_point;

    public MPItem[] getItems() {
        return items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

    public void setItems(MPItem[] items) {
        this.items = items;
    }

    public String getAdditional_info() {
        return additional_info;
    }

    public void setAdditional_info(String additional_info) {
        this.additional_info = additional_info;
    }

    public String getAuto_return() {
        return auto_return;
    }

    public void setAuto_return(String auto_return) {
        this.auto_return = auto_return;
    }

    public Boolean getExpires() {
        return expires;
    }

    public void setExpires(Boolean expires) {
        this.expires = expires;
    }

    public String getExpiration_date_to() {
        return expiration_date_to;
    }

    public void setExpiration_date_to(String expiration_date_to) {
        this.expiration_date_to = expiration_date_to;
    }

   

    public String getNotification_url() {
        return notification_url;
    }

    public void setNotification_url(String notification_url) {
        this.notification_url = notification_url;
    }

    public MPBackUrls getBack_urls() {
        return back_urls;
    }

    public void setBack_urls(MPBackUrls back_urls) {
        this.back_urls = back_urls;
    }

    public String getInit_point() {
        return init_point;
    }

    public void setInit_point(String init_point) {
        this.init_point = init_point;
    }
    
    
}
