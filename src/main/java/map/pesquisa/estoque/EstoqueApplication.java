package map.pesquisa.estoque;

public class EstoqueApplication {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        estoque.adicionarProduto(123456L,"Detergente",1.99, 200);
        estoque.adicionarProduto(234567L,"Amaciante",9.50, 300);
        estoque.adicionarProduto(345678L,"Sabão em pó",12.0, 500);
        estoque.adicionarProduto(456789L,"Esponja",5.35, 100);
        estoque.adicionarProduto(567890L,"Luvas de borracha",20, 68);

        System.out.println(estoque.exibirProdutos());
        System.out.println("\nValor total do estoque: " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto com maior valor de estoque: " + estoque.obterProdutoMaiorValorTotalNoEstoque());

    }
}
