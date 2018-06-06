/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Excepciones.lineaFacturaExistente;
import Excepciones.lineaFacturaNoExistente;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author link
 */
public class Factura {

    private int idFact;
    private Cliente c;
    private Calendar fecha;
    private double importe;
    private MetodoPago mp;
    private ArrayList<LineaFactura> listaLineas = new ArrayList<>();

    public Factura(int idFact, Cliente c, Calendar fecha, double importe, MetodoPago mp) {
        this.idFact = idFact;
        this.c = c;
        this.fecha = fecha;
        this.importe = importe;
        this.mp = mp;
    }

    public int getIdFact() {
        return idFact;
    }

    public void setIdFact(int idFact) {
        this.idFact = idFact;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public ArrayList<LineaFactura> getListaLineas() {
        return listaLineas;
    }

    public void setListaLineas(ArrayList<LineaFactura> listaLineas) {
        this.listaLineas = listaLineas;
    }

    public MetodoPago getMp() {
        return mp;
    }

    public void setMp(MetodoPago mp) {
        this.mp = mp;
    }

    public LineaFactura buscarLineaDeFactura(int codLinea) {
        for (int i = 0; i < this.listaLineas.size(); i++) {
            if (this.listaLineas.get(i).getCodigoLinea() == codLinea) {
                return this.listaLineas.get(i);
            }
        }
        return null;
    }

    public void añadirLineaAFactura(LineaFactura lf) throws lineaFacturaExistente {
        if (this.buscarLineaDeFactura(lf.getCodigoLinea()) == null) {
            this.listaLineas.add(lf);
        } else {
            throw new lineaFacturaExistente(lf);
        }
    }

    public void eliminarLineaDeFactura(LineaFactura lf) throws lineaFacturaNoExistente {
        if (this.buscarLineaDeFactura(lf.getCodigoLinea()) != null) {
            this.listaLineas.remove(lf);
        } else {
            throw new lineaFacturaNoExistente(lf);
        }

    }

    @Override
    public String toString() {
        return this.c.toString() + "\t" + this.idFact + "\t" + this.fecha + "\t" + this.mp + "\t" + this.importe;
    }

}
