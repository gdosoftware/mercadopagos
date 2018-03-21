/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago;

import com.gdosoftware.mercadopago.api.AfterPaymentResult;
import com.gdosoftware.mercadopago.api.MercadoPago;
import com.gdosoftware.mercadopago.api.impl.MercadoPagoTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

/**
 *
 * @author Dani
 */
public abstract class AbstractMercadoPagoConfigurer {
    
    
    public abstract String getApplicationId(Environment env);
    public abstract String getApplicationSecret(Environment env);
    public abstract boolean getSandbox(Environment env);
    public abstract String getRootUrl(Environment env);
    public abstract AfterPaymentResult getAfterPaymentProcess();   
    
    public MercadoPago populateMercadoPago(Environment env){
        return new MercadoPagoTemplate(getApplicationId(env), 
                                       getApplicationSecret(env), 
                                       getSandbox(env));
    }
    
    @Bean
    public AfterPaymentResult populateAfterPaymentResult(){
        return getAfterPaymentProcess();
    }
    
    @Bean(name = "rootUrl")
    public String populateRootUrl(Environment env){
        return getRootUrl(env);
    }
}
