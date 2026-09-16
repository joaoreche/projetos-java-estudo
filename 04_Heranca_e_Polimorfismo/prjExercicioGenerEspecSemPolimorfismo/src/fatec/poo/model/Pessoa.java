package fatec.poo.model;

/**
 * @author Jvz
 */
public class Pessoa {

    private String nome, telefone;

    public Pessoa(String n, String tel) {
        nome = n;
        telefone = tel;
    }

    public String getNome() {
        return (nome);
    }

    public String getTelefone() {
        return (telefone);
    }
}
