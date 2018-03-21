/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago.api;

import com.gdosoftware.mercadopago.domain.MPMerchant;

/**
 *
 * @author Dani
 */
public interface MerchantOperations {
    public MPMerchant getMerchant(Long merchantId);
}
