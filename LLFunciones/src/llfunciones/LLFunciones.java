/*
 *Clase para las funciones logicas de una lavadora
 */
package llfunciones;

/**
 *
 * @author agust
 */
public class LLFunciones {

    private int Kilos = 0, TipoRopa = 0, LlenadoCompleto = 0, LavadoCompleto = 0, SecadoCompleto = 0;

    public LLFunciones(int Kilos, int TipoRopa) {
        this.Kilos = Kilos;

        this.TipoRopa = TipoRopa;
    }

    private void Cargado() { //Este metodo sirve para cargar la lavadora
        if (Kilos <= 12) {
            System.out.println("Llenando...");
            LlenadoCompleto = 1;
            System.out.println("LLenado de la lavadora completo");
        } else {
            System.out.println("Has sobrepasado el tope de kilos de ropa, por favor reduce la carga");
        }
    }

    private void Lavado() { //Este metodo sirve para lavar
        Cargado();
        if (LlenadoCompleto == 1) {
            if (TipoRopa == 1) {
                System.out.println("Ropa blanca / Lavado suave");
                System.out.println("Lavando...");
                LavadoCompleto = 1;
            } else if (TipoRopa == 2) {
                System.out.println("Ropa de Color / Lavado intenso");
                System.out.println("Lavando...");
                LavadoCompleto = 1;
            } else {
                System.out.println("El tipo de ropa no esta disponible");
                System.out.println("Se lavara como ropa de Color / Lavado intenso");
                LavadoCompleto = 1;
            }
            System.out.println("Se ha completado el lavado de la ropa");
        }
    }

    private void Secado() { //Este metodo sirve para secar
        Lavado();
        if (LavadoCompleto == 1) {
            System.out.println("Secando...");
            SecadoCompleto = 1;
            System.out.println("Se ha completado el secado de la ropa");
        }
    }
    
    public void CicloFinalizado(){
        Secado();
        if(SecadoCompleto == 1){
            System.out.println("Tu ropa esta lista!...");
        }
    }
}
