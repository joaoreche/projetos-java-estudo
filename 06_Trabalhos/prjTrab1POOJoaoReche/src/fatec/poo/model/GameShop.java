package fatec.poo.model;

/**
 * @author JoaoReche
 */
public class GameShop {

    private int codigo, idade, saldo;
    private String nome;
    private boolean tipoGamer;

    public GameShop(int codigo, String nome, boolean tipoGamer, int saldo) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipoGamer = tipoGamer;
        this.saldo = saldo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public boolean isTipoGamer() {
        return tipoGamer;
    }

    public void jogarHoras(int horasJogadas) {
        saldo -= horasJogadas;
    }

    public void comprarHoras(int horasCompradas) {
        if (tipoGamer) {
            saldo += horasCompradas + (horasCompradas / 3);
        } else {
            saldo += horasCompradas;
        }
    }

    public void brinde() {
        saldo = saldo * 2;
    }
}
