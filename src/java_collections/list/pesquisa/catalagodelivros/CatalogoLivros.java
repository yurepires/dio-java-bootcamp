package java_collections.list.pesquisa.catalagodelivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarAutor("Autor 2"));
        System.out.println(catalogoLivros.perquisarIntervaloAnos(2020,2022));
        System.out.println(catalogoLivros.perquisarTitulo("Livro 1"));
    }

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        for (Livro l: livroList){
            if (l.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> perquisarIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosIntervaloAnos = new ArrayList<>();
        for (Livro l: livroList){
            if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                livrosIntervaloAnos.add(l);
            }
        }
        return livrosIntervaloAnos;
    }

    public Livro perquisarTitulo(String titulo){
        Livro livroProcurado = null;
        if (!livroList.isEmpty()){
            for (Livro l :  livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroProcurado = l;
                    break;
                }
            }
        }
        return livroProcurado;
    }
}
