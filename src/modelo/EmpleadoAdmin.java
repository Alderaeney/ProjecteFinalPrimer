/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author sportak
 */
public class EmpleadoAdmin extends Empleado {

    private int antiguedad;

    public EmpleadoAdmin(int antiguedad, int numEmpleado, String nombre, Double sueldo, String usuario, String contrasena) {
        super(numEmpleado, nombre, sueldo, usuario, contrasena);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + this.antiguedad;
    }

}
