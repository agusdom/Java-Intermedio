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
public class Pila {

    private Nodo UltimoValorIngresado;
    int Tamano = 0;
    String Lista = "";

    public Pila() {
        UltimoValorIngresado = null;
        Tamano = 0;
    }

    //Metodo para saber cuando la pila esta vacia
    public boolean PilaVacia() {
        return UltimoValorIngresado == null;
    }

    //Metodo para insertar un nodo en la pila
    public void InsertarNodo(int nodo) {
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nodo;
        Tamano++;
    }

    //Metodo para eliminar un nodo en la pila
    public int EliminarNodo() {
        int auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        Tamano--;
        return auxiliar;
    }

    //Metodo para conocer cual es el ultimo valor ingresado
    public int MostrarUltimoValorIngresado() {
        return UltimoValorIngresado.informacion;
    }

    //Metodo para conocer el tamaño de la Pila
    public int TamañoPila() {
        return Tamano;
    }

    //Metodo para vaciar la pila
    public void VaciarPila() {
        while (!PilaVacia()) {
            EliminarNodo();
        }
    }
    
    //Metodo para mostrar el contenido de la pila
    public void MostrarValores(){
        Nodo recorrido = UltimoValorIngresado;
        
        while (recorrido != null) {            
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }

}
