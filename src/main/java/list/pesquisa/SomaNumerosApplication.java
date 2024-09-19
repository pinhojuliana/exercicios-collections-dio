package list.pesquisa;

public class SomaNumerosApplication {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(8);

        somaNumeros.exibirNumeros();
        System.out.println("Soma: " + somaNumeros.calcularSoma());
        System.out.println("Menor número: " + somaNumeros.encontrarmenorNumero());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());

    }
}
