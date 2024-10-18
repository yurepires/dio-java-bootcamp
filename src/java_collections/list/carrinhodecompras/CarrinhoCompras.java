package java_collections.list.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itemList;

    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.adicionarItem("mouse", 140.50, 2);
        carrinho.adicionarItem("teclado", 130.0, 1);
        carrinho.adicionarItem("monitor", 860.40, 1);
        System.out.println("O valor do carrinho é: " + carrinho.calcularValorTotal());
        carrinho.removerItem("mouse");
        carrinho.exibirCarrinho();
        System.out.println("O valor do carrinho é: " + carrinho.calcularValorTotal());
        System.out.println(carrinho);
    }

    public CarrinhoCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0.0;
        if (!itemList.isEmpty()){
            for (Item i : itemList) {
                valorTotal += i.getPreco() * i.getQuantidade();
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirCarrinho(){
        if (!itemList.isEmpty()){
            System.out.println(itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoCompras{" +
                "itemList=" + itemList +
                '}';
    }
}
