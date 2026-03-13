package tarefa8;

public class Notebook extends Computador{

    private Double capacidadeBateria;
    private Double tamanhoTela;

    public Notebook(String m, Integer mr, String pg, Boolean l,
                                            Double cb, Double tt) {
        super(m, mr, pg, l);
        this.capacidadeBateria = cb;
        this.tamanhoTela = tt;
    }

    public Double getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(Double capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    public Double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(Double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }
}
