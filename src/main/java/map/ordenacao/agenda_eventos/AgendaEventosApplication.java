package map.ordenacao.agenda_eventos;

import java.time.LocalDate;

public class AgendaEventosApplication {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento("MusalAirShow", "Exposição e esquadrilha da fumaça", LocalDate.of(2023,7,29));
        agendaEventos.adicionarEvento("Almoço da família","Brinquedos para as crianças",LocalDate.of(2024, 10, 12) );
        agendaEventos.adicionarEvento("Festa de Aniversário", "Música ao vivo", LocalDate.of(2024, 9, 28));
        agendaEventos.adicionarEvento("Formatura", "Fogos de Artifício", LocalDate.of(2022, 12, 15));

        System.out.println(agendaEventos.exibirAgenda());
        System.out.println("\nPróximo evento: " + agendaEventos.obterProximoEvento());

    }
}
