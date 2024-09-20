package map.ordenacao.livraria;

import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;

@Getter
public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline(){
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String titulo, String autor, double preco, String link){
        livros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        livros.entrySet().removeIf(l -> l.getValue().getTitulo().equalsIgnoreCase(titulo));
    }

    public Map<String, Livro> exibirLivrosPorPreco(){
        return livros.values().stream()
                .sorted(Comparator.comparing(Livro::getPreco))
                .collect(Collectors.toMap(Livro::getTitulo, livro -> livro, (e1, e2) -> e1, LinkedHashMap::new));
    }

    public String pesquisarLivrosPorAutor(String autor){
        return livros.values().stream()
                .filter(livro -> livro.getAutor().equalsIgnoreCase(autor))
                .map(Livro::getTitulo)
                .collect(Collectors.joining("\n"));
    }

    public Livro obterLivroMaisCaro(){
         return livros.values().stream()
        .max(Comparator.comparing(Livro::getPreco))
        .orElseThrow(() -> new NoSuchElementException("Não há livros disponíveis."));
    }

    public Livro obterLivroMaisBarato(){
        return livros.values().stream()
                .min(Comparator.comparing(Livro::getPreco))
                .orElseThrow(() -> new NoSuchElementException("Não há livros disponíveis."));
    }

}
