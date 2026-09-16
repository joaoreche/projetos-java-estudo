
/**
 * @author 0030482423057
 */
public class Exemplo6 {

    public static void main(String[] args) {
        int cont = 1, num;

        num = (int) (Math.random() * 100);

        System.out.println("\tTABUADA DO " + num);
        do {
            System.out.println(num + " x " + cont + " = " + (cont * num));
            cont++;
        } while (cont <= 10);
    }

}
