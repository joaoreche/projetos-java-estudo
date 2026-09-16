package fatec.poo.model;

/**
 * @author Jvz
 */
// Classe abstrata acontece sempre que houver um ou mais metodos abstratos
public abstract class Funcionario {

    private int registro;
    private String nome, dtAdmissao, cargo;
    private Departamento departamento;
    /**
     * ponteiro que permite armazenar o endereco de um objeto da classe
     * Departamento multiplicidade 1
     */
    private Projeto projeto;

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

    //retorna o endereco de um objeto da classe Departamento
    public Departamento getDepartamento() {
        return departamento;
    }

    // tem como parametro de entrada o endereco de um objeto da classe Projeto
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    //retorna o endereco de um objeto da classe Departamento
    public Projeto getProjeto() {
        return projeto;
    }

    // tem como parametro de entrada o endereco de um objeto da classe Projeto
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
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
