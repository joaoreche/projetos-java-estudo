
/**
 * @author 0030482423057
 */
public class Exemplo5 {

    public static void main(String[] args) {
        int cont = 1, num;

        num = (int) (Math.random() * 100);

        System.out.println("\tTABUADA DO " + num);
        while (cont <= 10) {
            System.out.println(num + " x " + cont + " = " + (cont * num));
            cont++;
        }
    }

}
