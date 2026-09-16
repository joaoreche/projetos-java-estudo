package fatec.poo.model;

/**
 * @author Jvz
 */
public class Instrutor extends Pessoa {

    private int identificacao;
    private String areaAtuacao;

    public Instrutor(int ident, String n, String tel) {
        super(n, tel);
        identificacao = ident;
    }

    public void setAreaAtuacao(String atuacao) {
        areaAtuacao = atuacao;
    }

    public int getIdentificacao() {
        return (identificacao);
    }

    public String getAreaAtuacao() {
        return (areaAtuacao);
    }
}
