package fatec.poo.model;

/**
 * @author Joao Reche e Leonardo Cordeiro
 */
public class Data {

    private int dia, mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String obterData() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public int calcDiasCorridos() {
        int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int mesesAnteriores = 0;
        double qtdeDias;

        // Soma os dias dos meses inteiros que já se passaram
        for (int i = 0; i < mes - 1; i++) {
            mesesAnteriores += meses[i];
        }

        // Fórmula para calcular os dias totais considerando anos bissextos
        qtdeDias = (((ano - 1) - 1900) * 365.25 + mesesAnteriores + dia);

        return (int) qtdeDias;
    }

    public int subtrairDatas(Data dt) {
        return calcDiasCorridos() - dt.calcDiasCorridos();
    }
}
