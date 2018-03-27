/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago.api.impl;

import com.gdosoftware.mercadopago.api.PreferenceOperations;
import com.gdosoftware.mercadopago.domain.MPBackUrls;
import com.gdosoftware.mercadopago.domain.MPPreference;
import com.google.gson.Gson;
import com.mercadopago.MP;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.jettison.json.JSONObject;

/**
 *
 * @author Dani
 */
public class PreferenceTemplate extends AbstractMercadoPagoOperations implements PreferenceOperations {

    public PreferenceTemplate(MP mercadoPago, String rootUrl) {
        super(mercadoPago, rootUrl);
    }
   

    @Override
    public MPPreference createPreference(MPPreference preference) {
        Gson gson = new Gson();
        try {
            preference.setBack_urls(new MPBackUrls(rootUrl+"/mepapi/success",rootUrl+"/mepapi/pending",rootUrl+"/mepapi/failure"));
            preference.setNotification_url(rootUrl+"/mepapi/notifications");
            JSONObject json = mepa.createPreference(gson.toJson(gson.toJsonTree(preference)));
            return getResult(json, MPPreference.class);
        } catch (Exception ex) {
            Logger.getLogger(PreferenceTemplate.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return null;
    }

    @Override
    public MPPreference getPreference(String preferenceId) {
        Gson gson = new Gson();
        try {
            JSONObject json = mepa.getPreference(preferenceId);
            return getResult(json, MPPreference.class);
        } catch (Exception ex) {
            Logger.getLogger(PreferenceTemplate.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return null;
    }

    @Override
    public MPPreference updatePreference(String preferenceId, MPPreference preference) {
         Gson gson = new Gson();
        try {
            JSONObject json = mepa.updatePreference(preferenceId, gson.toJson(gson.toJsonTree(preference)));
            return getResult(json, MPPreference.class);
        } catch (Exception ex) {
            Logger.getLogger(PreferenceTemplate.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return null;
    }
    
}
