package tarefa8;

public class Monitor {

    private String marca;
    private Double tamanho;

    public Monitor(String m, Double t) {
        this.marca = m;
        this.tamanho = t;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }
}
