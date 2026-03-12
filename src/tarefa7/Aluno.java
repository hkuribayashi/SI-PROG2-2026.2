package tarefa7;

public class Aluno extends Pessoa{

    private Integer matricula;
    private Double crg;
    private Docente orientador;

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Double getCrg() {
        return crg;
    }

    public void setCrg(Double crg) {
        this.crg = crg;
    }

    public Docente getOrientador() {
        return orientador;
    }

    public void setOrientador(Docente orientador) {
        this.orientador = orientador;
    }
}
