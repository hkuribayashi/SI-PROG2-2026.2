import br.unifesspa.*;

public Integer getTotalDeGatos(List<Animal> listaAnimais){
    Integer totalDeGatos = 0;
    for (Animal a: listaAnimais){
        if (a instanceof Gato)
            totalDeGatos++;
    }
    return totalDeGatos;
}

public Integer getTotalMamiferos(List<Animal> listaAnimais){
    Integer totalMamiferos = 0;
    for (Animal a: listaAnimais){
        if (a instanceof Mamifero)
            totalMamiferos++;
    }
    return totalMamiferos;
}

public String getNomeAnimalMaisVelho(List<Animal> listaAnimais){
    int menorAnoNascimento = 100000;
    String nomeAnimalMaisVelho = "";
    for (Animal a: listaAnimais){
        int ano = a.getDataNascimento().getYear();
        Animal animalMaisVelho;
        if (ano < menorAnoNascimento){
            menorAnoNascimento = ano;
            animalMaisVelho = a;
        }
        nomeAnimalMaisVelho = animalMaisVelho.getNome();
    }
    return "";
}

void main(){
    Petshop p = new Petshop();
    List<Animal> listaDeAnimais = p.getAnimais();

    Integer totGatos = getTotalDeGatos(  listaDeAnimais );
    IO.println("Total de Gatos: "+totGatos);

    Integer totMamiferos = getTotalMamiferos( listaDeAnimais );
    IO.println("Total de Mamiferos: "+totMamiferos);

    String nomeMaisVelho = getNomeAnimalMaisVelho(listaDeAnimais);
    IO.println("Nome Animal mais Velho: "+nomeMaisVelho);
}