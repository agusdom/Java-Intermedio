
package clases;

public class Proceso extends Thread{
    int num_entero;
    
    public Proceso(String NombreHilo){
        super(NombreHilo);
        
    }
    
    
    @Override
    public void run() {
        for (int i = 0; i <= num_entero ; i++) {
            System.out.println(i + " " + this.getName());
        }
        System.out.println("");
    }
    
    public void ValorDeLaCondiccion(int valor){
        this.num_entero = valor;
    }
    
}
