package map.pesquisa.contagem_palavras;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class ContagemPalavras {
    private Map<String, Integer> palavraQuantidade;

    public ContagemPalavras() {
        this.palavraQuantidade = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, int quantidade){
        palavraQuantidade.put(palavra, quantidade);
    }

    public void removerPalavra(String palavra){
        palavraQuantidade.remove(palavra);
    }

    public Map<String, Integer> exibirContagemPalavras(){
        return palavraQuantidade;
    }

    public String encontrarPalavraMaisFrequente(){
        /*String palavraMaisFrequente = palavraQuantidade.keySet().iterator().next();
        int maiorQuantidade = palavraQuantidade.get(palavraMaisFrequente);

        for(Map.Entry<String, Integer> entry : palavraQuantidade.entrySet()){
            if(entry.getValue() > maiorQuantidade){
                palavraMaisFrequente = entry.getKey();
            }
        }

        return palavraMaisFrequente;*/

        //uso o getKey() para retornar apena a String
        return palavraQuantidade.entrySet().stream()
                .reduce((p1, p2) -> p1.getValue() > p2.getValue() ? p1 : p2)
                .map(Map.Entry::getKey).orElseThrow();
    }

}
