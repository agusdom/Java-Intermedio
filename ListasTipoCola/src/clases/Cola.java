/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author agust
 */
public class Cola {
    private Nodo InicioCola,FinalCola;
    String Cola = "";
    
    public Cola(){
        InicioCola = null;
        FinalCola = null;
    }
    
    //Metodo para saber si la cola esta vacia
    public boolean ColaVacia(){
        if(InicioCola == null){
            return true;
        }else{
            return false;
        }
    }
    
    //Metodo para insertar a la cola
    public void Insertar(int informacion){
        Nodo Nuevo_Nodo = new Nodo();
        Nuevo_Nodo.informacion = informacion;
        Nuevo_Nodo.siguiente = null;
        
        if (ColaVacia()) {
            InicioCola = Nuevo_Nodo;
            FinalCola = Nuevo_Nodo;
        } else {
            FinalCola.siguiente = Nuevo_Nodo;
            FinalCola = Nuevo_Nodo;
        }
    }
    
    //Metodo para extraer de la cola
    public int Extraer(){
        if(!ColaVacia()){
            int Informacion = InicioCola.informacion;
            
            if (InicioCola == FinalCola) {
                InicioCola = null;
                FinalCola = null;
            } else {
                InicioCola = InicioCola.siguiente;
            }
            return Informacion;
        }else{
            return Integer.MAX_VALUE;
        }
    }
    
    //Metodo para mostrar el contenido de la cola
    public void MostrarContenido(){
        Nodo recorrido = InicioCola;
        String ColaInvertida = "";
        
        while(recorrido != null){
            Cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
        }
        
        String cadena[] = Cola.split(" ");
        
        for (int i = cadena.length - 1; i >= 0; i--) {
            ColaInvertida += " " + cadena[i];
        }
        
        JOptionPane.showMessageDialog(null, ColaInvertida);
        Cola = "";
    }
}
