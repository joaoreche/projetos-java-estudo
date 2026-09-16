
/**
 * @author Jvz
 */
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        double medRaio;
        String unidade;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a medida do raio: ");
        medRaio = entrada.nextDouble();

        System.out.print("Digite a unidade de medida: ");
        unidade = entrada.next();

        Circulo objCir = new Circulo(unidade);

        objCir.setRaio(medRaio);

        System.out.println("\nRaio = " + objCir.getRaio() + " " + objCir.getUnidadeMedida());
        System.out.println("Area = " + objCir.calcArea() + " " + objCir.getUnidadeMedida() + "²");
        System.out.println("Perimetro = " + objCir.calcPerimetro() + " " + objCir.getUnidadeMedida());
        System.out.println("Diametro = " + objCir.calcDiametro() + " " + objCir.getUnidadeMedida());
    }

}
