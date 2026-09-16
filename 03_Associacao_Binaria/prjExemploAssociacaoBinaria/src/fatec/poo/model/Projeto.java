package fatec.poo.model;

/**
 * @author 0030482423057
 */
public class Projeto {

    private int codigo;
    private String descricao, dtInicio, dtTermino;
    private Funcionario[] funcionarios;
    /**
     * Matriz de objetos -> permite que cada elemento da matriz armazene o
     * endereco de um objeto da classe FuncionarioHorista, FuncionarioMensalista
     * ou FuncionarioComissionado
     */
    private int numFunc;

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        funcionarios = new Funcionario[5];
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }

    /**
     * Tem como parametro de entrada um endereço de um objeto da classe
     * FuncionarioHorista, FuncionarioMensalista ou FuncionarioComissionado
     */
    public void addFuncionario(Funcionario f) {
        funcionarios[numFunc] = f;
        numFunc++;
    }

    public void listarFuncionarios() {
        System.out.println("\n\t--- PROJETO ---");
        System.out.println("Codigo: " + codigo);
        System.out.println("Descricao: " + descricao);
        System.out.println("Data de Inicio: " + dtInicio);
        System.out.println("Data de Termino: " + dtTermino);
        System.out.println("Qtde. de funcionarios: " + numFunc);
        System.out.println("\n\t--- FUNCIONARIOS ---");
        for (int i = 0; i < numFunc; i++) {
            System.out.println("Registro: " + funcionarios[i].getRegistro());
            System.out.println("Nome: " + funcionarios[i].getNome());
            System.out.println("Cargo: " + funcionarios[i].getCargo());
            System.out.println("Departamento: "
                    + funcionarios[i].getDepartamento().getNome() + "\n");
        }
    }
}
