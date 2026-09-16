
/**
 * @author 0030482423057
 */
public class Aplic {

    public static void main(String[] args) {
        // definicao de ponteiro para um objeto
        Retangulo objRet;

        // instanciacao(alocacao) de um objeto da classe Retangulo
        objRet = new Retangulo();

        // passagem de mensagem | executando os metodos de atribuicao de valores
        objRet.setBase(8.0);
        objRet.setAltura(5.0);

        // executando os metodos de obtencao de valores atribuidos nos atributos
        System.out.println("Base = " + objRet.getBase());
        System.out.println("Altura = " + objRet.getAltura());

        // executando os metodos de calculo e exibindo no console
        System.out.println("Area = " + objRet.calcArea());
        System.out.println("Perimetro = " + objRet.calcPerimetro());

        // executando o metodo de calculo da diagonal do retangulo
        System.out.println("Diagonal = " + objRet.calcDiagonal()); 
    }

}
