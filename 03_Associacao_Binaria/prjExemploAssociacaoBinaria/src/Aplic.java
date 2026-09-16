
/**
 * @author Jvz
 */
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.Departamento;
import fatec.poo.model.Projeto;
import java.text.DecimalFormat;

public class Aplic {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,##0.00");

        // Instanciacao dos objetos das classes Horista, Mensalista e Comissionado
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                "Pedro Silveira",
                "14/05/1978",
                15.80);
        funcHor.setCargo("Programador");

        FuncionarioMensalista funcMens = new FuncionarioMensalista(3232,
                "Joao Reche",
                "18/11/2005",
                1621);
        funcMens.setCargo("Vagabundo");

        FuncionarioComissionado funcComiss = new FuncionarioComissionado(0202,
                "Ana Paula",
                "25/06/1982",
                10);
        funcComiss.setCargo("Analista");
        // instanciacao dos departamentos
        Departamento dep1 = new Departamento("cp", "Compras");
        Departamento dep2 = new Departamento("rh", "Recursos Humanos");

        /**
         * efetivando a ligacao entre um objeto da classe FuncionarioHorista com
         * o objeto da classe Departamento
         */
        funcHor.setDepartamento(dep1);
        System.out.println("Funcionario Horista " + funcHor.getNome()
                + " trabalha no departamento de " + funcHor.getDepartamento().getNome());
        /**
         * efetivando a ligacao entre um objeto da classe FuncionarioMensalista
         * com o objeto da classe Departamento
         */
        funcMens.setDepartamento(dep1);
        System.out.println("Funcionario Mensalista " + funcMens.getNome()
                + " trabalha no departamento de " + funcMens.getDepartamento().getNome());

        /**
         * efetivando a ligacao entre um objeto da classe
         * FuncionarioComissionado com o objeto da classe Departamento
         */
        funcComiss.setDepartamento(dep2);
        System.out.println("Funcionario Comissionado " + funcComiss.getNome()
                + " trabalha no departamento de " + funcComiss.getDepartamento().getNome());
        /**
         * efetivando a ligacao entre um objeto da classe Departamento com um ou
         * mais objetos da classe FuncionarioHorista, FuncionarioMensalista ou
         * FuncionarioComissionado
         */
        dep1.addFuncionario(funcHor);
        dep1.addFuncionario(funcMens);
        dep2.addFuncionario(funcComiss);

        // Exibindo lista de funcionarios armazenados no departamento 1
        dep1.listarFuncionarios();

        // Instanciacao de um objeto da classe Projeto
        Projeto objPrj = new Projeto(123, "Segurança no Trabalho");
        objPrj.setDtInicio("01/01/2001");
        objPrj.setDtTermino("02/02/2002");

        funcHor.setProjeto(objPrj);
        System.out.println("Funcionario Horista " + funcHor.getNome()
                + " esta alocado no projeto " + funcHor.getProjeto().getDescricao());
        funcMens.setProjeto(objPrj);
        System.out.println("Funcionario Mensalista " + funcMens.getNome()
                + " esta alocado no projeto " + funcMens.getProjeto().getDescricao());
        funcComiss.setProjeto(objPrj);
        System.out.println("Funcionario Comissionado " + funcComiss.getNome()
                + " esta alocado no projeto " + funcComiss.getProjeto().getDescricao());
        
        objPrj.addFuncionario(funcHor);
        objPrj.addFuncionario(funcMens);
        objPrj.addFuncionario(funcComiss);
        
        objPrj.listarFuncionarios();
    }
}
