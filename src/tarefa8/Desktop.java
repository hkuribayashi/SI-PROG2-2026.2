package tarefa8;

public class Desktop extends Computador{

    private Integer tamanhoGabinete;
    private Monitor monitor;

    public Desktop(String m, Integer mr, String pg,
                   Integer tg, String mm, Double tt) {
        super(m, mr, pg);
        this.tamanhoGabinete = tg;
        this.monitor = new Monitor(mm, tt);
    }

    public Integer getTamanhoGabinete() {
        return tamanhoGabinete;
    }

    public void setTamanhoGabinete(Integer tamanhoGabinete) {
        this.tamanhoGabinete = tamanhoGabinete;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "ligado=" + ligado +
                ", placaGrafica='" + placaGrafica + '\'' +
                ", memoriaRAM=" + memoriaRAM +
                ", marca='" + marca + '\'' +
                ", monitor=" + monitor +
                ", tamanhoGabinete=" + tamanhoGabinete +
                '}';
    }
}
