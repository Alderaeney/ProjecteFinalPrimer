/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author link
 */
public class Factura {
    
    private String nombreCliente;
    private Calendar fecha;
    private ArrayList<LineaFactura> lineas;

    public Factura(String nombreCliente, Calendar fecha) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.lineas = new ArrayList<>();
    }

    /*METODOS*/
    
    
    
    
    /*METODOS*/
    
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public ArrayList<LineaFactura> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<LineaFactura> lineas) {
        this.lineas = lineas;
    }
}
