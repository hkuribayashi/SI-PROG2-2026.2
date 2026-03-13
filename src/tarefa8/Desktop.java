package tarefa8;

public class Desktop extends Computador{

    private Integer tamanhoGabinete;
    private Monitor monitor;

    public Desktop(String m, Integer mr, String pg, Boolean l,
                   Integer tg, String mm, Double tt) {
        super(m, mr, pg, l);
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
}
