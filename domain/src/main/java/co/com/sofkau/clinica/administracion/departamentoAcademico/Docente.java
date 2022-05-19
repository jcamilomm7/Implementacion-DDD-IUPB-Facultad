package co.com.sofkau.clinica.administracion.departamentoAcademico;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.clinica.administracion.departamentoAcademico.values.DepartamentoAcademicoId;
import co.com.sofkau.clinica.administracion.departamentoAcademico.values.Nombre;

public class Docente  extends Entity<DepartamentoAcademicoId> {
    protected Nombre nombre;

    public Docente(DepartamentoAcademicoId entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
    }

}
