
/**
 * @author Jvz
 */
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {

        int opcao, ra;
        double ntP1, ntP2, ntT1, ntT2;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o RA do aluno: ");
        ra = entrada.nextInt();
        System.out.print("Digite a nota da primeira prova: ");
        ntP1 = entrada.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        ntP2 = entrada.nextDouble();
        System.out.print("Digite a nota do primeiro trabalho: ");
        ntT1 = entrada.nextDouble();
        System.out.print("Digite a nota do segundo trabalho: ");
        ntT2 = entrada.nextDouble();

        Aluno objAluno = new Aluno();

        objAluno.setRA(ra);
        objAluno.setNtPrv1(ntP1);
        objAluno.setNtPrv2(ntP2);
        objAluno.setNtTrab1(ntT1);
        objAluno.setNtTrab2(ntT2);

        do {
            System.out.println("\n1. Exibir Nota das Provas/Trabalhos");
            System.out.println("2. Exibir Media das Provas/Trabalhos");
            System.out.println("3. Exibir Media Final");
            System.out.println("4. Sair");

            System.out.print("\n\tDigite a opcao: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("RA: " + objAluno.getRA());
                    System.out.println("Nota da primeira prova: " + objAluno.getNtPrv1());
                    System.out.println("Nota da segunda prova: " + objAluno.getNtPrv2());
                    System.out.println("Nota do primeiro trabalho: " + objAluno.getNtTrab1());
                    System.out.println("Nota do segundo trabalho: " + objAluno.getNtTrab2());
                    break;
                case 2:
                    System.out.println("RA: " + objAluno.getRA());
                    System.out.println("Media das provas: " + objAluno.calcMediaProva());
                    System.out.println("Media dos trabalhos: " + objAluno.calcMediaTrab());
                    break;
                case 3:
                    System.out.println("RA: " + objAluno.getRA());
                    System.out.println("Media final: " + objAluno.calcMediaFinal());
                    break;
            }
        } while (opcao != 4);

    }

}
