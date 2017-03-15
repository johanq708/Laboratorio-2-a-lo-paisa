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
public class Empleados {
    private String apellido;
    private int salario;
    private String cargo;
/**
 * constructor
 * @param apellido del empleado
 * @param salario del empleado
 * @param cargo del empleado
 */
    public Empleados(String apellido, int salario, String cargo) {
        this.apellido = apellido;
        this.salario = salario;
        this.cargo = cargo;
    }
/**
 * @return apellido del empleado
 */
    public String getApellido() {
        return apellido;
    }
/**
 * @return salario del empleado
 */
    public int getSalario() {
        return salario;
    }
/**
 * @return cargo del empleado
 */
    public String getCargo() {
        return cargo;
    }
    
}
