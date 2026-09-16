
/**
 * @author Jvz
 */
import java.util.Scanner;
import fatec.poo.model.Instrutor;
import fatec.poo.model.Cliente;

public class Aplic {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\t-- INSTRUTOR ENTRADA--");
        System.out.print("Digite o numero de identificacao: ");
        int numIdent = entrada.nextInt();
        System.out.print("Digite o nome: ");
        String nome = entrada.next();
        System.out.print("Digite o telefone: ");
        String telefone = entrada.next();
        System.out.print("Digite a area de atuacao: ");
        String atuacao = entrada.next();

        Instrutor objInstr = new Instrutor(numIdent, nome, telefone);

        objInstr.setAreaAtuacao(atuacao);

        System.out.println("\n\t-- INSTRUTOR SAIDA--");
        System.out.println("Numero de identificacao: " + objInstr.getIdentificacao());
        System.out.println("Nome: " + objInstr.getNome());
        System.out.println("Telefone: " + objInstr.getTelefone());
        System.out.println("Area de Atuacao: " + objInstr.getAreaAtuacao());

        System.out.println("\n\t-- CLIENTE ENTRADA--");
        System.out.print("Digite o CPF: ");
        String cpf = entrada.next();
        System.out.print("Digite o nome: ");
        String n = entrada.next();
        System.out.print("Digite o telefone: ");
        String tel = entrada.next();
        System.out.print("Digite o peso: ");
        double peso = entrada.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = entrada.nextDouble();

        Cliente objCliente = new Cliente(cpf, nome, tel);

        objCliente.setPeso(peso);
        objCliente.setAltura(altura);

        System.out.println("\n\t-- CLIENTE SAIDA--");
        System.out.println("CPF: " + objCliente.getCpf());
        System.out.println("Nome: " + objCliente.getNome());
        System.out.println("Telefone: " + objCliente.getTelefone());
        System.out.println("Peso: " + objCliente.getPeso());
        System.out.println("Altura: " + objCliente.getAltura());
    }

}
