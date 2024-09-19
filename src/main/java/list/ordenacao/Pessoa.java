package list.ordenacao;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(this.idade, p.idade);
    }

    @Override
    public String toString() {
        return "{nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
