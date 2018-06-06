/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.File;
<<<<<<< HEAD:src/controlador/GestionTienda.java
import java.io.PrintWriter;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Producto;
=======
import java.util.ArrayList;
import modelo.Tienda;
>>>>>>> master:src/controlador/GestionFicheros.java

/**
 *
 * @author mati
 */
<<<<<<< HEAD:src/controlador/GestionTienda.java
public class GestionTienda {
    
    private File carpeta;
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;
    private ArrayList<Producto> productos;

    public GestionTienda(File carpeta) {
        this.carpeta = carpeta;
        this.empleados = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.productos = new ArrayList<>();
    }
    
    /*METODOS*/
    
    public void crearEstructuraDeDatos() throws Exception{
        if (!carpeta.exists()) {
            if (!carpeta.mkdir()){
                throw new Exception("ERROR. No se puede crear la carpeta de la tienda.");
            }
        }
        
        if (!carpeta.isDirectory()) {
            throw new Exception("Error Fatal. La ruta para guardar los archivos no es un directrio.");
        }
        
        File fileEmpleados = new File(carpeta.getAbsolutePath()+"/empleados");
        
        if (!fileEmpleados.exists()) {
            if (!fileEmpleados.mkdir()){
                throw new Exception("ERROR. No se puede crear la carpeta de empleados.");
            }
            
        } else {
            Boolean encontrado = false;
            for(Empleado emp : this.empleados){
                for (File file : fileEmpleados.listFiles()){
                    if (file.getName().contains(emp.getDni())) {
                        encontrado = true;
                    }
                }
                if (encontrado) {
                    PrintWriter pw = new PrintWriter(new File(fileEmpleados.getAbsolutePath() + "/" + emp.getDni() + ".csv"));
                    pw.println(emp.formatear());
                    pw.close();
                }
                encontrado = false;
            }
        }
        
        
    }
=======
public class GestionFicheros {

    File raiz;
    ArrayList<Tienda>listaTienda=new ArrayList<>();
   
>>>>>>> master:src/controlador/GestionFicheros.java
    
    
    /*METODOS*/

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
