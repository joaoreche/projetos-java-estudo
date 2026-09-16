
/**
 * @author 0030482423057
 */
public class Livro {

    private int identificacao;
    private String titulo;
    private boolean situacao;
    private double valMultaDiaria;

    public Livro(int identLivro, String tituloLivro) {
        identificacao = identLivro;
        titulo = tituloLivro;
    }

    public void setValMultaDiaria(double valMulta) {
        valMultaDiaria = valMulta;
    }

    public int getIdentificacao() {
        return (identificacao);
    }

    public String getTitulo() {
        return (titulo);
    }

    public boolean getSituacao() {
        return (situacao);
    }

    public void emprestar() {
        situacao = true;
    }

    public double devolver(int diasAtraso) {
        situacao = false;
        return (valMultaDiaria * diasAtraso);
    }
}
