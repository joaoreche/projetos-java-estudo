package fatec.poo.model;

/**
 * @author Jvz
 */
public class PessoaJuridica extends Pessoa {

    private String cgc;
    private double taxaIncentivo;

    public PessoaJuridica(String cgc, String nome, int anoInscricao) {
        super(nome, anoInscricao);
        this.cgc = cgc;
    }

    public String getCgc() {
        return cgc;
    }

    public double getTaxaIncentivo() {
        return taxaIncentivo;
    }

    public void setTaxaIncentivo(double taxaIncentivo) {
        this.taxaIncentivo = taxaIncentivo;
    }

    @Override
    public double calcBonus(int anoAtual) {
        return (((taxaIncentivo / 100) * getTotalCompras()) * (anoAtual - getAnoInscricao()));
    }
}
