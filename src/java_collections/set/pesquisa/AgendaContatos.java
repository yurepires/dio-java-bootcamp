package java_collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Contato 1", 123456);
        agendaContatos.adicionarContato("Contato 1", 556);
        agendaContatos.adicionarContato("Contato 2", 556);
        agendaContatos.adicionarContato("Contato 3", 1111);
        agendaContatos.adicionarContato("Yure", 1111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Contato"));

        agendaContatos.atualizarNumeroContato("Yure", 2549);

        agendaContatos.exibirContato();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c: contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
