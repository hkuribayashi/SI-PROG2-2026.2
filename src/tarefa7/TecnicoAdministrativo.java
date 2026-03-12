package tarefa7;

public class TecnicoAdministrativo extends Funcionario{

    public Double calcularIncentivoQualificacao(){
        return this.salario * switch (this.titulacao) {
            case Titulacao.DOUTORADO -> 0.71;
            case Titulacao.MESTRADO -> 0.52;
            case Titulacao.ESPECIALIZACAO -> 0.275;
            default -> 0.135;
        };
    }
}
