package fatec.poo.model;

/**
 * @author 0030482423057
 */
public class Participante extends Pessoa {

    private char tipo;

    public Participante(String cpf, String nome, char tipo) {
        super(cpf, nome);
        this.tipo = tipo;
    }

    public char getTipo() {
        return tipo;
    }
}
