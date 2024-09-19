package list.operacoes_basicas;

public class OperacoesBasicasApplication {
    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.adicionarItem("detergente", 1.99, 5);
        carrinhoCompras.adicionarItem("Suco de uva", 15.0, 1);
        carrinhoCompras.adicionarItem("Bala de banana", 0.5, 20);
        carrinhoCompras.adicionarItem("Arroz", 26.9, 2);

        System.out.println(carrinhoCompras.calcularValorTotal());
        carrinhoCompras.exibirItens();
        carrinhoCompras.removerItem("Bala de Banana");
        System.out.println("\nApós remoção:");
        carrinhoCompras.exibirItens();
        System.out.println(carrinhoCompras.calcularValorTotal());
    }
}
