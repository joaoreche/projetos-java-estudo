package fatec.poo.model;

/**
 * @author 0030482423057
 */
public class Departamento {

    private String sigla, nome;
    private Funcionario[] funcionarios;
    /**
     * Matriz de objetos -> permite que cada elemento da matriz armazene o
     * endereco de um objeto da classe FuncionarioHorista, FuncionarioMensalista
     * ou FuncionarioComissionado
     */
    private int numFunc; // representa o indice da matriz

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5];
        numFunc = 0; // indica a posicao do 1° elemento da matriz
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void addFuncionario(Funcionario f) {
        funcionarios[numFunc] = f;
        numFunc++;
    }

    public void listarFuncionarios() {
        System.out.println("\n\t--- DEPARTAMENTO ---");
        System.out.println("Sigla: " + sigla);
        System.out.println("Nome do depmt: " + nome);
        System.out.println("Qtde. de funcionarios: " + numFunc);
        System.out.println("\n\t--- FUNCIONARIOS ---");
        for (int i = 0; i < numFunc; i++) {
            System.out.println("Registro: " + funcionarios[i].getRegistro());
            System.out.println("Nome: " + funcionarios[i].getNome());
            System.out.println("Cargo: " + funcionarios[i].getCargo() + "\n");
        }
    }
}
