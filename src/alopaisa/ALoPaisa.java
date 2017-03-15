/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alopaisa;
import java.util.Scanner;
/**
 * @since 12 de marzo de 2017
 * @author Johan Daniel Quiñonez Ruiz
 * @version 1.0
 */
public class ALoPaisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    Pagos pago1=new Pagos();
    Ganancias ganancia1=new Ganancias();
    Balance balance1=new Balance();
    pago1.pagodiario();
    System.out.println("el pago diario total es de "+pago1.darpagodiario());
    ganancia1.gananciadiario();
    System.out.println("la ganancia diaria total es de "+ganancia1.dargananciadiaria());
    System.out.println("el balance diario total es de "+balance1.darbalancediario());
    }  
}
