package map.ordenacao.agenda_eventos;

import java.time.LocalDate;
import java.util.Comparator;

public class ComparatorData implements Comparator<LocalDate> {

    @Override
    public int compare(LocalDate data1, LocalDate data2) {
        return data1.compareTo(data2);
    }
}
