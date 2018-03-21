/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago.api;

import com.gdosoftware.mercadopago.domain.MPPaymentResult;
import java.util.Map;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Daniel Gago
 */
public interface AfterPaymentResult {
    /**
     * 
     * @param result resultado del pago
     * @param attributes mapa de atributos que seran inyectados en el modelo 
     * @return pagina de redireccion despues del proceso
     */
    public String onSuccess(MPPaymentResult result, Model attributes);
    public String onPending(MPPaymentResult result, Model attributes);
    public String onFailure(MPPaymentResult result, Model attributes);
}
