package fatec.poo.model;

import java.util.ArrayList;

/**
 * @author 0030482423057
 */
public class Palestrante extends Pessoa {

    private String empresa;
    private double taxaCobranca;
    private ArrayList<Palestra> palestras;

    public Palestrante(String cpf, String nome, String empresa) {
        super(cpf, nome);
        this.empresa = empresa;
        palestras = new ArrayList<Palestra>();
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
        palestras.add(p);
    }

    public double calcTotalReceberPalestras() {
        double totalReceber = 0;

        for (int i = 0; i < palestras.size(); i++) {
            totalReceber += palestras.get(i).calcTotalFaturado();
        }
        return totalReceber - (totalReceber * (taxaCobranca / 100));
    }
}
