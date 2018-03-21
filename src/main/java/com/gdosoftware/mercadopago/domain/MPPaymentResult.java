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
public class MPPaymentResult {
 //failure//collection_id=null&collection_status=null&preference_id=271149698-fc6f69fb-1c64-4781-856b-e4f4cfb22026&external_reference=null&payment_type=null&merchant_order_id=683870949   
//pending//collection_id=3556685531&collection_status=in_process&preference_id=271149698-fc6f69fb-1c64-4781-856b-e4f4cfb22026&external_reference=null&payment_type=credit_card&merchant_order_id=683870949    
    
private Long collection_id;
private String collection_status;
private String preference_id;
private String external_reference;
private String payment_type;
private Long merchant_order_id;

    public Long getCollection_id() {
        return collection_id;
    }

    public void setCollection_id(Long collection_id) {
        this.collection_id = collection_id;
    }

    public String getCollection_status() {
        return collection_status;
    }

    public void setCollection_status(String collection_status) {
        this.collection_status = collection_status;
    }

    public String getPreference_id() {
        return preference_id;
    }

    public void setPreference_id(String preference_id) {
        this.preference_id = preference_id;
    }

    public String getExternal_reference() {
        return external_reference;
    }

    public void setExternal_reference(String external_reference) {
        this.external_reference = external_reference;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public Long getMerchant_order_id() {
        return merchant_order_id;
    }

    public void setMerchant_order_id(Long merchant_order_id) {
        this.merchant_order_id = merchant_order_id;
    }


}
