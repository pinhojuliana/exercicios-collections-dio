package list.ordenacao;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class OrdenacaoPessoas{
    private List<Pessoa> pessoas;

    public OrdenacaoPessoas(){
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, double altura, int idade){
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorAltura, new AlturaComparator());
        return pessoasPorAltura;
    }

}
