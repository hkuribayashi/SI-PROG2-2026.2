package exemplos;

public class Funcionario {

    protected String nome;
    protected String cpf;
    protected Double salario;

    /**
     *
     * @return 10% do salário de um funcionário
     */
    public Double calculaBonificacao(){
        return this.salario * 0.1;
    }
}
