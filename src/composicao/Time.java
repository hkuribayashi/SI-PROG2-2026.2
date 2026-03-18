package composicao;

import java.util.ArrayList;
import java.util.List;

public class Time {

    private String nome;
    private List<Atleta> atletas;

    public Time(String nomeTime){
        this.nome = nomeTime;
        this.atletas = new ArrayList<Atleta>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(List<Atleta> atletas) {
        this.atletas = atletas;
    }
}
