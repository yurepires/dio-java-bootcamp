package java_collections.map.operacoesbasicas;

import java_collections.set.pesquisa.Contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Contato 1", 123456);
        // "put" além de adicionar, ele também atualiza
        agendaContatos.adicionarContato("Contato 1", 556);
        agendaContatos.adicionarContato("Contato 2", 556);
        agendaContatos.adicionarContato("Contato 3", 1111);
        agendaContatos.adicionarContato("Yure", 1111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Contato 1"));

        agendaContatos.removerContato("Contato 2");

        agendaContatos.exibirContatos();

    }

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }
}
