package java_collections.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados");

        conjuntoConvidados.adicionarConvidado("convidado 1", 1000);
        conjuntoConvidados.adicionarConvidado("convidado 2", 1001);
        conjuntoConvidados.adicionarConvidado("convidado 3", 1001);  // convidado 3 não foi salvo pois seu código é igual ao convidado 2
        conjuntoConvidados.adicionarConvidado("convidado 4", 1002);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados");

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1001);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados");
    }

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c: convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
}
