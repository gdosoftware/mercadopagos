/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago.api.impl;

import com.gdosoftware.mercadopago.api.MerchantOperations;
import com.gdosoftware.mercadopago.domain.MPMerchant;
import com.google.gson.Gson;
import com.mercadopago.MP;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jettison.json.JSONObject;

/**
 *
 * @author Dani
 */
public class MerchantTemplate extends AbstractMercadoPagoOperations implements MerchantOperations{
    
    public MerchantTemplate(MP mercadoPago) {
        super(mercadoPago);
    }

    @Override
    public MPMerchant getMerchant(Long merchantId) {
        try {
            JSONObject json = mepa.get("/merchant_orders/"+merchantId.toString(),true);
            return getResult(json, MPMerchant.class);
        } catch (Exception ex) {
            Logger.getLogger(MerchantTemplate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
