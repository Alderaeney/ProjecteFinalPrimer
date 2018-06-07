/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author link
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    private boolean loginExitoso = false;

    public home() {
        initComponents();
        this.estadoVisual.setBackground(Color.red);
        this.informeEstado.setForeground(Color.white);
        this.jLabel3.setForeground(Color.white);
        this.jLabel4.setForeground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        desconexion = new javax.swing.JButton();
        jTextPane2 = new javax.swing.JPasswordField();
        estadoVisual = new javax.swing.JPanel();
        informeEstado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuClientes = new javax.swing.JMenu();
        menuCrearCliente = new javax.swing.JMenuItem();
        menuEliminarCliente = new javax.swing.JMenuItem();
        menuModificarCliente = new javax.swing.JMenu();
        menuModificarClienteNombre = new javax.swing.JMenuItem();
        menuModificarClienteTelefono = new javax.swing.JMenuItem();
        menuModificarClienteDireccion = new javax.swing.JMenuItem();
        menuEmpleados = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        menuFacturas = new javax.swing.JMenu();
        menuServicios = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        /*
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));

        jLabel6.setText("NetBeans IDE 8.2");

        jLabel7.setText("Build 201609300101");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(304, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addComponent(jLabel7))
        );
        */
        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel3.setText("Login:");

        jScrollPane2.setViewportView(jTextPane1);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel4.setText("Password:");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        desconexion.setText("Desconectarse");
        desconexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desconexionActionPerformed(evt);
            }
        });

        estadoVisual.setBackground(new java.awt.Color(255, 0, 51));
        estadoVisual.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        estadoVisual.setEnabled(false);

        javax.swing.GroupLayout estadoVisualLayout = new javax.swing.GroupLayout(estadoVisual);
        estadoVisual.setLayout(estadoVisualLayout);
        estadoVisualLayout.setHorizontalGroup(
            estadoVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        estadoVisualLayout.setVerticalGroup(
            estadoVisualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(desconexion, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(estadoVisual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(informeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(9, 9, 9)
                        .addComponent(jTextPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(desconexion)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(estadoVisual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(informeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuClientes.setText("Clientes");

        menuCrearCliente.setText("Crear Cliente");
        menuCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCrearClienteActionPerformed(evt);
            }
        });
        menuClientes.add(menuCrearCliente);

        menuEliminarCliente.setText("Eliminar Cliente");
        menuEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarClienteActionPerformed(evt);
            }
        });
        menuClientes.add(menuEliminarCliente);

        menuModificarCliente.setText("Modificar Cliente");

        menuModificarClienteNombre.setText("Nombre");
        menuModificarClienteNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModificarClienteNombreActionPerformed(evt);
            }
        });
        menuModificarCliente.add(menuModificarClienteNombre);

        menuModificarClienteTelefono.setText("Telefono");
        menuModificarClienteTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModificarClienteTelefonoActionPerformed(evt);
            }
        });
        menuModificarCliente.add(menuModificarClienteTelefono);

        menuModificarClienteDireccion.setText("Direccion");
        menuModificarClienteDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuModificarClienteDireccionActionPerformed(evt);
            }
        });
        menuModificarCliente.add(menuModificarClienteDireccion);

        menuClientes.add(menuModificarCliente);

        jMenuBar1.add(menuClientes);

        menuEmpleados.setText("Empleados");

        jMenuItem6.setText("Crear Empleado");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuEmpleados.add(jMenuItem6);

        jMenuItem7.setText("Eliminar Empleado");
        menuEmpleados.add(jMenuItem7);

        jMenu2.setText("Modificar Empleado");

        jMenuItem8.setText("Nombre");
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Sueldo");
        jMenu2.add(jMenuItem9);

        menuEmpleados.add(jMenu2);

        jMenuItem10.setText("Modo Administrador");
        menuEmpleados.add(jMenuItem10);

        jMenuBar1.add(menuEmpleados);

        menuFacturas.setText("Facturas");
        jMenuBar1.add(menuFacturas);

        menuServicios.setText("Productos");

        jMenuItem11.setText("Piezas");
        menuServicios.add(jMenuItem11);

        jMenuItem12.setText("Ordenadores");
        menuServicios.add(jMenuItem12);

        jMenuItem13.setText("Servicios");
        menuServicios.add(jMenuItem13);

        jMenuBar1.add(menuServicios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        if (this.buscarUsuario(this.jTextPane1.getText(), this.jTextPane2.getText())) {
            System.out.println("LOGIN CORRECTO");
            this.loginExitoso = true;
            this.jTextPane1.setText("");
            this.jTextPane2.setText("");
            actualizar();
        } else {
            System.out.println("CREDENCIALES INCORRECTAS");
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void desconexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desconexionActionPerformed
        this.loginExitoso = false;
        actualizar();
    }//GEN-LAST:event_desconexionActionPerformed

    private void menuCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCrearClienteActionPerformed
        if (this.loginExitoso) {
            vista.CrearCliente crearCliente = new vista.CrearCliente();
            crearCliente.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "DEBES LOGEARTE ANTES DE PONER USAR LAS FUNCIONALIDADES");
        }
    }//GEN-LAST:event_menuCrearClienteActionPerformed

    private void menuEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarClienteActionPerformed
        if (this.loginExitoso) {
            vista.EliminarCliente eliminarCliente = new vista.EliminarCliente();
            eliminarCliente.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "DEBES LOGEARTE ANTES DE PONER USAR LAS FUNCIONALIDADES");
        }
    }//GEN-LAST:event_menuEliminarClienteActionPerformed

    private void menuModificarClienteNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModificarClienteNombreActionPerformed
        if (this.loginExitoso) {
            vista.ModificarClienteNombre modifClienteNombre = new vista.ModificarClienteNombre();
            modifClienteNombre.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "DEBES LOGEARTE ANTES DE PONER USAR LAS FUNCIONALIDADES");
        }
    }//GEN-LAST:event_menuModificarClienteNombreActionPerformed

    private void menuModificarClienteTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModificarClienteTelefonoActionPerformed
        if (this.loginExitoso) {
            vista.ModificarClienteTelefono modifClienteTelefono = new vista.ModificarClienteTelefono();
            modifClienteTelefono.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "DEBES LOGEARTE ANTES DE PONER USAR LAS FUNCIONALIDADES");
        }
    }//GEN-LAST:event_menuModificarClienteTelefonoActionPerformed

    private void menuModificarClienteDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuModificarClienteDireccionActionPerformed
        if (this.loginExitoso) {
            vista.ModificarClienteDireccion modifClienteDireccion = new vista.ModificarClienteDireccion();
            modifClienteDireccion.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "DEBES LOGEARTE ANTES DE PONER USAR LAS FUNCIONALIDADES");
        }
    }//GEN-LAST:event_menuModificarClienteDireccionActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        if (this.loginExitoso) {
            vista.CrearEmpleado crearEmpleado = new vista.CrearEmpleado();
            crearEmpleado.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "DEBES LOGEARTE ANTES DE PONER USAR LAS FUNCIONALIDADES");
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private boolean buscarUsuario(String usuario, String pass) {
        File ficheroAbuscar = new File("usuarios.txt");
        String linea;
        String[] arrayAnalizado;
        try {
            Scanner sc = new Scanner(ficheroAbuscar);
            while (sc.hasNext()) {
                linea = sc.next();
                arrayAnalizado = linea.split(";");
                //System.out.println("COMPARANDO "+usuario+" CON "+usuario.length()+" CARACTERES VS "+arrayAnalizado[0]+" DE "+arrayAnalizado[0].length()+" CARACTERES");
                if (arrayAnalizado[0].equalsIgnoreCase(usuario) && arrayAnalizado[1].equalsIgnoreCase(pass)) {
                    //System.out.println("HAY COINCIDENCIA");
                    return true;
                }
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    private void actualizar() {
        if (this.loginExitoso == true) {
            this.estadoVisual.setBackground(Color.green);
            this.informeEstado.setText("Conexion garantizada!");
        } else {
            this.informeEstado.setText("");
            this.estadoVisual.setBackground(Color.red);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new home().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton desconexion;
    private javax.swing.JPanel estadoVisual;
    private javax.swing.JLabel informeEstado;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPasswordField jTextPane2;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenuItem menuCrearCliente;
    private javax.swing.JMenuItem menuEliminarCliente;
    private javax.swing.JMenu menuEmpleados;
    private javax.swing.JMenu menuFacturas;
    private javax.swing.JMenu menuModificarCliente;
    private javax.swing.JMenuItem menuModificarClienteDireccion;
    private javax.swing.JMenuItem menuModificarClienteNombre;
    private javax.swing.JMenuItem menuModificarClienteTelefono;
    private javax.swing.JMenu menuServicios;
    // End of variables declaration//GEN-END:variables
}
