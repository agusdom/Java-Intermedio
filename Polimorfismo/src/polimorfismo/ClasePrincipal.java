package polimorfismo;

public class ClasePrincipal {

    public static void main(String[] args) {
        Operaciones_ClasePadre Mensajero_Suma = new Suma_ClaseHija();
        Operaciones_ClasePadre Mensajero_Resta = new Resta_ClaseHija();

        Mensajero_Suma.PedirDatos();
        Mensajero_Suma.Operaciones();
        System.out.print("El resultado de la suma es: ");
        Mensajero_Suma.MostrarResultado();

        Mensajero_Resta.PedirDatos();
        Mensajero_Resta.Operaciones();
        System.out.print("El resultado de la resta es: ");
        Mensajero_Resta.MostrarResultado();
    }
}
