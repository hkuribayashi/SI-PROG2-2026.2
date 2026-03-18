import composicao.Atleta;
import composicao.Time;
import composicao.Universidade;

void main(){
    // Teste de Agregação
    Atleta a1 = new Atleta();
    a1.setNome("Hugo");

    Atleta a2 = new Atleta();
    a2.setNome("Julia");

    Time t1 = new Time("Flamengo");
    t1.getAtletas().add(a1);
    t1.getAtletas().add(a2);

    IO.println("Nome do meu time: "+t1.getNome());
    IO.println("Total de Atletas: "+t1.getAtletas().size());

    t1 = null;
    IO.println(t1);
    IO.println("Nome do atleta a1: " + a1.getNome());
    IO.println("Nome do atleta a2: " + a2.getNome());

    // Exemplo de Composição
    Universidade u1 = new Universidade("Unifesspa");
    IO.println("Nome da Universidade: "+u1.getNome());
    IO.println("Total de Departamentos: "+u1.getDepartamentos().size());
    u1 = null;
    IO.println(u1.getDepartamentos().get(0));





}