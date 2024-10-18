package java_collections.list.pesquisa.somadenumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Numero> numeroList;

    public static void main(String[] args) {
        SomaNumeros listaNumeros = new SomaNumeros();

        listaNumeros.adicionarNumero(10);
        listaNumeros.adicionarNumero(20);
        listaNumeros.adicionarNumero(3);
        listaNumeros.adicionarNumero(49);

        listaNumeros.exibirNumeros();
        System.out.println("O maior valor da lista é: " + listaNumeros.encontraMaiorNumero());
        System.out.println("O menor valor da lista é: " + listaNumeros.encontraMenorNumero());
        System.out.println("O valor da soma dos números é: " + listaNumeros.calcularSoma());
    }

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroList.add(new Numero(numero));
    }

    public int calcularSoma(){
        int valorSoma = 0;
        for (Numero n: numeroList){
            valorSoma += n.getNumero();
        }
        return valorSoma;
    }

    public int encontraMaiorNumero(){
        int valorMaiorNumero = 0;
        for (Numero n: numeroList){
            if (n.getNumero() > valorMaiorNumero)
                valorMaiorNumero = n.getNumero();
        }
        return valorMaiorNumero;
    }

    public int encontraMenorNumero(){
        int valorMenorNumero = numeroList.getFirst().getNumero();
        for (Numero n: numeroList){
            if (n.getNumero() < valorMenorNumero)
                valorMenorNumero = n.getNumero();
        }
        return valorMenorNumero;
    }

    public void exibirNumeros(){
        System.out.println(numeroList);
    }
}
