package co.com.sofkau.iupb.facultad.programa.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.Nombre;
import co.com.sofkau.iupb.facultad.programa.values.AsignaturaId;
import co.com.sofkau.iupb.facultad.programa.values.Descripcion;


public class AsignaturaAgregada extends DomainEvent {

    private final Nombre nombre;
    private final AsignaturaId asignaturaId;
    private final Descripcion descripcion;

    public AsignaturaAgregada(Nombre nombre, AsignaturaId asignaturaId, Descripcion descripcion) {
        super("co.com.sofkau.iupb.facultad.programa.events.AsignaturaAgregada");
        this.nombre = nombre;
        this.asignaturaId = asignaturaId;
        this.descripcion = descripcion;
    }

    public AsignaturaId getAsignaturaId() {
        return asignaturaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
