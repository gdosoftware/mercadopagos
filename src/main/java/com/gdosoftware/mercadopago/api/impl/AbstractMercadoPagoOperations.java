/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago.api.impl;

import com.google.gson.Gson;
import com.mercadopago.MP;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Dani
 */
public abstract class AbstractMercadoPagoOperations {
    
    
    protected String rootUrl;
    
    protected MP mepa;

    public AbstractMercadoPagoOperations(MP mercadoPago, String rootUrl) {
        this.mepa = mercadoPago;
        this.rootUrl = rootUrl;
    }
    
    public <T> T getResult(JSONObject json, Class<T> clazz){
        Gson gson = new Gson();
        try {
            if(json.getInt("status") == 201 || json.getInt("status") == 200)
                return gson.fromJson(json.getJSONObject("response").toString(), clazz);
        } catch (JSONException ex) {
            Logger.getLogger(AbstractMercadoPagoOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return null;
    }
}
    
    

