package operaciones;

import java.util.Scanner;

public class ClasePadre {

    protected int valor_Uno, valor_Dos, resultado;
    Scanner entrada = new Scanner(System.in);
    
    //Este metodo pide los valores al usuario
    public void PedirDatos(){
        System.out.print("Dame el primer valor: ");
        valor_Uno = entrada.nextInt();
        System.out.print("Dame el segundo valor: ");
        valor_Dos = entrada.nextInt();
    }
    
    //Este metodo muestra el resultado
    public void MostrarResultado(){
        System.out.println(resultado);
    }
}
