/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author agust
 */
public class ClasePrincipal {

    public static void main(String[] args) {
        int matriz_Uno[][] = new int[3][3];
        int matriz_Dos[][] = new int[3][3];
        int matriz_Resultante[][] = new int[3][3];

        //Llenado de la primer Matiz
        for (int i = 0; i < matriz_Uno.length; i++) {
            for (int j = 0; j < matriz_Uno.length; j++) {
                matriz_Uno[i][j] = (int) (Math.random() * 5);
            }
        }

        //Llenado de la segunda Matriz
        for (int i = 0; i < matriz_Dos.length; i++) {
            for (int j = 0; j < matriz_Dos.length; j++) {
                matriz_Dos[i][j] = (int) (Math.random() * 5);
            }
        }

        //Suma o Resta de Matrices
        for (int i = 0; i < matriz_Uno.length; i++) {
            for (int j = 0; j < matriz_Uno.length; j++) {
                matriz_Resultante[i][j] = matriz_Uno[i][j] + matriz_Dos[i][j];
                //matriz_Resultante[i][j] = matriz_Uno[i][j] - matriz_Dos[i][j];
            }
        }

        //Imprimir Matrices
        for (int i = 0; i < matriz_Uno.length; i++) {
            for (int j = 0; j < matriz_Uno.length; j++) {
                System.out.print("[" + matriz_Uno[i][j] + "]");
            }

            if (i == 1) {
                System.out.print("   +   ");
            } else {
                System.out.print("       ");
            }

            for (int j = 0; j < matriz_Dos.length; j++) {
                System.out.print("[" + matriz_Dos[i][j] + "]");
            }
            
            if (i == 1) {
                System.out.print("   =   ");
            } else {
                System.out.print("       ");
            }
            
            for (int j = 0; j < matriz_Resultante.length; j++) {
                System.out.print("[" + matriz_Resultante[i][j] + "]");
            }

            System.out.println("");
        }
    }
}
