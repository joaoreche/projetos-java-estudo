
/**
 * @author Jvz
 */
public class Aluno {

    private int RA;
    private double NtPrv1, NtPrv2, NtTrab1, NtTrab2;

    public void setRA(int ra) {
        RA = ra;
    }

    public void setNtPrv1(double ntP1) {
        NtPrv1 = ntP1;
    }

    public void setNtPrv2(double ntP2) {
        NtPrv2 = ntP2;
    }

    public void setNtTrab1(double ntT1) {
        NtTrab1 = ntT1;
    }

    public void setNtTrab2(double ntT2) {
        NtTrab2 = ntT2;
    }

    public int getRA() {
        return (RA);
    }

    public double getNtPrv1() {
        return (NtPrv1);
    }

    public double getNtPrv2() {
        return (NtPrv2);
    }

    public double getNtTrab1() {
        return (NtTrab1);
    }

    public double getNtTrab2() {
        return (NtTrab2);
    }

    public double calcMediaProva() {
        return (0.75 * (NtPrv1 + 2 * NtPrv2) / 3);
    }

    public double calcMediaTrab() {
        return (0.25 * (NtTrab1 + NtTrab2) / 2);
    }

    public double calcMediaFinal() {
        return (calcMediaProva() + calcMediaTrab());
    }
}
