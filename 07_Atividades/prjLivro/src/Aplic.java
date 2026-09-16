
/**
 * @author 0030482423057
 */
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {

        int identLivro, opcao, diasAtraso;
        double valMulta, valPagar;
        String tituloLivro;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o numero de identificacao do livro: ");
        identLivro = entrada.nextInt();

        entrada.nextLine();
        /**
         * limpa o buffer, pois o ENTER da entrada de dados acima fica no buffer
         * e o nextLine() le esse \n (ENTER) e pula para a proxima entrada de
         * dados
         */

        System.out.print("Digite o titulo do livro: ");
        tituloLivro = entrada.nextLine();

        System.out.print("Digite o valor da multa diaria: ");
        valMulta = entrada.nextDouble();

        Livro objLivro = new Livro(identLivro, tituloLivro);

        objLivro.setValMultaDiaria(valMulta);

        do {
            System.out.println("\n1. Consultar Livro");
            System.out.println("2. Emprestar Livro");
            System.out.println("3. Devolver Livro");
            System.out.println("4. Sair");

            System.out.print("\n\tDigite sua opcao: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nNumero de identificacao: " + objLivro.getIdentificacao());
                    System.out.println("Titulo: " + objLivro.getTitulo());

                    if (objLivro.getSituacao()) {
                        System.out.println("Esse livro esta emprestado!");
                    } else {
                        System.out.println("Esse livro esta disponivel!");
                    }
                    break;
                case 2:
                    if (objLivro.getSituacao()) {
                        System.out.println("\nO livro ja esta emprestado!");
                    } else {
                        objLivro.emprestar();
                        System.out.println("\nOperacao de emprestimo realizada com sucesso!");
                    }
                    break;
                case 3:
                    if (objLivro.getSituacao()) {
                        System.out.print("\nDigite o numero de dias de atraso na devolucao: ");
                        diasAtraso = entrada.nextInt();
                        valPagar = objLivro.devolver(diasAtraso);
                        System.out.println("\nOperacao de devolucao realizada com sucesso!");
                        if (diasAtraso > 0) {
                            System.out.println("Valor da multa por atraso: " + valPagar);
                        }
                    } else {
                        System.out.println("\nO livro ja esta disponivel!");
                    }
                    break;
            }
        } while (opcao != 4);
    }

}
