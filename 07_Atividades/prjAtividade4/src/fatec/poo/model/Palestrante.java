package fatec.poo.model;

/**
 * @author 0030482423057
 */
public class Palestrante extends Pessoa {

    private String empresa;
    private double taxaCobranca;
    private Palestra[] palestras;
    private int numPal;

    public Palestrante(String empresa, String cpf, String nome) {
        super(cpf, nome);
        this.empresa = empresa;
        palestras = new Palestra[2];
    }

    public String getEmpresa() {
        return empresa;
    }

    public double getTaxaCobranca() {
        return taxaCobranca;
    }

    public void setTaxaCobranca(double taxaCobranca) {
        this.taxaCobranca = taxaCobranca;
    }

    public void addPalestra(Palestra p) {
        palestras[numPal] = p;
        numPal++;
    }

    public double calcTotalReceberPalestras() {
        double totalReceber = 0;

        for (int i = 0; i < numPal; i++) {
            totalReceber += palestras[i].calcTotalFaturado()
                    - (palestras[i].calcTotalFaturado() * (taxaCobranca / 100));
        }
        return totalReceber;
    }
}
