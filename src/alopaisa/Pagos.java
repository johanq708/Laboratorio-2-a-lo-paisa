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
public class Pagos {
    Scanner teclado=new Scanner(System.in);
    private int pdiario=0;
    private ArrayList<Ingredientes>ingp;
    private ArrayList<Impuestos>imp;
    private ArrayList<Empleados>emp;
/**
 * constructor
 * @param ingp guarda los ingredientes comprados
 * @param emp guarda los empleados pagados
 * @param imp guarda los impuestos pagados
 * @param pdiario guarda el valor diario total pagado
 */
    public Pagos() {
        this.ingp = new ArrayList<>();
        this.imp = new ArrayList<>();
        this.emp = new ArrayList<>();
        this.pdiario = pdiario;
    }
 /**
 * funcion pagodiario pregunta todos los gastos diarios y asigna valores para luego sumarlos en el valor total diario
 * @param t guarda si se va a registrar la compra de un ingrediente
 * @param t1 guarda si se va a registrar el pago a algún empleado
 * @param t2 guarda si se va a registrar algun impuesto
 * @param s guarda el nombre del ingrediente
 * @param c guarda la cantidad de ingrediente
 * @param v guarda el valor del ingrediente
 * @param s guarda el nombre del empleado
 * @param c guarda el cargo del empleado
 * @param v guarda el valor del salario pagado al empleado
 * @param c guarda el nombre del impuesto
 * @param v guarda el valor del impuesto
 */
    public void pagodiario(){
    System.out.println("Se compraron ingredientes hoy 1=si, otro numero=no?");
    int t=teclado.nextInt();
    while(t==1){
        Ingredientes ingn=new Ingredientes();
        System.out.println("¿Que ingrediente se compro?");
        String s=teclado.next();
        System.out.println("¿cuanta cantidad se compro?");
        int c=teclado.nextInt();
        System.out.println("¿cuanto valio el ingrediente?");
        int v=teclado.nextInt();
        ingn.setNombre(s);
        ingn.setCantidad(c);
        ingn.setPrecio(v);
        this.ingp.add(ingn);
        System.out.println("¿Se compro algun otro ingrediente? 1=si, otro numero=no");
        t=teclado.nextInt();
    }
    System.out.println("¿Se hizo el pago a algun empleado hoy? 1=si, otro numero=no");
    int t1=teclado.nextInt();
    while(t1==1){
        System.out.println("¿A quien se le pago?");
        String s=teclado.next();
        System.out.println("¿que cargo tiene?");
        String c=teclado.next();
        System.out.println("¿cuanto se le pago?");
        int v=teclado.nextInt();
        Empleados empn=new Empleados(s,v,c);
        this.emp.add(empn);
        System.out.println("¿Se le pago al otro empleado? 1=si, otro numero=no");
        t1=teclado.nextInt();
    }
    System.out.println("¿Se pago algun impuesto hoy? 1=si, otro numero=no");
    int t2=teclado.nextInt();
    while(t2==1){
        System.out.println("¿Que impuesto se pago?");
        String i=teclado.next();
        System.out.println("¿cuanto se le pago?");
        int v=teclado.nextInt();
        Impuestos impn=new Impuestos(v,i);
        this.imp.add(impn);
        System.out.println("¿Se pago otro impuesto? 1=si, otro numero=no");
        t2=teclado.nextInt();
    }
}
/**    
* @return el valor diario total pagado
 */
    public int darpagodiario(){
        for(int i=0;i<ingp.size();i++){
            pdiario+=ingp.get(i).getPrecio();
        }
        for(int i=0;i<emp.size();i++){
            pdiario+=emp.get(i).getSalario();
        }
        for(int i=0;i<imp.size();i++){
            pdiario+=imp.get(i).getVimp();
        }
        return pdiario;
    }
}
