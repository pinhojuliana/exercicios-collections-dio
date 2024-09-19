package set.pesquisa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
public class Tarefa {
    private String descricao;
    private boolean concluido;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.concluido = false;
    }

    @Override
    public String toString() {
        return "{" + descricao + '}';
    }
}
