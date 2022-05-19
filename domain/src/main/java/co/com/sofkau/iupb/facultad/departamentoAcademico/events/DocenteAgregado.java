package co.com.sofkau.iupb.facultad.departamentoAcademico.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.Nombre;

public class DocenteAgregado extends DomainEvent {

    private final Nombre nombre;

    public DocenteAgregado(String type, Nombre nombre) {
        super("co.com.sofkau.iupb.facultad.departamentoAcademico.events.DocenteAgregado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
