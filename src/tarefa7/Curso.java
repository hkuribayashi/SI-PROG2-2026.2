package tarefa7;

public class Curso {

    private String nome;
    private Double cargaHoraria;
    private Docente coordenador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Docente getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Docente coordenador) {
        this.coordenador = coordenador;
    }
}
