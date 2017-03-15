/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alopaisa;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @since 12 de marzo de 2017
 * @author Johan Daniel Quiñonez Ruiz
 * @version 1.0
 */
public class Ganancias {
    Scanner teclado=new Scanner(System.in);
    private ArrayList<Platos> platos;
    private int gdiario=0;
/**
 * constructor
 * @param platos registra los platos vendidos
 * @param gdiario el valor total de las ganancias diario
 */
    public Ganancias() {
        this.platos = new ArrayList<>();
        this.gdiario=gdiario;
    }
    /**
 * funcion agragar plato, para agregar un plato al arreglo
 */
    public void agregarplato(Platos platos){
    this.platos.add(platos);
}
    /**
     * funcion ganancia diario para ingresar los platos vendidos y asignarle su valor
     * @param t guarda si se va a registrar otro plato o no
     * @param n guarda el nombre del plato
     * @param v guarada el valor del plato
     */
    public void gananciadiario(){
        int t=1;
        while(t==1){
            System.out.println("ingrese el nombre del plato que se vendio hoy?");
            String n=teclado.next();
            System.out.println("¿cual es el valor del plato vendido?");
            int v=teclado.nextInt();
            Platos plato=new Platos();
            plato.setNombre(n);
            plato.setPrecio(v);
            this.agregarplato(plato);
            System.out.println("¿va a ingresar otro plato? 1=si, otro numero=no");
            t=teclado.nextInt();
        }
    }
    /**
 * @return la ganancia total diaria
 */
    public int dargananciadiaria(){
        for(int i=0;i<platos.size();i++){
            gdiario+=platos.get(i).getPrecio();
        }
        return gdiario;
    }
}
