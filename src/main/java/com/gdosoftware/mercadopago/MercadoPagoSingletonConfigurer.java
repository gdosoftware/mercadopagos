/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago;

import com.gdosoftware.mercadopago.api.MercadoPago;
import com.gdosoftware.mercadopago.api.impl.MercadoPagoTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

/**
 *
 * @author Dani
 */
public abstract class MercadoPagoSingletonConfigurer extends AbstractMercadoPagoConfigurer{
    
    @Bean
    public MercadoPago populateMercadoPagoSingleton(Environment env){
        return new MercadoPagoTemplate(getApplicationId(env),getApplicationSecret(env),getSandbox(env));
    }
}
