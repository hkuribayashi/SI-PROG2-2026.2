package composicao;

import java.util.ArrayList;
import java.util.List;

public class Universidade {

    private String nome;
    private List<Departamento> departamentos;

    public Universidade(String nome){
        this.nome = nome;
        this.departamentos = new ArrayList<Departamento>();
        this.departamentos.add(new Departamento("FACSI"));
        this.departamentos.add(new Departamento("FEC"));
        this.departamentos.add(new Departamento("FEQ"));
        this.departamentos.add(new Departamento("FEMMA"));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
}
