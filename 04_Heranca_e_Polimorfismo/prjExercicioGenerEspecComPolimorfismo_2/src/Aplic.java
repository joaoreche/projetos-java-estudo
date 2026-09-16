
/**
 * @author Jvz
 */
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.FuncionarioComissionado;
import java.text.DecimalFormat;

public class Aplic {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,##0.00");

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
        System.out.println("Salario Bruto: " + df.format(funcHor.calcSalBruto()));
        System.out.println("Desconto: " + df.format(funcHor.calcDesconto()));
        System.out.println("Gratificacao: " + df.format(funcHor.calcGratificacao()));
        System.out.println("Salario Liquido: " + df.format(funcHor.calcSalLiquido()));

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
        System.out.println("Salario Bruto: " + df.format(funcMens.calcSalBruto()));
        System.out.println("Desconto: " + df.format(funcMens.calcDesconto()));
        System.out.println("Salario Liquido: " + df.format(funcMens.calcSalLiquido()));

        FuncionarioComissionado funcComiss = new FuncionarioComissionado(0202,
                "Ana Paula",
                "25/06/1982",
                10);

        funcComiss.setCargo("Vendedora de roupas");
        funcComiss.setSalBase(5000);
        funcComiss.addVendas(8000);

        System.out.println("\n\t--- COMISSIONADO ---");
        System.out.println("Registro: " + funcComiss.getRegistro());
        System.out.println("Nome: " + funcComiss.getNome());
        System.out.println("Cargo: " + funcComiss.getCargo());
        System.out.println("Data de admissao: " + funcComiss.getDtAdmissao());
        System.out.println("Salario Bruto: " + df.format(funcComiss.calcSalBruto()));
        System.out.println("Desconto: " + df.format(funcComiss.calcDesconto()));
        System.out.println("Gratificacao: " + df.format(funcComiss.calcGratificacao()));
        System.out.println("Salario Liquido: " + df.format(funcComiss.calcSalLiquido()));
    }

}
