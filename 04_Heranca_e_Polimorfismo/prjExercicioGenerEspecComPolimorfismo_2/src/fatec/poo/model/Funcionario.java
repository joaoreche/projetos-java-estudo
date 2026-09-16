package fatec.poo.model;

/**
 * @author Jvz
 */
// Classe abstrata acontece sempre que houver um ou mais metodos abstratos
public abstract class Funcionario {

    private int registro;
    private String nome, dtAdmissao, cargo;

    public Funcionario(int r, String n, String dtAdm) {
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;
    }

    public int getRegistro() {
        return (registro);
    }

    public String getNome() {
        return (nome);
    }
    
    public void setCargo(String c) {
        cargo = c;
    }

    public String getCargo() {
        return (cargo);
    }

    public String getDtAdmissao() {
        return (dtAdmissao);
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
