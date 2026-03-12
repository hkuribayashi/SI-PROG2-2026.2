package exemplos;

public class Analista extends Funcionario{

    public Double calculaBonificacao(){
        return super.calculaBonificacao() +
                this.salario * 0.02;
    }
}
