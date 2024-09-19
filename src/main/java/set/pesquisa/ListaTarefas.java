package set.pesquisa;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Getter
public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas(){
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        tarefas.removeIf(tarefa -> descricao.equalsIgnoreCase(tarefa.getDescricao()));
    }

    public void exibirTarefas(){
        if(tarefas.isEmpty()){
            System.out.println("Lista vazia.");
        }
        tarefas.forEach(System.out::println);
    }

    public int contarTarefas(){
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        tarefas.stream()
                .filter(Tarefa::isConcluido)
                .forEach(tarefasConcluidas::add);
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        tarefas.stream()
                .filter(tarefa -> !tarefa.isConcluido())
                .forEach(tarefasPendentes::add);
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        tarefas.stream()
                .filter(tarefa -> descricao.equalsIgnoreCase(tarefa.getDescricao()))
                .forEach(tarefa -> tarefa.setConcluido(true));
    }

    public void limparListaTarefas(){
        tarefas.clear();
    }

}
