
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
        funcHor.setQtdeHorTrab(90);
        System.out.println("\t--- HORISTA ---");
        System.out.println("Salario Bruto: " + funcHor.calcSalBruto());
        System.out.println("Desconto: " + funcHor.calcDesconto());
        System.out.println("Salario Liquido: " + funcHor.calcSalLiquido());

        FuncionarioMensalista funcMens = new FuncionarioMensalista(3232,
                "Joao Reche",
                "18/11/2005",
                1621);
        funcMens.setNumSalMin(2);
        System.out.println("\t--- MENSLAISTA ---");
        System.out.println("Salario Bruto: " + funcMens.calcSalBruto());
        System.out.println("Desconto: " + funcMens.calcDesconto());
        System.out.println("Salario Liquido: " + funcMens.calcSalLiquido());
    }

}
