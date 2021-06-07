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

        int matriz_Uno[][] = new int[2][3];
        int matriz_Dos[][] = new int[3][2];
        int matriz_Resultante[][] = new int[2][2];

        //Llenado de la primera matriz
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz_Uno[i][j] = (int) (Math.random() * 5);
            }
        }

        //Llenado de la segunda matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz_Dos[i][j] = (int) (Math.random() * 5);
            }
        }

        //Multiplicación de matrices
        for (int i = 0; i < 4; i++) {
            if (matriz_Resultante[0][0] == 0) {
                int temporal = (matriz_Uno[0][0] * matriz_Dos[0][0])
                        + (matriz_Uno[0][1] * matriz_Dos[1][0])
                        + (matriz_Uno[0][2] * matriz_Dos[2][0]);

                matriz_Resultante[0][0] = temporal;
            } else if (matriz_Resultante[1][0] == 0) {
                int temporal = (matriz_Uno[1][0] * matriz_Dos[0][0])
                        + (matriz_Uno[1][1] * matriz_Dos[1][0])
                        + (matriz_Uno[1][2] * matriz_Dos[2][0]);

                matriz_Resultante[1][0] = temporal;
            } else if (matriz_Resultante[0][1] == 0) {
                int temporal = (matriz_Uno[0][0] * matriz_Dos[0][1])
                        + (matriz_Uno[0][1] * matriz_Dos[1][1])
                        + (matriz_Uno[0][2] * matriz_Dos[2][1]);

                matriz_Resultante[0][1] = temporal;
            } else if (matriz_Resultante[1][1] == 0) {
                {
                    int temporal = (matriz_Uno[1][0] * matriz_Dos[0][1])
                            + (matriz_Uno[1][1] * matriz_Dos[1][1])
                            + (matriz_Uno[1][2] * matriz_Dos[2][1]);

                    matriz_Resultante[1][1] = temporal;
                }
            }
}
            //Imprimir matrices
            for (int j = 0; j < 3; j++) {
                if (j < 2) {
                    for (int k = 0; k < 3; k++) {
                        System.out.print("[" + matriz_Uno[j][k] + "]");
                    }
                    if (j == 1) {
                        System.out.print("   x   ");
                    } else {
                        System.out.print("       ");
                    }
                } else {
                    System.out.print("                ");
                }

                for (int k = 0; k < 2; k++) {
                    System.out.print("[" + matriz_Dos[j][k] + "]");
                }
                if (j == 1) {
                    System.out.print("   =   ");
                } else {
                    System.out.print("       ");
                }

                if (j < 2) {
                    for (int k = 0; k < 2; k++) {
                        System.out.print("[" + matriz_Resultante[j][k] + "]");
                    }
                }
                System.out.println("");

            }
        
    }
}
