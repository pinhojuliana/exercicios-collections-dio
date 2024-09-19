package set.pesquisa;

public class ListaTarefasApplication {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Lavar pratos");
        listaTarefas.adicionarTarefa("Trabalho collections");
        listaTarefas.adicionarTarefa("Molhar plantas");
        listaTarefas.adicionarTarefa("Responder e-mail");
        listaTarefas.adicionarTarefa("Trocar Roupa de cama");

        listaTarefas.exibirTarefas();

        System.out.println(listaTarefas.contarTarefas());
        listaTarefas.marcarTarefaConcluida("Responder e-mail");
        listaTarefas.marcarTarefaConcluida("Lavar pratos");

        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.removerTarefa("Trocar Roupa de cama");
        System.out.println("\nMétodo remover:");
        listaTarefas.exibirTarefas();

        System.out.println("\nApós limpar lista de tarefas:\n");
        listaTarefas.limparListaTarefas();

        listaTarefas.exibirTarefas();


    }
}
