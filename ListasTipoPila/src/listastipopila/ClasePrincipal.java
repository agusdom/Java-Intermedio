/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listastipopila;

import javax.swing.JOptionPane;

/**
 *
 * @author agust
 */
public class ClasePrincipal {

    public static void main(String[] args) {

        int opcion = 0, nodo = 0;
        Pila pila = new Pila();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de opciones\n\n"
                        + "1. Insertar Nodo\n"
                        + "2. Eliminar Nodo\n"
                        + "3. ¿La pila esta vacia?\n"
                        + "4. ¿Cual es el ultimo valor ingresado en la pila?\n"
                        + "5. ¿Cuantos nodos tiene la pila?\n"
                        + "6. Vaciar Pila\n"
                        + "7. Mostrar contenido de la Pila\n"
                        + "8. Salir\n\n"));

                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor ingresa el valor a guardar en el nodo"));
                        pila.InsertarNodo(nodo);
                        break;
                    case 2:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: " + pila.EliminarNodo());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;
                    case 3:
                        if (pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila no esta vacia.");
                        }
                        break;
                    case 4:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "El ultimo valor ingresado en la pila es " 
                                    + pila.MostrarUltimoValorIngresado());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene " + pila.TamañoPila() + " nodos.");
                        break;
                    case 6:
                        if (!pila.PilaVacia()) {
                            pila.VaciarPila();
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;
                    case 7:
                        pila.MostrarValores();
                        break;
                    case 8:
                        opcion = 8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelve intentar nuevamente.");
                        break;
                }
            } catch (NumberFormatException e) {
            }
        } while (opcion != 8);

    }
}
