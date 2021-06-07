package suma;

public class Suma {

    int valorOne = 0, valorTwo = 0, resultado = 0;

    public Suma(int val_Uno, int val_Dos) {
        valorOne = val_Uno;
        valorTwo = val_Dos;
    }

    public void Resultado() {
        resultado = valorOne + valorTwo;
    }
    
    public void Imprimir(){
        System.out.println("El resultado de la suma es:" + resultado);
    }
}
