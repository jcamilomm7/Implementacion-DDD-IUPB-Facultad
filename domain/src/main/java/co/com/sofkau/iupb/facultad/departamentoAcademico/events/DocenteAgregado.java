package co.com.sofkau.iupb.facultad.departamentoAcademico.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.DocenteId;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.Nombre;

public class DocenteAgregado extends DomainEvent {

    private final DocenteId docenteId;
    private final Nombre nombre;

    public DocenteAgregado(DocenteId docenteId) {
        super("co.com.sofkau.iupb.facultad.departamentoAcademico.events.DocenteAgregado");
        this.nombre = nombre;
        this.docenteId = docenteId;

    }

    public DocenteId getDocenteId() {
        return docenteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
