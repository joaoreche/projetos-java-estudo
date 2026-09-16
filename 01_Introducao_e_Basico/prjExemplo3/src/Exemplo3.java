
/**
 * @author 0030482423057
 */
public class Exemplo3 {

    public static void main(String[] args) {
        int num;
        
        num = ( int ) (Math.random() * 100);
        /**
         * O ( int ) eh um cast = modificador de acesso de enderecamento,
         * no caso acima, estou acessando um endereco double como um inteiro
         * eliminando problemas de compatibilide de tipos de variaveis/dados
         * 
         * O metodo random gera um numero entre 0 - 1 | ex -> 0.4876290061
         */
        if (num <= 50) {
            System.out.println("O numero " + num + " eh menor ou igual a 50");
        }
        else {
            System.out.println("O numero " + num + " eh maior que 50");
        }
    }

}
