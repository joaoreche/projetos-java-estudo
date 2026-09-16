package fatec.poo.model;

/**
 * @author 0030482423057
 */
public class PedidoCompra {

    private int num;
    private String dataPedido;
    private double valor;
    private Pessoa pessoa;

    public PedidoCompra(int num) {
        this.num = num;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public Pessoa getPessoa() {
        return pessoa;
    }
}
