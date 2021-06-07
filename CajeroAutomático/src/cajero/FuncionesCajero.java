/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

/**
 *
 * @author agust
 */
public class FuncionesCajero {

    private double Saldo = 500;

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    void MostrarSaldo() {
        System.out.println("--------------------------------");
        System.out.println("-Su saldo actual es de $" + this.getSaldo()+ "-");
        System.out.println("---------------------------------");
    }

    void RetirarSaldo(double dineroRetiro) {
        if (this.Saldo < dineroRetiro) {
            System.out.println("El dinero que intenta retirar es mayor a su saldo, por lo que no se puede realizar esta operaciones.Su Saldo actual es $" + this.Saldo);
        } else {
            setSaldo(Saldo - dineroRetiro);
        }
        MostrarSaldo();
    }

    void DepositarSaldo(double dineroDeposito) {
        setSaldo(Saldo + dineroDeposito);
                MostrarSaldo();
    }

}
