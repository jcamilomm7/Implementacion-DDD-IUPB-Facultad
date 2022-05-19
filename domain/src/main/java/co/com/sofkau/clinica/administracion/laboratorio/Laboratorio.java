package co.com.sofkau.clinica.administracion.laboratorio;

import co.com.sofka.domain.generic.AggregateEvent;

import co.com.sofkau.clinica.administracion.laboratorio.values.*;

import java.util.Set;

public class Laboratorio extends AggregateEvent<LaboratorioId> {

    //Atributos
    protected Set<PrestamoEquipos> prestamoEquipos;
    protected Set<Reserva> reserva;


    public Laboratorio(LaboratorioId entityId) {
        super(entityId);
    }
}
