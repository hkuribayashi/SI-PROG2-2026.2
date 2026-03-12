import exemplos.Pessoa;
import exemplos.PessoaFisica;
import exemplos.PessoaJuridica;

void main(){

    Pessoa p = new Pessoa("Hugo", "Av. Ipes, n. 10", "hugo@");

    PessoaFisica pf;
    pf = new PessoaFisica("Teste", "Teste", "teste@", "123");
    //IO.println(pf.cpf);

    PessoaJuridica pj;
    pj = new PessoaJuridica("X", "Av. X, n. 10", "x@", "123");
    //IO.println(pj.cnpj);

}