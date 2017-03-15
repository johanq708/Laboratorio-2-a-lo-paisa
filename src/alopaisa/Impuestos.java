/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alopaisa;

/**
 * @since 12 de marzo de 2017
 * @author Johan Daniel Quiñonez Ruiz
 * @version 1.0
 */
public class Impuestos {
    private int vimp;
    private String nombreimp;
/**
 * constructor
 * @param vimp valor del impuesto
 * @param nombreimp nombre del impuesto
 */
    public Impuestos(int vimp, String nombreimp) {
        this.vimp = vimp;
        this.nombreimp = nombreimp;
    }
/**
 * @reurn valor del impuesto
 */
    public int getVimp() {
        return vimp;
    }

    public void setVimp(int vimp) {
        this.vimp = vimp;
    }
/**
 * @reurn nombre del impuesto
 */
    public String getNombreimp() {
        return nombreimp;
    }

    public void setNombreimp(String nombreimp) {
        this.nombreimp = nombreimp;
    }
    
}
