/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

/**
 *
 * @author agust
 */
public class Rectangulo {

    public float base = 0, altura = 0, resultado = 0;

    public Rectangulo(float base, float altura) {
        this.base = base;

        this.altura = altura;
    }

    public void CalculoArea() {
        resultado = (base * altura);
        System.out.println("El resultado del area del rectangulo es: " + resultado);
    }
}
