import composicao.Categoria;
import composicao.Produto;

void main(){
    Categoria c1 = new Categoria(1, "Limpeza");
    Categoria c2 = new Categoria(2, "Higiene Pessoal");
    Categoria c3 = new Categoria(3, "Laticínios");

    Produto p1 = new Produto(1, "Leite Líquido", 9.0, c3);

    IO.println("Total de Produtos: "+c3.getProdutos().size());
    c3.getProdutos().add( p1 );

}