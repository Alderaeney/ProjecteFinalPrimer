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
public class LineaFactura {
    
    private Producto producto;
    private int cantidad;
    private Double coste;

    public LineaFactura(Producto producto, int cantidad, Double coste) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.coste = coste;
    }

    /*METODOS*/
    
    
    
    
    /*METODOS*/
    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getCoste() {
        return coste;
    }

    public void setCoste(Double coste) {
        this.coste = coste;
    }
}
