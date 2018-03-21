/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago.events;

import com.gdosoftware.mercadopago.api.MercadoPago;
import com.gdosoftware.mercadopago.domain.MPNotify;
import org.springframework.context.ApplicationEvent;

/**
 *
 * @author Daniel Gago
 */
public class AbstractMPNotificationsEvent  extends ApplicationEvent{
    
    protected MercadoPago mercadoPago;
    
    public AbstractMPNotificationsEvent(Object source, MercadoPago mercadoPago) {
        super(source);
        this.mercadoPago = mercadoPago;
    }
    
    public String getTopic(){
        return ((MPNotify) source).getTopic();
    }
    
    public String getResourceId(){
        return ((MPNotify) source).getId();
    }
    
}
