/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
import java.util.ArrayList;
import modelo.Tienda;

/**
 *
 * @author mati
 */
public class GestionFicheros {
    File raiz;
    ArrayList<Tienda>listaTienda=new ArrayList<>();

    public GestionFicheros(File raiz) {
        this.raiz = raiz;
    }
   
    
}
