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
public class Hilo2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print("E");
            
                   try {

                Hilo2.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error en la clase hilo1 " + ex);
            }
        }
    }
}
