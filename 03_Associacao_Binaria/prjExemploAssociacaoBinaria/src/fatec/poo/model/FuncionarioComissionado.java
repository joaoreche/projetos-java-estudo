package fatec.poo.model;

/**
 * @author Jvz
 */
public class FuncionarioComissionado extends Funcionario {

    private double salBase, taxaComissao, totalVendas;

    public FuncionarioComissionado(int r, String n, String dtAdm, double tax) {
        super(r, n, dtAdm);
        taxaComissao = tax;
    }

    public void setSalBase(double sal) {
        salBase = sal;
    }

    public double getSalBase() {
        return (salBase);
    }

    public double getTotalVendas() {
        return (totalVendas);
    }

    public double getTaxaComissao() {
        return (taxaComissao);
    }

    public void addVendas(double valVenda) {
        totalVendas += valVenda;
    }

    @Override
    public double calcSalBruto() {
        return (salBase + ((taxaComissao / 100) * totalVendas));
    }

    public double calcGratificacao() {
        if (totalVendas <= 5000) {
            return 0;
        } else if (totalVendas <= 10000) {
            return (calcSalBruto() * 0.03);
        } else {
            return (calcSalBruto() * 0.05);
        }
    }

    @Override
    public double calcSalLiquido() {
        return (super.calcSalLiquido() + calcGratificacao());
    }
}
