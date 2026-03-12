package exemplos;

public class Gerente extends Funcionario{

    protected String matricula;
    protected String senha;

    /**
     * @return Calcula 15% do salário de um gerente
     */
    @Override
    public Double calculaBonificacao(){
        return this.salario * 0.15;
    }
}
