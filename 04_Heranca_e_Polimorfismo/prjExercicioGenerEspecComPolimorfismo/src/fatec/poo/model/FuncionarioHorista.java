package fatec.poo.model;

/**
 * @author 0030482423057
 */
public class FuncionarioHorista extends Funcionario {

    private double valHorTrab, gratificacao;
    private int qtdeHorTrab;

    public FuncionarioHorista(int r, String n, String dtAdm, double vht) {
        super(r, n, dtAdm);
        valHorTrab = vht;
    }

    public void setQtdeHorTrab(int qht) {
        qtdeHorTrab = qht;
    }

    @Override
    public double calcSalBruto() {
        return (valHorTrab * qtdeHorTrab);
    }

    public double calcGratificacao() {
        return (calcSalBruto() * 0.075);
    }

    @Override
    public double calcSalLiquido() {
        return (super.calcSalLiquido() + calcGratificacao());
    }
}
