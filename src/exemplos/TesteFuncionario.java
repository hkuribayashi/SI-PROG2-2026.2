import exemplos.Analista;
import exemplos.Funcionario;
import exemplos.Gerente;

void main() {

    Funcionario f = new Funcionario();
    f.nome = "Hugo";
    f.cpf = "123456789";
    f.salario = 1000.0;
    IO.println( f.calculaBonificacao() );

    Gerente g = new Gerente();
    g.nome = "Julia";
    g.cpf = "122334444";
    g.salario = 2000.0;
    IO.println( g.calculaBonificacao() );

    Funcionario f1 = new Gerente();
    f1.nome = "Nome";
    f1.cpf = "91829182";
    f1.salario = 1000.0;
    //f1.matricula = "111222";
    //f1.senha = "senha";
    IO.println( f1.calculaBonificacao() );

    Analista a = new Analista();
    a.nome = "Nome do exemplos.Analista";
    a.cpf = "182198291";
    a.salario = 1000.0;
    IO.println( a.calculaBonificacao() );
}