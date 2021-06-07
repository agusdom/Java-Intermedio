/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FuncionesCajero funciones = new FuncionesCajero();
        Menu(funciones);
    }

    public static void Menu(FuncionesCajero funciones) {
        Scanner entrada = new Scanner(System.in);
        int opciones = 0;
        boolean Salir = false;
        while (!Salir) {
            System.out.println("Elija la operacion a realizar: ");
            System.out.println("1-Mostrar Saldo.");
            System.out.println("2-Retirar efectivo.");
            System.out.println("3-Depositar efectivo.");
            System.out.println("4-Salir");
            opciones = entrada.nextInt();
            switch (opciones) {
                case 1:
                    System.out.println("------------------------------");
                    System.out.println("-Su saldo actual es de $" + funciones.getSaldo() + "-");
                    System.out.println("------------------------------");
                    break;
                case 2:
                    double dineroRetiro = 0;
                    System.out.println("Cuanto dinero desea retirar?");
                    dineroRetiro = entrada.nextDouble();
                    funciones.RetirarSaldo(dineroRetiro);
                    break;
                case 3:
                    double dineroDeposito = 0;
                    System.out.println("Cuanto dinero desea depositar?");
                    dineroDeposito = entrada.nextDouble();
                    funciones.DepositarSaldo(dineroDeposito);
                    break;
                case 4:
                    Salir = true;
                    System.out.println("Muchas gracias. Vuelva pronto");
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta");
                    break;
            }
        }
    }

}
