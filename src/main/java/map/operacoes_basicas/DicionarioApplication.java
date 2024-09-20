package map.operacoes_basicas;

public class DicionarioApplication {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Elixir", "Uma poção ou substância mágica que se acredita ter o poder de curar doenças ou conceder a imortalidade.");
        dicionario.adicionarPalavra("Dissonância", "Falta de harmonia ou desacordo entre sons, ideias ou elementos, especialmente quando se referem a um contraste perturbador.");
        dicionario.adicionarPalavra("Cáustico", "Algo que pode queimar, corroer ou destruir matéria viva por ação química, ou uma crítica mordaz e severa.");
        dicionario.adicionarPalavra("Inerente", "Qualidade ou característica que faz parte da essência de algo, que é inseparável daquilo em que existe.");
        dicionario.adicionarPalavra("Meticuloso", "Que demonstra extremo cuidado e atenção aos detalhes; detalhista e preciso.");

        dicionario.exibirPalavras();

        System.out.println("\nResultado pesquisa: " + dicionario.pesquisaPorPalavra("Elixir"));

        dicionario.removerPalavra("Meticuloso");

        System.out.println("\nApós remoção:");
        dicionario.exibirPalavras();

    }
}
