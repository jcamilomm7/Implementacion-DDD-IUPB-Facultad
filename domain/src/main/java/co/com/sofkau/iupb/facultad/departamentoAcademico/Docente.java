package co.com.sofkau.iupb.facultad.departamentoAcademico;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.DepartamentoAcademicoId;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.DocenteId;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.Nombre;

public class Docente  extends Entity<DocenteId> {
    protected Nombre nombre;

    public Docente(DocenteId entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
