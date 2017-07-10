/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author husey
 */
@ManagedBean
@RequestScoped
public class YonetimliBean implements Serializable{

    /**
     * Creates a new instance of YonetimliBean
     */
    private final Personel[] PERSONELS = new Personel[]{
        new Personel("1", "Hüseyin Aydın", new BigDecimal(5000), 23),
        new Personel("2", "Ceyda Koç", new BigDecimal(5500), 23),
        new Personel("3", "Eren Ertaş", new BigDecimal(3500), 23),
        new Personel("4", "Doğan Özdoğan", new BigDecimal(5100), 23)
    };
    public YonetimliBean() {
    }

    public Personel[] getPERSONELS() {
        return PERSONELS;
    }
    
    
}
