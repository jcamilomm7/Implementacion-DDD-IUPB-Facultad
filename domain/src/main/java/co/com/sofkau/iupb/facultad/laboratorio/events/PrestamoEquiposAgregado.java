package co.com.sofkau.iupb.facultad.laboratorio.events;

import co.com.sofka.domain.generic.DomainEvent;

import co.com.sofkau.iupb.facultad.laboratorio.values.Credencial;
import co.com.sofkau.iupb.facultad.laboratorio.values.Estado;
import co.com.sofkau.iupb.facultad.laboratorio.values.Nombre;
import co.com.sofkau.iupb.facultad.laboratorio.values.PrestamoEquiposId;

public class PrestamoEquiposAgregado  extends DomainEvent {

    private  final PrestamoEquiposId prestamoEquiposId;

    private final Nombre nombre;
    private final Credencial credencial;
    private  final Estado estado;

    public PrestamoEquiposAgregado(PrestamoEquiposId prestamoEquiposId) {
        super("co.com.sofkau.iupb.facultad.laboratorio.events.PrestamoEquiposAgregado");
        this.nombre = nombre;
        this.credencial = credencial;
        this.estado = estado;
        this.prestamoEquiposId = prestamoEquiposId;
    }

    public PrestamoEquiposId getPrestamoEquiposId() {
        return prestamoEquiposId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public Estado getEstado() {
        return estado;
    }
}
