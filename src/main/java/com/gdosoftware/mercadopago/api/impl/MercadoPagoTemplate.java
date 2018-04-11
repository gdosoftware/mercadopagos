/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago.api.impl;

import com.gdosoftware.mercadopago.api.MercadoPago;
import com.gdosoftware.mercadopago.api.MerchantOperations;
import com.gdosoftware.mercadopago.api.PaymentOperations;
import com.gdosoftware.mercadopago.api.PreferenceOperations;
import com.mercadopago.MP;
import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author Dani
 */
public class MercadoPagoTemplate extends MP implements MercadoPago{
    
    @Value("${com.gdosoftware.mercadopago.rooturl}")
    private String rootUrl;

    public MercadoPagoTemplate(String client_id, String client_secret, boolean sandBox) {
        super(client_id, client_secret);
        this.sandboxMode(sandBox);
    }

    @Override
    public PreferenceOperations getPreferenceOperations() {
        return new PreferenceTemplate(this,rootUrl);
    }

    @Override
    public MerchantOperations getMerchantOperations() {
        return new MerchantTemplate(this,rootUrl);
    }

    @Override
    public PaymentOperations getPaymentOperations() {
        return new PaymentTemplate(this,rootUrl);
    }
    
}
