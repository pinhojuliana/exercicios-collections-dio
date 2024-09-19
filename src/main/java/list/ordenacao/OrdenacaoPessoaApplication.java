package list.ordenacao;

public class OrdenacaoPessoaApplication {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Juliana", 1.64, 18);
        ordenacaoPessoas.adicionarPessoa("Marco", 1.73, 64);
        ordenacaoPessoas.adicionarPessoa("Vilma", 1.59, 55);

        System.out.println("Ordenação por altura:");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        System.out.println("Ordenação por idade:");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
    }
}
