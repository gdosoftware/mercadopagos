/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago.events;

import com.gdosoftware.mercadopago.api.MercadoPago;
import com.gdosoftware.mercadopago.domain.MPMerchant;

/**
 *
 * @author Daniel Gago
 */
public class MerchantEvent extends AbstractMPNotificationsEvent{
    
    public MerchantEvent(Object source, MercadoPago mercadoPago) {
        super(source, mercadoPago);
    }
    
    public MPMerchant getMerchant(){
        return mercadoPago.getMerchantOperations().getMerchant(Long.parseLong(getResourceId()));
    }
    
}
