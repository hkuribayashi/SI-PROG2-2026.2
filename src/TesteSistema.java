import tarefa7.*;

void main(){

    Sistema s = new Sistema();

    Aluno a = new Aluno();
    a.setDataNascimento( LocalDate.of(2000, 1, 1) );
    s.getPessoas().add(a);


    Docente d = new Docente();
    d.setDataNascimento( LocalDate.of(2000, 1, 1) );
    d.setTitulacao(Titulacao.DOUTORADO);
    s.getPessoas().add(d);

    TecnicoAdministrativo ta = new TecnicoAdministrativo();
    ta.setDataNascimento( LocalDate.of(2000, 1, 1) );
    ta.setTitulacao(Titulacao.DOUTORADO);
    ta.setSalario(1000.0);
    s.getPessoas().add(ta);

    IO.println("Total: " +
            s.calculaTotalIncentivoQualificacao());

    IO.println("Media de Idade: "+
            s.calculaMediaIdade());


    if (d instanceof Pessoa){
        IO.println("Docente d é uma pessoa");
    }




}