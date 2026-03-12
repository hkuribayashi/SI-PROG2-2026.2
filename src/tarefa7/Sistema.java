package tarefa7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<Pessoa> pessoas = new ArrayList<Pessoa>();

    public Double calculaMediaIdade(){
        Double media = 0.0;
        for (Pessoa p: this.pessoas){
            media +=
              LocalDate.now().getYear() - p.dataNascimento.getYear();
        }
        return media/this.pessoas.size();
    }

    public Double calculaTotalIncentivoQualificacao(){
        Double total = 0.0;
        for (Pessoa p: this.pessoas){
            if (p instanceof Funcionario){
                Funcionario f = (Funcionario) p;
                total += f.calcularIncentivoQualificacao();
            }
        }
        return total;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}