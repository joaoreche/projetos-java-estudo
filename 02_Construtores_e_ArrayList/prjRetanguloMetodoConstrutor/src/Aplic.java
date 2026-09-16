
/**
 * @author Jvz
 */
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double medAlt, medBase;
        int opcao;
        String unidade;

        System.out.print("Digite a unidade de medida: ");
        unidade = entrada.next();

        //Nao deixar o texto passar da area util
        //criação do ponteiro,
        //instanciação(alocação) de um objeto da classe Retangulo
        //e chamada do método construtor
        Retangulo objRet = new Retangulo(unidade);//recebe uma sequencia de caracteres, e passa p unidadeMed

        System.out.print("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        System.out.print("Digite a medida da base: ");
        medBase = entrada.nextDouble();

        //Passagem de mensagens
        //passagem de mensagens
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);

        System.out.println("Medida da altura: " + objRet.getAltura() + " " + objRet.getUnidadeMedida());
        System.out.println("Medida da base: " + objRet.getBase() + " " + objRet.getUnidadeMedida());
        System.out.println("Medida da area: " + objRet.calcArea() + " " + objRet.getUnidadeMedida() + "²");
        System.out.println("Medida do perimetro: " + objRet.calcPerimetro() + " " + objRet.getUnidadeMedida());
        System.out.println("Medida da diagonal: " + objRet.calcDiagonal() + " " + objRet.getUnidadeMedida());
    }
}
