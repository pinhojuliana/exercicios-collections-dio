package set.ordenacao;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Aluno implements Comparable<Aluno>{
    private String nome;
    private long matricula;
    private double media;

    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareTo(aluno.getNome()) ;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }
}
