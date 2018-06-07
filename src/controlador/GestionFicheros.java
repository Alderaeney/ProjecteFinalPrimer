/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Excepciones.clienteExistente;
import Excepciones.clienteNoExistente;
import java.io.File;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Tienda;

/**
 *
 * @author mati
 */
public class GestionFicheros {

    File raiz;
    static ArrayList<Tienda> listaTienda = new ArrayList<>();

    public GestionFicheros(File raiz) {
        this.raiz = raiz;
    }

    public File getRaiz() {
        return raiz;
    }

    public void setRaiz(File raiz) {
        this.raiz = raiz;
    }

    public static ArrayList<Tienda> getListaTienda() {
        return listaTienda;
    }

    public static void setListaTienda(ArrayList<Tienda> listaTienda) {
        GestionFicheros.listaTienda = listaTienda;
    }

    public static void añadirTienda(Tienda t) {
        listaTienda.add(t);
    }

}
