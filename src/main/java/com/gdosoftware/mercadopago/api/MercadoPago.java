/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago.api;

/**
 *
 * @author Dani
 */
public interface MercadoPago {
    public PreferenceOperations getPreferenceOperations();
    public MerchantOperations getMerchantOperations();
    public PaymentOperations getPaymentOperations();
}
