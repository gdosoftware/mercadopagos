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
public class MPBackUrls {
       
    private String success;
    private String pending;
    private String failure;

    public MPBackUrls(String success, String pending, String failure) {
        this.success = success;
        this.pending = pending;
        this.failure = failure;
    }

    public MPBackUrls() {
    }
    
    
    public String getFailure() {
        return failure;
    }

    public void setFailure(String failure) {
        this.failure = failure;
    }

    public String getPending() {
        return pending;
    }

    public void setPending(String pending) {
        this.pending = pending;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
    
    
}
