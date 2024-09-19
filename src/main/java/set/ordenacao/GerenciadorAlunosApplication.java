package set.ordenacao;

public class GerenciadorAlunosApplication {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Maria",123456L , 10);
        gerenciadorAlunos.adicionarAluno("Ana",234567L , 4);
        gerenciadorAlunos.adicionarAluno("João",598765L , 5.5);
        gerenciadorAlunos.adicionarAluno("Augusto", 876590L, 7.9);
        gerenciadorAlunos.adicionarAluno("Joana", 980345L, 8.4);

        gerenciadorAlunos.exibirAlunos();

        System.out.println("Alunos por nome: " + gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println("Alunos por média: " + gerenciadorAlunos.exibirAlunosPorMedia());

        System.out.println("\nApós remoção:");
        gerenciadorAlunos.removerAluno(876590L);
        gerenciadorAlunos.exibirAlunos();

    }
}
