package fatec.poo.model;

import java.util.ArrayList;

/**
 * @author Jvz
 */
public abstract class Pessoa {

    private String nome;
    private int anoInscricao;
    private double totalCompras;
    private ArrayList<PedidoCompra> pedidoCompra;

    public Pessoa(String nome, int anoInscricao) {
        this.nome = nome;
        this.anoInscricao = anoInscricao;
        pedidoCompra = new ArrayList<PedidoCompra>();
    }

    public String getNome() {
        return nome;
    }

    public int getAnoInscricao() {
        return anoInscricao;
    }

    public double getTotalCompras() {
        return totalCompras;
    }

    public void addCompras(double valorCompra) {
        for (int i = 0; i < pedidoCompra.size(); i++) {
            totalCompras += pedidoCompra.get(i).getValor();
        }
    }

    public void addPedidoCompra(PedidoCompra pedido) {
        pedidoCompra.add(pedido);
        pedido.setPessoa(this);
    }

    abstract public double calcBonus(int anoAtual);
}
