
/**
 * @author 0030482423057
 */
public class Retangulo {

    private double base, altura;

    public void setAltura(double a) {
        altura = a;
    }

    public void setBase(double b) {
        base = b;
    }

    public double calcArea() {
        return (base * altura);
    }

    public double calcPerimetro() {
        return (2 * (base + altura));
    }

    public double getAltura() {
        return (altura);
    }

    public double getBase() {
        return (base);
    }

    public double calcDiagonal() {
        return(Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)));
    }
}
