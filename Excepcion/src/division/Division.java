/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package division;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class Division {

    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
            int Valor1, Valor2, Resultado;
            System.out.println("Dame el primer valor:");
            Valor1 = entrada.nextInt();
            System.out.println("Dame el segundo valor:");
            Valor2 = entrada.nextInt();
            Resultado = Valor1 / Valor2;
            System.out.println("El valor de la division es: " + Resultado);

        } catch (Exception e) {
            System.out.println("Error!!" + e);
        }finally{
            System.out.println("Operacion concluida");
        }
    }
}
