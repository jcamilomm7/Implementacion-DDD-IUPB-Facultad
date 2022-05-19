package co.com.sofkau.clinica.administracion.departamentoAcademico;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.clinica.administracion.departamentoAcademico.values.DepartamentoAcademicoId;
import co.com.sofkau.clinica.administracion.departamentoAcademico.values.Nombre;

public class JefeDepartamento extends Entity<DepartamentoAcademicoId> {
  protected Nombre nombre;

    public JefeDepartamento(DepartamentoAcademicoId entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
    }
}
