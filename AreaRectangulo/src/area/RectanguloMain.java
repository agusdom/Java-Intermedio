/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class RectanguloMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame el valor de la base");
        float base = entrada.nextFloat();
        System.out.println("Dame el valor de la altura");
        float altura = entrada.nextFloat();
        Rectangulo rectangulo = new Rectangulo(base,altura);
        rectangulo.CalculoArea();
        
    }
}
