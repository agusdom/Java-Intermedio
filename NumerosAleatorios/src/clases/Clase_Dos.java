/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Random;

public class Clase_Dos {

    public static void main(String[] args) {
        int Aleatorio = 0;
        
        Random random = new Random();
        
        Aleatorio = (int) (random.nextDouble() * 100);
        System.out.println(Aleatorio);
    }
}
