/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago.events;

import com.gdosoftware.mercadopago.api.MercadoPago;
import com.gdosoftware.mercadopago.domain.MPPayment;

/**
 *
 * @author Daniel Gago
 */
public class PaymentEvent extends AbstractMPNotificationsEvent{
    
    public PaymentEvent(Object source, MercadoPago mercadoPago) {
        super(source, mercadoPago);
    }
    
    public MPPayment getPayment(){
        return mercadoPago.getPaymentOperations().getPayment(getResourceId());
    }
    
}
