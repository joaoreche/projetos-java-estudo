package fatec.poo.model;

/**
 * @author Jvz
 */
public class Cliente extends Pessoa {

    private String cpf;
    private double peso, altura;

    public Cliente(String ident, String n, String tel) {
        super(n, tel);
        cpf = ident;
    }

    public void setPeso(double p) {
        peso = p;
    }

    public void setAltura(double a) {
        altura = a;
    }

    public String getCpf() {
        return (cpf);
    }

    public double getPeso() {
        return (peso);
    }

    public double getAltura() {
        return (altura);
    }
}
