package map.ordenacao.livraria;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private double preco;

    @Override
    public int compareTo(Livro livro) {
        return Double.compare(this.preco, livro.preco);
    }

    @Override
    public String toString() {
        return "{titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }
}
