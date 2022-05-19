package co.com.sofkau.iupb.facultad.programa;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.Nombre;
import co.com.sofkau.iupb.facultad.programa.values.AsignaturaId;
import co.com.sofkau.iupb.facultad.programa.values.Descripcion;

public class Asignatura extends Entity<AsignaturaId> {

    public Nombre nombre;
    public Descripcion descripcion;


    public Asignatura(AsignaturaId entityId) {
        super(entityId);
    }
}
