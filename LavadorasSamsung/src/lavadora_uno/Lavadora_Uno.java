/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavadora_uno;

import java.util.Scanner;
import libreria.LLFunciones;

/**
 *
 * @author agust
 */
public class Lavadora_Uno {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de kilos de ropa que desea lavar");
        int Kilos = entrada.nextInt();
        System.out.println("Ingrese el tipo de ropa que desea lavar:(1-Ropa Blanca / 2-Ropa Color)");
        int ColorRopa = entrada.nextInt();
        LLFunciones lavadora = new LLFunciones(Kilos, ColorRopa);
        System.out.println("El tipo de ropa es:" + lavadora.getTipoRopa());
        lavadora.CicloFinalizado();
    }
}
