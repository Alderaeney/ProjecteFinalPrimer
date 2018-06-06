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
public abstract class Empleado {

    protected int numEmpleado;
    protected String nombre;
    protected Double sueldo;
    protected String usuario;
    protected String contrasena;

    public Empleado(int numEmpleado, String nombre, Double sueldo, String usuario, String contrasena) {
        this.numEmpleado = numEmpleado;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    /*METODOS*/
 /*METODOS*/
    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return this.numEmpleado + "\t" + this.nombre + "\t" + this.usuario + "\t" + this.contrasena + "\t" + this.sueldo;
    }

}
