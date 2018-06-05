/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author link
 */
public class Servicio extends Producto {
    
    private double tiempo;

    public Servicio(double tiempo, String nombre, String codigo, Double precio) {
        super(nombre, codigo, precio);
        this.tiempo = tiempo;
    }

    /*METODOS*/
    
    
    
    
    /*METODOS*/
    
    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
}
