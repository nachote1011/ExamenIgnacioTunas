/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ignacio;

/**
 *
 * @author admin
 */
public class Comercial {
    private String nombre;
    private double sueldo;
    private int num;
    private String fechanac;

    public Comercial(String nombre, double sueldo,int num,String fechanac) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.num=num;
        this.fechanach=fechanac;
    }

       @Override
    public String toString() {
        return "Comercial{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
}
