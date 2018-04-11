/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago;

import com.gdosoftware.mercadopago.api.MercadoPago;
import com.gdosoftware.mercadopago.api.impl.MercadoPagoTemplate;

/**
 *
 * @author Daniel Gago
 */
public class MercadoPagoFactory {
    
    public static MercadoPago create(String applicationId, String applicationSecret, boolean sandbox){
        return new MercadoPagoTemplate(applicationId, applicationSecret, sandbox);
    }
}
