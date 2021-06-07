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
public class Conversiones {
    public static void main(String[] args) {
        double AnguloEnGrados = 45;
        
        double AnguloEnRadianes = Math.toRadians(AnguloEnGrados);
        System.out.println("Deg a Rad " + AnguloEnGrados + "° = " + AnguloEnRadianes + "Rad");
        
         AnguloEnGrados = Math.toDegrees(AnguloEnRadianes);
        System.out.println("Rad a Deg " + AnguloEnRadianes + " Rad = " + AnguloEnGrados + "°");
    }
}
