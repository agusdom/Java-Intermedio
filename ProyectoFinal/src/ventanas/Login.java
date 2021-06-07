/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import clases.Conexion;

/**
 *
 * @author agust
 */
public class Login extends javax.swing.JFrame {

    public static String User = "";
    String Pass = "";

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setSize(400, 550);
        setResizable(false);
        setTitle("Acceso al sistema");
        setLocationRelativeTo(null);

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();

        ImageIcon wallpaper_logo = new ImageIcon("src/images/DS.png");
        Icon icono_logo = new ImageIcon(wallpaper_logo.getImage().getScaledInstance(jLabel_Logo.getWidth(), jLabel_Logo.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Logo.setIcon(icono_logo);
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

        jLabel_Logo = new javax.swing.JLabel();
        txt_User = new javax.swing.JTextField();
        txt_Password = new javax.swing.JPasswordField();
        jButton_Acceder = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 270, 270));

        txt_User.setBackground(new java.awt.Color(153, 153, 255));
        txt_User.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_User.setForeground(new java.awt.Color(255, 255, 255));
        txt_User.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_User.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 330, 210, -1));

        txt_Password.setBackground(new java.awt.Color(153, 153, 255));
        txt_Password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_Password.setForeground(new java.awt.Color(255, 255, 255));
        txt_Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 370, 210, -1));

        jButton_Acceder.setBackground(new java.awt.Color(153, 153, 255));
        jButton_Acceder.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jButton_Acceder.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Acceder.setText("Acceder");
        jButton_Acceder.setBorder(null);
        jButton_Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AccederActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 420, 210, 35));

        jLabel_Wallpaper.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Wallpaper.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_Wallpaper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AccederActionPerformed
        // TODO add your handling code here:
        User = txt_User.getText().trim();
        Pass = txt_Password.getText().trim();

        if (!User.equals("") || !Pass.equals("")) {
            try {
                Connection cn = Conexion.Conectar();
                PreparedStatement pst = cn.prepareStatement("select Tipo_Nivel,Estatus from usuarios where User = '" + User 
                        + "' and Password = '" + Pass + "'");

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    String Tipo_nivel = rs.getString("Tipo_Nivel");
                    String Status = rs.getString("Estatus");

                    if (Tipo_nivel.equals("Administrador") && Status.equalsIgnoreCase("Activo")) {
                        dispose();
                        new Administrador().setVisible(true);
                    } else if (Tipo_nivel.equals("Capturista") && Status.equalsIgnoreCase("Activo")) {
                        dispose();
                        new Capturista().setVisible(true);
                    } else if (Tipo_nivel.equals("Tecnico") && Status.equalsIgnoreCase("Activo")) {
                        dispose();
                        new Tecnico().setVisible(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Datos de acceso incorrectos.");
                    txt_User.setText("");
                    txt_Password.setText("");
                }

            } catch (SQLException e) {
                System.err.println("Error en el boton Acceder." + e);
                JOptionPane.showMessageDialog(null, "¡¡Error al iniciar sesión!!, contacte con el administrador.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos.");
        }
    }//GEN-LAST:event_jButton_AccederActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Acceder;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_User;
    // End of variables declaration//GEN-END:variables

}
