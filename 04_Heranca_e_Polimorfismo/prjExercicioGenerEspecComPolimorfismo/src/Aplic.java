
/**
 * @author 0030482423057
 */
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

public class Aplic {

    public static void main(String[] args) {

        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                "Pedro Silveira",
                "14/05/1978",
                15.80);
        funcHor.setCargo("Programador Senior");
        funcHor.setQtdeHorTrab(90);
        System.out.println("\t--- HORISTA ---");
        System.out.println("Registro: " + funcHor.getRegistro());
        System.out.println("Nome: " + funcHor.getNome());
        System.out.println("Cargo: " + funcHor.getCargo());
        System.out.println("Data de admissao: " + funcHor.getDtAdmissao());
        System.out.println("Salario Bruto: " + funcHor.calcSalBruto());
        System.out.println("Desconto: " + funcHor.calcDesconto());
        System.out.println("Gratificacao: " + funcHor.calcGratificacao());
        System.out.println("Salario Liquido: " + funcHor.calcSalLiquido());

        FuncionarioMensalista funcMens = new FuncionarioMensalista(3232,
                "Joao Reche",
                "18/11/2005",
                1621);
        funcMens.setCargo("Vagabundo Senior");
        funcMens.setNumSalMin(2);
        System.out.println("\n\t--- MENSLAISTA ---");
        System.out.println("Registro: " + funcMens.getRegistro());
        System.out.println("Nome: " + funcMens.getNome());
        System.out.println("Cargo: " + funcMens.getCargo());
        System.out.println("Data de admissao: " + funcMens.getDtAdmissao());
        System.out.println("Salario Bruto: " + funcMens.calcSalBruto());
        System.out.println("Desconto: " + funcMens.calcDesconto());
        System.out.println("Salario Liquido: " + funcMens.calcSalLiquido());
    }

}
