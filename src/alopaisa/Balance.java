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
public class Balance {
    private Ganancias ganancia;
    private Pagos pago;
/**
 * constructor
 * @param ganancia total
 * @param pago total
 */
    public Balance() {
        this.ganancia = ganancia;
        this.pago = pago;
    }
    /**
 * @return el balance total diario
 */
    public int darbalancediario(){
        return ganancia.dargananciadiaria()-pago.darpagodiario();
    }
    
}
