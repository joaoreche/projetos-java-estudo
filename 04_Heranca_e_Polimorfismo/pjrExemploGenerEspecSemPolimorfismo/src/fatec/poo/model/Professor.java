package fatec.poo.model;

/**
 * @author 0030482423016
 */
public class Professor extends Pessoa {

    private int regFuncional;
    private double salario;

    public Professor(int rf, String n, String dt) {
        super(n, dt);
        regFuncional = rf;

    }

    public int getRegFuncional() {
        return (regFuncional);
    }

    public double getSalario() {
        return (salario);
    }

    public void setSalario(double s) {
        salario = s;
    }

}
