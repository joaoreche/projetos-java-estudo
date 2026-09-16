package fatec.poo.model;

import java.util.ArrayList;

/**
 * @author 0030482423057
 */
public class Palestra {

    private String data, tema;
    private double valor;
    private ArrayList<Participante> participantes;
    private Palestrante palestrante;

    public Palestra(String tema, double valor) {
        this.tema = tema;
        this.valor = valor;
        participantes = new ArrayList<Participante>();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTema() {
        return tema;
    }

    public double getValor() {
        return valor;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }

    public void addParticipante(Participante p) {
        participantes.add(p);
    }

    public double calcTotalFaturado() {
        double valorTotal = 0;

        for (int i = 0; i < participantes.size(); i++) {
            switch (Character.toUpperCase(participantes.get(i).getTipo())) {
                case 'C':
                    valorTotal += valor;
                    break;
                case 'E':
                    valorTotal += valor - (valor * 0.15);
                    break;
                case 'I':
                    valorTotal += valor - (valor * 0.2);
                    break;
                default:
                    System.out.println("Tipo de participante invalido!");
            }
        }
        return valorTotal;
    }
}
