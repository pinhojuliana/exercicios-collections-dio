package set.operacoes_basicas;

public class PalavrasUnicasApplication {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Avião");
        conjuntoPalavrasUnicas.adicionarPalavra("Borboleta");
        conjuntoPalavrasUnicas.adicionarPalavra("Sapato");
        conjuntoPalavrasUnicas.adicionarPalavra("Cachorro");
        conjuntoPalavrasUnicas.adicionarPalavra("Computador");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("Jardim existe? " + conjuntoPalavrasUnicas.verificarPalavra("Jardim"));
        System.out.println("Avião existe? " + conjuntoPalavrasUnicas.verificarPalavra("Avião"));

        conjuntoPalavrasUnicas.removerPalavra("Sapato");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }

}
