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
public class MPMerchant {
    private String id;
    private String preference_id;
    private String date_created;//"2017-12-28T09:59:26.000-04:00",
    private String status;
    private String site_id;
    private MPPayer payer;
    private MPItem[] items;
    private String additional_info;
    private MPPayment[] payments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPreference_id() {
        return preference_id;
    }

    public void setPreference_id(String preference_id) {
        this.preference_id = preference_id;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSite_id() {
        return site_id;
    }

    public void setSite_id(String site_id) {
        this.site_id = site_id;
    }

    public MPPayer getPayer() {
        return payer;
    }

    public void setPayer(MPPayer payer) {
        this.payer = payer;
    }

    public MPItem[] getItems() {
        return items;
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

    public MPPayment[] getPayments() {
        return payments;
    }

    public void setPayments(MPPayment[] payments) {
        this.payments = payments;
    }

    @Override
    public String toString() {
        return "MPMerchant{" + "id=" + id + ", preference_id=" + preference_id + ", date_created=" + date_created + ", status=" + status + ", site_id=" + site_id + ", payer=" + payer + ", items=" + items + ", additional_info=" + additional_info + ", payments=" + payments + '}';
    }

    
    
    
    
   }
