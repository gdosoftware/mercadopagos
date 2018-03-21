/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago.api.impl;

import com.gdosoftware.mercadopago.api.PaymentOperations;
import com.gdosoftware.mercadopago.domain.MPPayment;
import com.mercadopago.MP;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Dani
 */
public class PaymentTemplate extends AbstractMercadoPagoOperations implements PaymentOperations{

    public PaymentTemplate(MP mercadoPago, String rootUrl) {
        super(mercadoPago, rootUrl);
    }

    

    @Override
    public MPPayment getPayment(String paymentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MPPayment> searchPayment(Map<String, Object> filters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cancelPayment(String paymentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void refundPayment(String paymentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
