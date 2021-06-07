/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author agust
 */
public class Recursividad {
    public void Imprimir(int x){
        if(x<=5){
            System.out.print(x + " ");
            Imprimir(x+1);
        }
    }
}
