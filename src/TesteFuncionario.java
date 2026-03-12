import exemplos.Diretor;
import exemplos.Engenheiro;
import exemplos.Funcionario;
import exemplos.Gerente;

void main() {
    //Funcionario f = new Funcionario();
    //f.setSalario(1000.0);
    //IO.println( f.calculaBonificacao() );

    Gerente g = new Gerente();
    g.setSalario(1000.0);
    IO.println( g.calculaBonificacao() );

    Funcionario d = new Diretor();
    d.setSalario(1000.0);
    IO.println( d.calculaBonificacao() );

    Engenheiro e = new Engenheiro();
    e.setSalario(1000.0);
    IO.println( e.calculaBonificacao() );
}