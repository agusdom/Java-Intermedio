/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agust
 */
public class ClasePrincipal {

    public static void main(String[] args) {
        Hilo_Proceso hilo1 = new Hilo_Proceso();
        Hilo_Proceso hilo2 = new Hilo_Proceso();

        hilo1.start();
        try {
            hilo1.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Error en el hilo1 " + ex);
        }
                
        hilo2.start();
        hilo2.stop();
        
        try {
            hilo2.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo2 " + e);
        }
    }
}
