package co.com.sofkau.iupb.facultad.laboratorio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.Nombre;
import co.com.sofkau.iupb.facultad.laboratorio.values.Credencial;
import co.com.sofkau.iupb.facultad.laboratorio.values.Estado;

public class PrestamoEquiposAgregado  extends DomainEvent {

    private final Nombre nombre;
    private final Credencial credencial;
    private  final Estado estado;

    public PrestamoEquiposAgregado(String type, Nombre nombre, Credencial credencial, Estado estado) {
        super("co.com.sofkau.iupb.facultad.laboratorio.events.PrestamoEquiposAgregado");
        this.nombre = nombre;
        this.credencial = credencial;
        this.estado = estado;
    }
}
