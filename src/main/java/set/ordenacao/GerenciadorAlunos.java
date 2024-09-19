package set.ordenacao;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Getter
public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos(){
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        alunos.removeIf(aluno -> aluno.getMatricula() == matricula);
    }

    public void exibirAlunos(){
        alunos.forEach(System.out::println);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosOrdemAlfabetica = new TreeSet<>(alunos);
        return alunosOrdemAlfabetica;
    }

    public Set<Aluno> exibirAlunosPorMedia(){
        Set<Aluno> alunosOrdemMedia = new TreeSet<>(new ComparatorMedia());
        alunosOrdemMedia.addAll(alunos);

        return alunosOrdemMedia;
    }

}
