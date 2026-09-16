package fatec.poo.model;

/**
 * @author 0030482423057
 */
public class FuncionarioMensalista extends Funcionario {

    private double valSalMin, numSalMin;

    public FuncionarioMensalista(int r, String n, String dtAdm, double vsm) {
        super(r, n, dtAdm);
        valSalMin = vsm;
    }

    public void setNumSalMin(int nsm) {
        numSalMin = nsm;
    }

    @Override
    public double calcSalBruto() {
        return (valSalMin * numSalMin);
    }
}
