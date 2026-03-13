package tarefa8;

public class Computador {

    protected String marca;
    protected Integer memoriaRAM;
    protected String placaGrafica;
    protected Boolean ligado;

    public Computador(String m, Integer mr, String pg, Boolean l){
        this.marca = m;
        this.memoriaRAM = mr;
        this.placaGrafica = pg;
        this.ligado = l;
    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "marca='" + marca + '\'' +
                ", memoriaRAM=" + memoriaRAM +
                ", placaGrafica='" + placaGrafica + '\'' +
                ", ligado=" + ligado +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(Integer memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getPlacaGrafica() {
        return placaGrafica;
    }

    public void setPlacaGrafica(String placaGrafica) {
        this.placaGrafica = placaGrafica;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }
}
