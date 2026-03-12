package tarefa7;

public class Docente extends Funcionario{

    public Double calcularIncentivoQualificacao(){
        return switch (this.titulacao) {
            case Titulacao.DOUTORADO -> 6000.0;
            case Titulacao.MESTRADO -> 3500.0;
            case Titulacao.ESPECIALIZACAO -> 1200.0;
            default -> 0.0;
        };
    }
}
