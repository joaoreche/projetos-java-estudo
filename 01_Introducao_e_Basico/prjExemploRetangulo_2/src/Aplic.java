
/**
 * @author 0030482423057
 */
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        int opcao;
        double medBase, medAltura;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a medida da base: ");
        medBase = entrada.nextDouble();

        System.out.print("\nDigite a medida da altura: ");
        medAltura = entrada.nextDouble();

        Retangulo objRet = new Retangulo();

        objRet.setBase(medBase);
        objRet.setAltura(medAltura);

        do {
            System.out.println("\n1. Consultar Area");
            System.out.println("2. Consultar Perimetro");
            System.out.println("3. Consultar Diagonal");
            System.out.println("4. Sair");

            System.out.print("\n\tDigite sua opcao: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nValor da Area: " + objRet.calcArea());
                    break;
                case 2:
                    System.out.println("\nValor do Perimetro: " + objRet.calcPerimetro());
                    break;
                case 3:
                    System.out.println("\nValor da Diagonal: " + objRet.calcDiagonal());
                    break;
            }

        } while (opcao != 4);

    }

}
