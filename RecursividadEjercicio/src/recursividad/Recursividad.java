/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author agust
 */
public class Recursividad {
    public int Factorial(int parametro){
        if(parametro>0){
            int resultado = parametro * Factorial(parametro - 1);
            return resultado;
        }
        return 1;
    }
}
