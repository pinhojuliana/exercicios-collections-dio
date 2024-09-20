package map.ordenacao.agenda_eventos;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Evento {
    private String nomeEvento;
    private String atracao;

    @Override
    public String toString() {
        return "{nomeEvento='" + nomeEvento + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }
}
