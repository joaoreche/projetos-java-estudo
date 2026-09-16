package fatec.poo.model;

/**
 * @author Jvz
 */
public abstract class Pessoa {
    
    private String nome;
    private int anoInscricao;
    private double totalCompras;

    public Pessoa(String nome, int anoInscricao) {
        this.nome = nome;
        this.anoInscricao = anoInscricao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoInscricao() {
        return anoInscricao;
    }

    public double getTotalCompras() {
        return totalCompras;
    }
    
    public void addCompras(double valorCompra) {
        totalCompras += valorCompra;
    }
    
    abstract public double calcBonus(int anoAtual);
}
