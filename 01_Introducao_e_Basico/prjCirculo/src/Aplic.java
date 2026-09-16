
/**
 * @author Jvz
 */
import java.util.Scanner;

public class Aplic {

    public static void main(String[] args) {
        double medRaio;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a medida do raio: ");
        medRaio = entrada.nextDouble();
        
        Circulo objCir = new Circulo();
        
        objCir.setRaio(medRaio);
        
        System.out.println("\nRaio = " + objCir.getRaio());
        System.out.println("Area = " + objCir.calcArea());
        System.out.println("Perimetro = " + objCir.calcPerimetro());
        System.out.println("Diametro = " + objCir.calcDiametro());
    }

}
