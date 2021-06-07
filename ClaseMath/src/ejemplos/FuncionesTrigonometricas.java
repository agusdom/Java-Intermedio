/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author agust
 */
public class FuncionesTrigonometricas {

    public static void main(String[] args) {

        double resultado = 0;
        double AnguloEnGrados = 45;
        double AnguloEnRadianes = Math.toRadians(AnguloEnGrados);

        //Seno
        resultado = Math.sin(AnguloEnRadianes);
        System.out.println("Seno de " + AnguloEnGrados + "° = " + resultado);
        //Coseno
        resultado = Math.cos(AnguloEnRadianes);
        System.out.println("Coseno de " + AnguloEnGrados + "° = " + resultado);
        //Tangente
        resultado = Math.tan(AnguloEnRadianes);
        System.out.println("Tangente de " + AnguloEnGrados + "° = " + resultado);

        double ValorIngresado = 0.707;

        //Arco seno
        AnguloEnRadianes = Math.asin(ValorIngresado);
        AnguloEnGrados = Math.toDegrees(AnguloEnRadianes);
        System.out.println("Arco seno de " + ValorIngresado + " = " + AnguloEnGrados + "°");
        //Arco coseno
        AnguloEnRadianes = Math.acos(ValorIngresado);
        AnguloEnGrados = Math.toDegrees(AnguloEnRadianes);
        System.out.println("Arco coseno de " + ValorIngresado + " = " + AnguloEnGrados + "°");
        //Arco tangente
        AnguloEnRadianes = Math.atan(ValorIngresado);
        AnguloEnGrados = Math.toDegrees(AnguloEnRadianes);
        System.out.println("Arco tangente  de " + ValorIngresado + " = " + AnguloEnGrados + "°");

    }
}
