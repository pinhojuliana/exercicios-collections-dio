package map.operacoes_basicas;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class Dicionario {
    private Map<String, String> palavras;

    public Dicionario(){
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        palavras.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        palavras.remove(palavra);
    }

    public void exibirPalavras(){
        for (Map.Entry<String, String> entry : palavras.entrySet()) {
            System.out.println("Palavra: " + entry.getKey() + ", Definição: " + entry.getValue());
        }
    }

    public String pesquisaPorPalavra(String palavra){
        return palavras.get(palavra);
    }



}
