
/**
 * @author Jvz
 */
public class ContaCorrente {

    private int numero;
    private double saldo;

    public ContaCorrente(int num, double pSaldo) {
        numero = num;
        saldo = pSaldo;
    }

    public int getNumero() {
        return (numero);
    }

    public double getSaldo() {
        return (saldo);
    }

    public void sacar(double valorSaque) {
         saldo -= valorSaque;
    }

    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
    }
}
