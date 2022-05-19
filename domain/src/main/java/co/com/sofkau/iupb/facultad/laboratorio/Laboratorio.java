package co.com.sofkau.iupb.facultad.laboratorio;

import co.com.sofka.domain.generic.AggregateEvent;

import co.com.sofkau.iupb.facultad.laboratorio.values.LaboratorioId;

import java.util.Set;

public class Laboratorio extends AggregateEvent<LaboratorioId> {

    //Atributos
    protected Set<PrestamoEquipos> prestamoEquipos;
    protected Set<Reserva> reserva;


    public Laboratorio(LaboratorioId entityId, Set<PrestamoEquipos> prestamoEquipos, Set<Reserva> reserva) {
        super(entityId);
        this.prestamoEquipos = prestamoEquipos;
        this.reserva = reserva;
    }
}
