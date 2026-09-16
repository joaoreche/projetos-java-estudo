package fatec.poo.model;

/**
 * @author 0030482423057
 */
// Classe abstrata acontece sempre que houver um ou mais metodos abstratos
public abstract class Funcionario {

    private int registro;
    private String nome, dtAdmissao;

    public Funcionario(int r, String n, String dtAdm) {
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;
    }

    // Metodo abstrato
    // Apresenta apenas a assinatura
    abstract public double calcSalBruto();

    public double calcDesconto() {
        return (0.1 * calcSalBruto());
    }

    public double calcSalLiquido() {
        return (calcSalBruto() - calcDesconto());
    }
}
