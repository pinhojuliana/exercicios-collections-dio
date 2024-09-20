package map.ordenacao.livraria;

public class LivrariaOnlineApplication {
    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("1984", "George Orwell" , 41 , "https://www.amazon.com.br/1984-George-Orwell");
        livrariaOnline.adicionarLivro("Verdadeiro Evangelho", "Paul Washer" , 37 , "https://www.amazon.com.br/Verdadeiro-Evangelho-Paul-Washer");
        livrariaOnline.adicionarLivro("Trabalho Focado", "Carl Newport" , 55, "https://www.amazon.com.br/Trabalho-Focado-Sucesso-Mundo-Distra%C3%ADdo");
        livrariaOnline.adicionarLivro("Assassinato no Expresso do Oriente", "Agatha Cristie" , 42 , "https://www.amazon.com.br/Assassinato-no-Expresso-do-Oriente");

        System.out.println("Pesquisa por autor: " + livrariaOnline.pesquisarLivrosPorAutor("Agatha Cristie"));
        System.out.println("\nLivro mais barato: " + livrariaOnline.obterLivroMaisBarato());
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());
        System.out.println("\nLivros ordenados:\n" + livrariaOnline.exibirLivrosPorPreco());
    }
}
