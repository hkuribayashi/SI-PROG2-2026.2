package exemplos;

public class PessoaJuridica extends Pessoa{

    protected String cnpj;

    public PessoaJuridica(String n, String e, String em, String cn){
        super(n, e, em);
        this.cnpj = cn;
    }
}
