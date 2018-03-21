/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdosoftware.mercadopago.api;

import com.gdosoftware.mercadopago.domain.MPItem;
import com.gdosoftware.mercadopago.domain.MPPreference;

/**
 *
 * @author Dani
 */
public interface PreferenceOperations {
    public MPPreference createPreference(MPPreference preference);
    public MPPreference getPreference(String preferenceId);
    public MPPreference updatePreference(String preferenceId, MPPreference preference);
}
