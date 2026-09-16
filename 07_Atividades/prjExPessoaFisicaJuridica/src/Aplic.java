
/**
 * @author Jvz
 */
import java.util.Scanner;
import java.text.DecimalFormat;
import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;

public class Aplic {

    public static void main(String[] args) {

        int anoAtual = 2026, opcao, escolha = 0, anoInscricao;
        String nome;

        DecimalFormat df = new DecimalFormat("#,##0.00");

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("\n\t--- MENU ---");
            System.out.println("1 - Pessoa Fisica");
            System.out.println("2 - Pessoa Juridica");
            System.out.println("3 - Sair");
            System.out.print("\nDigite sua opcao: ");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.print("\nDigite seu cpf: ");
                String cpf = entrada.next();
                System.out.print("Digite seu nome: ");
                nome = entrada.next();
                System.out.print("Digite seu ano de incricao: ");
                anoInscricao = entrada.nextInt();

                PessoaFisica pf = new PessoaFisica(cpf, nome, anoInscricao);

                System.out.print("Digite o valor base: ");
                pf.setBase(entrada.nextDouble());
                System.out.print("Digite o valor de compra: ");
                pf.addCompras(entrada.nextDouble());
                while (escolha != 2) {
                    System.out.println("\n1 - Adicionar mais compras");
                    System.out.println("2 - Finalizar");
                    System.out.print("\nDigite sua opcao: ");
                    escolha = entrada.nextInt();

                    if (escolha == 1) {
                        System.out.print("\nDigite o valor da compra: ");
                        pf.addCompras(entrada.nextDouble());
                        System.out.println("Valor adicionado com sucesso!");
                    }
                }
                escolha = 0;

                System.out.println("Cpf: " + pf.getCpf());
                System.out.println("Nome: " + pf.getNome());
                System.out.println("Ano de Incricao: " + pf.getAnoInscricao());
                System.out.println("Valor Base: " + df.format(pf.getBase()));
                System.out.println("Total de Compras: " + df.format(pf.getTotalCompras()));
                System.out.println("Bonus: " + df.format(pf.calcBonus(anoAtual)));
            } else if (opcao == 2) {
                System.out.print("\nDigite seu cgc: ");
                String cgc = entrada.next();
                System.out.print("Digite seu nome: ");
                nome = entrada.next();
                System.out.print("Digite seu ano de incricao: ");
                anoInscricao = entrada.nextInt();

                PessoaJuridica pj = new PessoaJuridica(cgc, nome, anoInscricao);

                System.out.print("Digite o valor da taxa de incentivo: ");
                pj.setTaxaIncentivo(entrada.nextDouble());
                System.out.print("Digite o valor de compra: ");
                pj.addCompras(entrada.nextDouble());
                while (escolha != 2) {
                    System.out.println("\n1 - Adicionar mais compras");
                    System.out.println("2 - Finalizar");
                    System.out.print("\nDigite sua opcao: ");
                    escolha = entrada.nextInt();

                    if (escolha == 1) {
                        System.out.print("\nDigite o valor da compra: ");
                        pj.addCompras(entrada.nextDouble());
                        System.out.println("Valor adicionado com sucesso!");
                    }
                }
                escolha = 0;

                System.out.println("Cgc: " + pj.getCgc());
                System.out.println("Nome: " + pj.getNome());
                System.out.println("Ano de Incricao: " + pj.getAnoInscricao());
                System.out.println("Taxa de Incentivo: " + df.format(pj.getTaxaIncentivo()));
                System.out.println("Total de Compras: " + df.format(pj.getTotalCompras()));
                System.out.println("Bonus: " + df.format(pj.calcBonus(anoAtual)));
            }
        } while (opcao != 3);

    }

}
