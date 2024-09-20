package map.pesquisa.estoque;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    @Override
    public String toString() {
        return "{nome= '" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
