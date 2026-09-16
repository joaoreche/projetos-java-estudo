package fatec.poo.model;

/**
 * @author 0030482423057
 */
public class Pessoa {
    
    private String cpf, nome;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}
