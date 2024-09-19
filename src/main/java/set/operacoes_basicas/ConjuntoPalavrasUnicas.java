package set.operacoes_basicas;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas(){
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        palavrasUnicas.remove(palavra);
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        palavrasUnicas.forEach(System.out::println);
    }
}
