package co.com.sofkau.clinica.administracion.laboratorio;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.clinica.administracion.laboratorio.values.LaboratorioId;
import co.com.sofkau.clinica.administracion.laboratorio.values.ReservaId;

public class Reserva  extends Entity<ReservaId> {


    public Reserva(LaboratorioId entityId) {
        super(entityId);
    }
}
