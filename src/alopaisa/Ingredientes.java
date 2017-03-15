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
public class Ingredientes {
    private int precio;
    private String nombre;
    private int cantidad;
/**
 * constructor
 * @param precio del ingrediente
 * @param nombre del ingrediente
 * @param cantidad del ingrediente
 */
    public Ingredientes() {
        this.precio = precio;
        this.nombre = nombre;
        this.cantidad=cantidad;
    }
/**
 * @return el precio
 */
    public int getPrecio() {
        return precio;
    }
/**
 * @return el nombre
 */
    public String getNombre() {
        return nombre;
    }
/**
 * @return la cantidad
 */
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
