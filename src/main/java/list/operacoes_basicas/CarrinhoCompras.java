package list.operacoes_basicas;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class CarrinhoCompras {

    private List<Item> itens;

    public CarrinhoCompras (){
        this.itens = new ArrayList<>();
    }

   public void adicionarItem(String name, double price, int quantity){
       itens.add(new Item(name, price, quantity));
   }

   public void removerItem(String nomeItem){
        itens.removeIf(item -> item.getName().equalsIgnoreCase(nomeItem));
   }

   public double calcularValorTotal(){
       return itens.stream()
               .mapToDouble(item -> item.getPrice() * item.getQuantity())
               .sum();
   }

   public void exibirItens(){
       itens.forEach(System.out::println);
   }

}
