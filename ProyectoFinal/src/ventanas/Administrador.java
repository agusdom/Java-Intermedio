/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Conexion;
import java.awt.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author agust
 */
public class Administrador extends javax.swing.JFrame {

    String User, Nombre_Usuario;
    public static int Seccion_Usuario;

    public Administrador() {
        initComponents();
        User = Login.User;
        Seccion_Usuario = 1;
        setTitle("Administrador - Seccion de " + User);
        setLocationRelativeTo(null);
        setSize(650, 430);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

        try {
            Connection cn = Conexion.Conectar();
            PreparedStatement pst = cn.prepareStatement("select Nombre_Usuario from usuarios where User = '" + User + "'");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                Nombre_Usuario = rs.getString("Nombre_Usuario");
                jLabel_NombreUser.setText(Nombre_Usuario);
            } else {
                System.err.println("Error en conexión desde la interfaz Administrador.");
            }
        } catch (SQLException e) {
        }
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

        jLabel_NombreUser = new javax.swing.JLabel();
        jButton_RegistrarUser = new javax.swing.JButton();
        jButton_GestionarUser = new javax.swing.JButton();
        jButton_Capturista = new javax.swing.JButton();
        jButton_Tecnico = new javax.swing.JButton();
        jButton_AcercaDe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_NombreUser.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel_NombreUser.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_NombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton_RegistrarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addUser.png"))); // NOI18N
        jButton_RegistrarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarUserActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_RegistrarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, 100));

        jButton_GestionarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/informationuser.png"))); // NOI18N
        jButton_GestionarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GestionarUserActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_GestionarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 120, 100));

        jButton_Capturista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tecnico.png"))); // NOI18N
        jButton_Capturista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CapturistaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Capturista, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 120, 100));

        jButton_Tecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/capturista.png"))); // NOI18N
        jButton_Tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TecnicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Tecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, 100));

        jButton_AcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/geekipedia.png"))); // NOI18N
        getContentPane().add(jButton_AcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 120, 100));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestionar Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("A Cerca De");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Panel Vista Capturista");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Panel Vista Tecnico");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        jLabel_Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wallpaperPrincipal.jpg"))); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GestionarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GestionarUserActionPerformed
        // TODO add your handling code here:
        GestionarUsuarios gestionUser = new GestionarUsuarios();
        gestionUser.setVisible(true);
    }//GEN-LAST:event_jButton_GestionarUserActionPerformed

    private void jButton_RegistrarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarUserActionPerformed
        // TODO add your handling code here:
        RegistrarUsuarios registroUser = new RegistrarUsuarios();
        registroUser.setVisible(true);
    }//GEN-LAST:event_jButton_RegistrarUserActionPerformed

    private void jButton_TecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TecnicoActionPerformed
        // TODO add your handling code here:
        Capturista capturista = new Capturista();
        capturista.setVisible(true);
    }//GEN-LAST:event_jButton_TecnicoActionPerformed

    private void jButton_CapturistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CapturistaActionPerformed
        // TODO add your handling code here:
        Tecnico tecnico = new Tecnico();
        tecnico.setVisible(true);
    }//GEN-LAST:event_jButton_CapturistaActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AcercaDe;
    private javax.swing.JButton jButton_Capturista;
    private javax.swing.JButton jButton_GestionarUser;
    private javax.swing.JButton jButton_RegistrarUser;
    private javax.swing.JButton jButton_Tecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_NombreUser;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
