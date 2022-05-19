package co.com.sofkau.iupb.facultad.laboratorio;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.iupb.facultad.laboratorio.values.Credencial;
import co.com.sofkau.iupb.facultad.laboratorio.values.Estado;
import co.com.sofkau.iupb.facultad.laboratorio.values.Nombre;
import co.com.sofkau.iupb.facultad.laboratorio.values.PrestamoEquiposId;

public class PrestamoEquipos  extends Entity<PrestamoEquiposId> {

    protected Nombre nombre;
    protected Credencial credencial;
    protected Estado estado;

    public PrestamoEquipos(PrestamoEquiposId entityId, Nombre nombre, Credencial credencial, Estado estado) {
        super(entityId);
        this.nombre = nombre;
        this.credencial = credencial;
        this.estado = estado;
    }
}
