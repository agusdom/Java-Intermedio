/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {

    private JTextField textField1;
    private JLabel label1;
    private JButton boton1;

    public Formulario() {
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label1 = new JLabel("Mensaje:");
        label1.setBounds(15, 10, 100, 30);
        add(label1);

        textField1 = new JTextField();
        textField1.setBounds(80, 16, 190, 20);
        add(textField1);

        boton1 = new JButton("Mostrar");
        boton1.setBounds(10, 60, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            
            JOptionPane.showMessageDialog(null, textField1.getText());
        }
    }
    
    public static void main(String[] args) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0, 0, 300, 150 );
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(false);
        formulario1.setVisible(true);
    }
}
