package fatec.poo.model;

/**
 * @author 0030482423016
 */
public class Pessoa {

    private String nome;
    private String dtNascimento;

    public Pessoa(String n, String dt) {
        nome = n;
        dtNascimento = dt;
    }

    public String getNome() {
        return (nome);
    }

    public String getData() {
        return (dtNascimento);
    }

}
