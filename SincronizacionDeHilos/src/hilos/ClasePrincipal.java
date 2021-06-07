/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author agust
 */
public class ClasePrincipal {

    public static void main(String[] args) {
        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();
        Hilo3 hilo3 = new Hilo3();
        Hilo4 hilo4 = new Hilo4();

        hilo1.start();
        try {
            hilo1.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error en el Hilo 1 " + e);
        }
        hilo2.start();
        try {
            hilo2.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error en el Hilo 2 " + e);
        }

        hilo3.start();
        try {
            hilo3.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error en el Hilo 3 " + e);
        }
        hilo4.start();
        try {
            hilo4.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error en el Hilo 4 " + e);
        }
    }
}
