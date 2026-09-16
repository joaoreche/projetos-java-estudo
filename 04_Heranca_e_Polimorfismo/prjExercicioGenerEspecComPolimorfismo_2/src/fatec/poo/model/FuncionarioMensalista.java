package fatec.poo.model;

/**
 * @author Jvz
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
