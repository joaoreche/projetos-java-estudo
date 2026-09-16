package fatec.poo.model;

/**
 * @author Joao Reche e Leonardo Cordeiro
 */
public class Reserva {

    private int codigo;
    private String nomeHosp;
    private Data dataEntrada, dataSaida;
    private double valorHosped;
    private Hotel hotel; // Representa a multiplicidade 1

    public Reserva(int codigo, String nomeHosp, Data dataEntrada) {
        this.codigo = codigo;
        this.nomeHosp = nomeHosp;
        this.dataEntrada = dataEntrada;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeHosp() {
        return nomeHosp;
    }

    public Data getDataEntrada() {
        return dataEntrada;
    }

    public Data getDataSaida() {
        return dataSaida;
    }

    public double getValorHosped() {
        return valorHosped;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public double encerrarReserva(Data dataSaida) {
        this.dataSaida = dataSaida;

        // Calcula a quantidade de dias que a pessoa ficou hospedada
        int diasHospedados = dataSaida.subtrairDatas(dataEntrada);

        // Calcula o valor total
        valorHosped = hotel.getValorDiaria() * diasHospedados;

        return valorHosped;
    }
}
