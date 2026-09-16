
/**
 * @author 0030482423057
 */
import java.text.DecimalFormat;
import fatec.poo.model.Participante;
import fatec.poo.model.Palestrante;
import fatec.poo.model.Palestra;

public class Aplic {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,##0.00");

        Palestrante objPalestrante = new Palestrante("TechA", "49122087877", "Joao");
        objPalestrante.setTaxaCobranca(15);

        Participante objPart1 = new Participante('C', "123.456.789-11", "Ronaldo");
        Participante objPart2 = new Participante('I', "987.654.321-22", "Jose");
        Participante objPart3 = new Participante('E', "456.123.789-33", "Leonardo");
        Participante objPart4 = new Participante('C', "789.456.123-44", "Amanda");
        Participante objPart5 = new Participante('C', "123.789.456-55", "Paula");

        Palestra objPal1 = new Palestra("Seguranca de Software", 100);
        Palestra objPal2 = new Palestra("Design de Interfaces", 90);

        objPal1.setPalestrante(objPalestrante);
        objPal2.setPalestrante(objPalestrante);

        objPalestrante.addPalestra(objPal1);
        objPalestrante.addPalestra(objPal2);

        objPal1.addParticipante(objPart1);
        objPal1.addParticipante(objPart3);
        objPal1.addParticipante(objPart5);

        objPal2.addParticipante(objPart2);
        objPal2.addParticipante(objPart4);

        System.out.println("\n\t--- INFORMACOES DO PALESTRANTE ---");
        System.out.println("CPF palestrante: " + objPalestrante.getCpf());
        System.out.println("Nome: " + objPalestrante.getNome());
        System.out.println("Taxa de Cobranca: " + objPalestrante.getTaxaCobranca());
        System.out.println("Valor total a receber pelas palestras: "
                + df.format(objPalestrante.calcTotalReceberPalestras()));
    }
}
