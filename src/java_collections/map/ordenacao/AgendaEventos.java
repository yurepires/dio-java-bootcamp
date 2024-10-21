package java_collections.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
//      Set<LocalDate> dateSet = eventosMap.keySet();
//      Collection<Evento> values = eventosMap.values();
//      eventosMap.get();

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.NOVEMBER, 11), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.DECEMBER, 25), "Natal", "Ceia");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
