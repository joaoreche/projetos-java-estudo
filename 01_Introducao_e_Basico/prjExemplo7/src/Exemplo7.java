
/**
 * @author 0030482423057
 */
public class Exemplo7 {

    public static void main(String[] args) {
        int[] tabNum;

        tabNum = new int[3];

        tabNum[0] = 34;
        tabNum[1] = 19;
        tabNum[2] = 7;

        for (int cont = 0; cont < 3; cont++) {
            System.out.print("Conteudo de tabNum[" + cont + "] = ");
            System.out.println(tabNum[cont]);
        }
    }

}
