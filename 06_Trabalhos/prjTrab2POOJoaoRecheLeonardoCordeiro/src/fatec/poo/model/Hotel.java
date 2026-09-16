package fatec.poo.model;

import java.util.ArrayList;

/**
 * @author Joao Reche e Leonardo Cordeiro
 */
public class Hotel {

    private int codigo;
    private String nome, endereco, telefone;
    private double valorDiaria, totalFaturamento;
    private ArrayList<Reserva> reserva; // Representa a multiplicidade 1..*

    public Hotel(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        reserva = new ArrayList<Reserva>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getTotalFaturamento() {
        return totalFaturamento;
    }

    public void setTotalFaturamento(double totalFaturamento) {
        this.totalFaturamento = totalFaturamento;
    }

    public void addValorHospedagem(double valorHosped) {
        totalFaturamento += valorHosped;
    }

    public void addReserva(Reserva r) {
        reserva.add(r);
        r.setHotel(this);
    }
}
