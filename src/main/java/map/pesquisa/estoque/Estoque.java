package map.pesquisa.estoque;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Getter
public class Estoque {
    private Map<Long, Produto> produtos;

    public Estoque(){
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtos.put(codigo, new Produto(nome, quantidade, preco));
    }

    public String exibirProdutos(){
        /*StringBuilder listaProdutos = new StringBuilder();
        for(Produto produto : produtos.values()){
            listaProdutos.append(produto.getNome()).append(", ").append(produto.getPreco()).append(", ").append(produto.getQuantidade()).append("\n");
        }
        return listaProdutos.toString(); */

        //collect(Collectors.joining("\n")): Junta todas as strings resultantes em uma única string, separando cada uma com uma nova linha (\n).

        return produtos.values().stream()
                .map(produto -> produto.getNome() + ", " + produto.getPreco() + ", " + produto.getQuantidade())
                .collect(Collectors.joining("\n"));
    }

    public double calcularValorTotalEstoque(){
        /*double valorTotal = 0;
        for(Produto produto : produtos.values()){
            valorTotal += produto.getPreco() * produto.getQuantidade();
        }
        return valorTotal; */

        return produtos.values().stream()
                .mapToDouble((p) -> p.getQuantidade() * p.getPreco())
                .sum();

    }

    public Produto obterProdutoMaisCaro(){
        /*Produto produtoMaisCaro = produtos.values().iterator().next();
        for(Produto produto : produtos.values()){
            if(produto.getPreco() > produtoMaisCaro.getPreco()){
                produtoMaisCaro = produto;
            }
        }
        return produtoMaisCaro; */

        return produtos.values().stream()
                .reduce((p1, p2) -> p1.getPreco() > p2.getPreco() ? p1 : p2)
                .orElseThrow(() -> new NoSuchElementException("Nenhum produto encontrado"));
    }

    public Produto obterProdutoMaisBarato(){
        /*Produto produtoMaisBarato = produtos.values().iterator().next();
        for(Produto produto : produtos.values()){
            if(produto.getPreco() < produtoMaisBarato.getPreco()){
                produtoMaisBarato = produto;
            }
        }
        return produtoMaisBarato; */
        return produtos.values().stream()
                .reduce((p1, p2) -> p1.getPreco() < p2.getPreco() ? p1 : p2)
                .orElseThrow(() -> new NoSuchElementException("Nenhum produto encontrado"));
    }

    public Produto obterProdutoMaiorValorTotalNoEstoque(){
        /*Produto produtoMaiorValor = produtos.values().iterator().next();
        for(Produto produto : produtos.values()){
            if((produto.getPreco() * produto.getQuantidade()) > (produtoMaiorValor.getPreco() * produtoMaiorValor.getQuantidade())){
                produtoMaiorValor = produto;
            }
        }
        return produtoMaiorValor;*/

        return produtos.values().stream().reduce((p1, p2) -> (p1.getPreco()* p1.getQuantidade()) > (p2.getPreco()*p2.getQuantidade()) ? p1 : p2).orElseThrow();
    }

}
