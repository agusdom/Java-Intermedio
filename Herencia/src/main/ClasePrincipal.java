package main;

import operaciones.ClaseHija_Resta;
import operaciones.ClaseHija_Suma;

public class ClasePrincipal {

    public static void main(String[] args) {
        ClaseHija_Suma CHS = new ClaseHija_Suma();
        ClaseHija_Resta CHR = new ClaseHija_Resta();

        CHS.PedirDatos();
        CHS.Sumar();
        System.out.print("El resultado de la suma es:");
        CHS.MostrarResultado();

        CHR.PedirDatos();
        CHR.Restar();
        System.out.print("El resultado de la resta es:");
        CHR.MostrarResultado();

    }
}
