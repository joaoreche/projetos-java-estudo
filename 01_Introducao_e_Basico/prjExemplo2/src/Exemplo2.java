
/**
 * @author 0030482423057 *
 */
public class Exemplo2 {

    public static void main(String[] args) {
        int idade;
        double altura;
        char sexo;
        String nome;

        idade = 32;
        altura = 1.75;
        sexo = 'M';
        nome = "Pedro";

        System.out.print("Nome: " + nome);
        System.out.print("\nSexo: " + sexo);
        /**
         * o print nao ocupa a linha toda, somente o espaço necessario para o
         * conteudo, sendo necessario usar o \n para pular linha
         */
        System.out.print("\n");

        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        /**
         * o println ocupa a linha como um todo
         */

        System.out.println("Altura: " + altura);
        System.out.println("Idade: " + idade);
        /**
         * Aqui ocorre uma conversao implicita de tipos *
         */
    }

}
