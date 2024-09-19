package list.pesquisa;


import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class SomaNumeros  {
    private List<Integer> numeros;

    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int num){
        numeros.add(num);
    }

    public int calcularSoma(){
       /* int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        return soma; */
        return numeros.stream()
                .reduce(0, Integer::sum);
    }

    public int encontrarMaiorNumero(){
      /* int numPadrao = numeros.get(0);
       for(int num : numeros){
           if(num > numPadrao){
               numPadrao = num;
           }
       }
       return numPadrao; */

        return numeros.stream()
                .max(Integer::compare)
                .orElseThrow();
    }

    public int encontrarmenorNumero(){
        return numeros.stream()
                .min(Integer::compare)
                .orElseThrow();
    }

    public void exibirNumeros(){
        numeros.forEach(System.out::println);
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosOrdenados = new ArrayList<>(numeros);
        numerosOrdenados.sort(Collections.reverseOrder());
        return numerosOrdenados;
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosOrdenados = new ArrayList<>(numeros);
        Collections.sort(numerosOrdenados);
        return numerosOrdenados;
    }

}
