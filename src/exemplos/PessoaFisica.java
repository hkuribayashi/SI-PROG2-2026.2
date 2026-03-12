package exemplos;

public class PessoaFisica extends Pessoa{

    protected String cpf;

    public PessoaFisica(String n, String e, String em, String c){
        super(n, e, em);
        this.cpf = c;
    }
}