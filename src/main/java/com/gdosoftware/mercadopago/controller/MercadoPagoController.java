/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago.controller;

import com.gdosoftware.mercadopago.api.AfterPaymentResult;
import com.gdosoftware.mercadopago.api.MercadoPago;
import com.gdosoftware.mercadopago.domain.MPNotify;
import com.gdosoftware.mercadopago.domain.MPPaymentResult;
import com.gdosoftware.mercadopago.events.MerchantEvent;
import com.gdosoftware.mercadopago.events.PaymentEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Dani
 */
@Controller
@RequestMapping(value = "mp")
public class MercadoPagoController {
    
  
    
    @Autowired
    private ApplicationEventPublisher appEventPublisher;
    
    @Autowired
    private AfterPaymentResult afterPayment;
    
    @Autowired
    private MercadoPago mercadoPago;
    
    
    @RequestMapping(value = "success", method = RequestMethod.GET)
    public String success(@RequestParam("collection_id")String collectionId,
                          @RequestParam("collection_status")String collectionStatus,
                          @RequestParam("preference_id") String preferenceId,
                          @RequestParam("external_reference")String externalRef,
                          @RequestParam("payment_type") String paymentType,
                          @RequestParam("merchant_order_id") Long mercantId,
                          Model attr){
        
        MPPaymentResult paymentResult = new MPPaymentResult();
        paymentResult.setCollection_id(!collectionId.equals("null") ? Long.parseLong(collectionId) : null);
        paymentResult.setCollection_status(collectionStatus);
        paymentResult.setExternal_reference(externalRef);
        paymentResult.setMerchant_order_id(mercantId);
        paymentResult.setPayment_type(paymentType);
        paymentResult.setPreference_id(preferenceId);
        
       return afterPayment.onSuccess(paymentResult, attr);
    }
    
     @RequestMapping(value = "failure", method = RequestMethod.GET)
    public String failure(@RequestParam("collection_id")String collectionId,
                          @RequestParam("collection_status")String collectionStatus,
                          @RequestParam("preference_id") String preferenceId,
                          @RequestParam("external_reference")String externalRef,
                          @RequestParam("payment_type") String paymentType,
                          @RequestParam("merchant_order_id") Long mercantId,
                          Model attr){
        
        MPPaymentResult paymentResult = new MPPaymentResult();
        paymentResult.setCollection_id(!collectionId.equals("null") ? Long.parseLong(collectionId) : null);
        paymentResult.setCollection_status(collectionStatus);
        paymentResult.setExternal_reference(externalRef);
        paymentResult.setMerchant_order_id(mercantId);
        paymentResult.setPayment_type(paymentType);
        paymentResult.setPreference_id(preferenceId);
        
        return afterPayment.onFailure(paymentResult, attr);
    }
    
    @RequestMapping(value = "pending", method = RequestMethod.GET)
    public String pending(@RequestParam("collection_id")String collectionId,
                          @RequestParam("collection_status")String collectionStatus,
                          @RequestParam("preference_id") String preferenceId,
                          @RequestParam("external_reference")String externalRef,
                          @RequestParam("payment_type") String paymentType,
                          @RequestParam("merchant_order_id") Long mercantId,
                          Model attr){
        
        MPPaymentResult paymentResult = new MPPaymentResult();
        paymentResult.setCollection_id(!collectionId.equals("null") ? Long.parseLong(collectionId) : null);
        paymentResult.setCollection_status(collectionStatus);
        paymentResult.setExternal_reference(externalRef);
        paymentResult.setMerchant_order_id(mercantId);
        paymentResult.setPayment_type(paymentType);
        paymentResult.setPreference_id(preferenceId);
        
        return afterPayment.onPending(paymentResult, attr);
    }
    
    @RequestMapping(value = "notification", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity notifications(@RequestParam("topic") String topic,
                                                      @RequestParam("id") String id){
        
        MPNotify notify = new MPNotify(topic, id);
        switch(topic){
             case "merchant_order":
                 appEventPublisher.publishEvent(new MerchantEvent(notify, mercadoPago));
                 break;
             case "payment" :
                 appEventPublisher.publishEvent(new PaymentEvent(notify, mercadoPago));
                 break;
        }
       
         return new ResponseEntity<>(HttpStatus.OK);   
    }
    
}
