package co.com.sofkau.iupb.facultad.laboratorio;

import co.com.sofka.domain.generic.Entity;

import co.com.sofkau.iupb.facultad.laboratorio.values.Credencial;
import co.com.sofkau.iupb.facultad.laboratorio.values.Estado;
import co.com.sofkau.iupb.facultad.laboratorio.values.LaboratorioId;
import co.com.sofkau.iupb.facultad.laboratorio.values.ReservaId;

public class Reserva  extends Entity<ReservaId> {

    protected Credencial credencial;
    protected Estado estado;


    public Reserva(ReservaId entityId, Credencial credencial, Estado estado) {
        super(entityId);
        this.credencial = credencial;
        this.estado = estado;
    }
}
