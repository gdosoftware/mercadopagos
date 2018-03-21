/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago.api;

import com.gdosoftware.mercadopago.domain.MPPayment;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Dani
 */
public interface PaymentOperations {
    public MPPayment getPayment(String paymentId);
    public List<MPPayment> searchPayment(Map<String, Object> filters);
    public void cancelPayment(String paymentId);
    public void refundPayment(String paymentId);
}
