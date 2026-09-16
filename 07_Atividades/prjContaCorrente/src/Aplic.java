
/**
 * @author Jvz
 */
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        int numConta, opcao;
        double saldoConta, valorDeposito, valorSaque;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o numero da conta: ");
        numConta = entrada.nextInt();

        System.out.print("Digite o saldo da conta: ");
        saldoConta = entrada.nextDouble();

        ContaCorrente objConta = new ContaCorrente(numConta, saldoConta);

        do {
            System.out.println("\n1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Sair");

            System.out.print("\n\tDigite sua opcao: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nNumero da conta: " + objConta.getNumero());
                    System.out.print("Digite o valor a ser depositado: ");
                    valorDeposito = entrada.nextDouble();
                    objConta.depositar(valorDeposito);
                    System.out.println("\nDeposito realizado com sucesso!");
                    break;
                case 2:
                    System.out.println("\nNumero da conta: " + objConta.getNumero());
                    System.out.print("Digite o valor a ser sacado: ");
                    valorSaque = entrada.nextDouble();
                    if (valorSaque > objConta.getSaldo()) {
                        System.out.println("\nSALDO INSUFICIENTE!");
                    } else {
                        objConta.sacar(valorSaque);
                        System.out.println("\nSaque realizado com sucesso!");
                    }
                    break;
                case 3:
                    System.out.println("\nNumero da conta: " + objConta.getNumero());
                    System.out.println("Saldo da conta: " + objConta.getSaldo());
                    break;
            }
        } while (opcao != 4);
    }

}
