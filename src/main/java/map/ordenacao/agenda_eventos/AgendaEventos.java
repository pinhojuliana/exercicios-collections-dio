package map.ordenacao.agenda_eventos;

import lombok.Getter;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@Getter
public class AgendaEventos{
    private Map<LocalDate, Evento> eventos;

    public AgendaEventos(){
        this.eventos = new HashMap<>();
    }

    public void adicionarEvento(String nome, String atracao, LocalDate data){
        eventos.put(data, new Evento(nome, atracao));
    }

    public Map<LocalDate, Evento> exibirAgenda(){
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(new ComparatorData());
        eventosOrdenados.putAll(eventos);
        return eventosOrdenados;
    }

    public Evento obterProximoEvento(){
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(new ComparatorData());
        eventosOrdenados.putAll(eventos);

        return eventosOrdenados.entrySet().stream()
                .filter(entry -> entry.getKey().isAfter(LocalDate.now()))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElseThrow();
    }

}
