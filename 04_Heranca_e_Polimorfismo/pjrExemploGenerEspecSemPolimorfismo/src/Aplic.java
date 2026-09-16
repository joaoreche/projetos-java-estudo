
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
import java.util.Scanner;

/**
 *
 * @author 0030482423016
 */
public class Aplic {

    public static void main(String[] args) {

        // instanciação do objeto e chamada do metodo construtor 
        Aluno objAlu = new Aluno(1010, "Oávio Augusto", "03/11/2005");
        Scanner entrada = new Scanner(System.in);

        objAlu.setMensalidade(1500); //passagem de mensagem 

        System.out.println("Registro escolar: " + objAlu.getRegEscolar());
        System.out.println("Nome: " + objAlu.getNome());
        System.out.println("Data de nascimento: " + objAlu.getData());
        System.out.println("Mensalidade: " + objAlu.getMensalidade());

        Professor objPrf = new Professor(2020, "Dimas", "01/01/0001");

        objPrf.setSalario(30000);

        System.out.println("Registro funcional: " + objPrf.getRegFuncional());
        System.out.println("Nome: " + objPrf.getNome());
        System.out.println("Data de nascimento: " + objPrf.getData());
        System.out.println("Salário: " + objPrf.getSalario());

    }

}
