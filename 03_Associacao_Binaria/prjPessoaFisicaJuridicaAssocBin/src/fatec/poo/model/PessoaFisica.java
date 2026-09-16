package fatec.poo.model;

/**
 * @author Jvz
 */
public class PessoaFisica extends Pessoa {

    private String cpf;
    private double base;

    public PessoaFisica(String cpf, String nome, int anoInscricao) {
        super(nome, anoInscricao);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcBonus(int anoAtual) {
        if (getTotalCompras() > 12000) {
            return ((anoAtual - getAnoInscricao()) * base);
        } else {
            return 0;
        }
    }
}
