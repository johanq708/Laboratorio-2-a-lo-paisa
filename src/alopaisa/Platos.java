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
public class Platos {
    private int precio;
    private String nombre;
    private Ingredientes ing;
/**
 * constructor
 * @param precio del plato
 * @param nombre del plato
 * @param ing ingredeinte del plato
 */
    public Platos() {
        this.precio = precio;
        this.nombre = nombre;
        this.ing = ing;
    }
/**
 * @return precio del plato
 */
    public int getPrecio() {
        return precio;
    }
/**
 * @return nombre del plato
 */
    public String getNombre() {
        return nombre;
    }
/**
 * @return ingredientes del plato
 */
    public Ingredientes getIng() {
        return ing;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIng(Ingredientes ing) {
        this.ing = ing;
    }
}
