/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.*;
import javax.swing.*;
import clases.Conexion;
import java.sql.*;

/**
 *
 * @author agust
 */
public class RegistrarClientes extends javax.swing.JFrame {

    String User;

    /**
     * Creates new form RegistrarClientes
     */
    public RegistrarClientes() {
        initComponents();
        User = Login.User;
        setTitle("Registrar nuevo cliente - Seccion de " + User);
        setLocationRelativeTo(null);
        setSize(530, 350);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        txt_Direccion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Clientes ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        jLabel2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        jLabel3.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono");
        jLabel4.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dirección");
        jLabel5.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registrar Cliente");
        jLabel6.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        txt_Nombre.setBackground(new java.awt.Color(153, 153, 255));
        txt_Nombre.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        txt_Email.setBackground(new java.awt.Color(153, 153, 255));
        txt_Email.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_Email.setForeground(new java.awt.Color(255, 255, 255));
        txt_Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, -1));

        txt_Telefono.setBackground(new java.awt.Color(153, 153, 255));
        txt_Telefono.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_Telefono.setForeground(new java.awt.Color(255, 255, 255));
        txt_Telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Telefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, -1));

        txt_Direccion.setBackground(new java.awt.Color(153, 153, 255));
        txt_Direccion.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_Direccion.setForeground(new java.awt.Color(255, 255, 255));
        txt_Direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Direccion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 210, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 120, 100));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int Validacion = 0;
        String Nombre, Email, Telefono, Direccion;

        Nombre = txt_Nombre.getText().trim();
        Email = txt_Email.getText().trim();
        Telefono = txt_Telefono.getText().trim();
        Direccion = txt_Direccion.getText().trim();

        if (Nombre.equals("")) {
            txt_Nombre.setBackground(Color.RED);
            Validacion++;
        }
        if (Email.equals("")) {
            txt_Email.setBackground(Color.RED);
            Validacion++;
        }
        if (Telefono.equals("")) {
            txt_Telefono.setBackground(Color.RED);
            Validacion++;
        }
        if (Direccion.equals("")) {
            txt_Direccion.setBackground(Color.RED);
            Validacion++;
        }

        if (Validacion == 0) {
            try {
                Connection cn = Conexion.Conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "insert into clientes values (?,?,?,?,?,?)");

                pst.setInt(1, 0);
                pst.setString(2, Nombre);
                pst.setString(3, Email);
                pst.setString(4, Telefono);
                pst.setString(5, Direccion);
                pst.setString(6, User);

                pst.executeUpdate();
                cn.close();

                Limpiar();

                txt_Nombre.setBackground(Color.GREEN);
                txt_Email.setBackground(Color.GREEN);
                txt_Telefono.setBackground(Color.GREEN);
                txt_Direccion.setBackground(Color.GREEN);

                JOptionPane.showMessageDialog(null, "Registro Exitoso.");
                this.dispose();

            } catch (SQLException e) {
                System.err.println("Error en registrar cliente. " + e);
                JOptionPane.showMessageDialog(null, "¡¡Error al registrar cliente!!, contacte al administrador.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JTextField txt_Direccion;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Telefono;
    // End of variables declaration//GEN-END:variables

    public void Limpiar() {
        txt_Nombre.setText("");
        txt_Email.setText("");
        txt_Telefono.setText("");
        txt_Direccion.setText("");
    }
}