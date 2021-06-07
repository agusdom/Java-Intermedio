/*
  Creado por Dominguez, Agustín
  Version: 1.0
  Creado el dia de hoy 24/02/2021
*/
package inversopalabras;

import java.util.Scanner;

public class InversoPalabras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabra = "", palabraInv = "";
        int longitudPalabra = 0;
        System.out.println("Ingrese frase ha invertir");
        palabra = entrada.nextLine();
        longitudPalabra = palabra.length();//Cuenta el numero de caracteres de palabra y guarda la cantidad de caracteres en longitudPalabra.
        while (longitudPalabra > 0) {
            palabraInv += palabra.substring(longitudPalabra - 1, longitudPalabra);
            longitudPalabra--;

        }
            System.out.print("Frase invertida:" +palabraInv);
            System.out.println("");
    }

}
