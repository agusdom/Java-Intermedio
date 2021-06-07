/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Recursividad recursividadd = new Recursividad();
        System.out.print("Ingrese el numero para calcular el factorial:");
        int valor = entrada.nextInt();
        int factorial = recursividadd.Factorial(valor);
        System.out.println("El factorial de " + valor + " es " + factorial);
    }
}
