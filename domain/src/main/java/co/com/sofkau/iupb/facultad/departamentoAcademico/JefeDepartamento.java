package co.com.sofkau.iupb.facultad.departamentoAcademico;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.DepartamentoAcademicoId;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.JefeDepartamentoId;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.Nombre;

public class JefeDepartamento extends Entity<JefeDepartamentoId> {
  protected Nombre nombre;

    public JefeDepartamento(JefeDepartamentoId entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
