/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
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
@RequestMapping("/mp")
public class MercadoPagoController {
    
    @Value("${com.gdosoftware.mercadopago.successpage}")
    private String successUrl;  
    @Value("${com.gdosoftware.mercadopago.failurepage}")
    private String failureUrl;  
    @Value("${com.gdosoftware.mercadopago.pendingpage}")
    private String pendingUrl; 
    
    @Autowired
    private ApplicationEventPublisher appEventPublisher;
    
    
    @RequestMapping(value = "success", method = RequestMethod.GET)
    public String success(RedirectAttributes attr){
        return "redirect:"+successUrl;
    }
    
     @RequestMapping(value = "failure", method = RequestMethod.GET)
    public String failure(RedirectAttributes attr){
        return "redirect:" + failureUrl;
    }
    
    @RequestMapping(value = "pending", method = RequestMethod.GET)
    public String pending(RedirectAttributes attr){
        return "redirect:" + pendingUrl;
    }
    
    @RequestMapping(value = "notification", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity failure(){
         return new ResponseEntity<>(HttpStatus.OK);   
    }
    
}
