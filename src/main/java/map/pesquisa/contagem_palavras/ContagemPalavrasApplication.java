package map.pesquisa.contagem_palavras;

public class ContagemPalavrasApplication {
    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavras("Elixir",5 );
        contagemPalavras.adicionarPalavras("Dissonância", 2);
        contagemPalavras.adicionarPalavras("Cáustico", 1);
        contagemPalavras.adicionarPalavras("Meticuloso", 6);

        System.out.println(contagemPalavras.exibirContagemPalavras());
        System.out.println("Palavra mais frenquente: " + contagemPalavras.encontrarPalavraMaisFrequente());

        contagemPalavras.removerPalavra("Meticuloso");
        System.out.println("Após remoção: " + contagemPalavras.exibirContagemPalavras());
    }
}
