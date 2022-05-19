package co.com.sofkau.iupb.facultad.programa;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.Nombre;
import co.com.sofkau.iupb.facultad.programa.values.Correo;
import co.com.sofkau.iupb.facultad.programa.values.EstudianteId;

public class Estudiante extends Entity<EstudianteId> {

    protected Nombre nombre;
    protected Correo correo;

    public Estudiante(EstudianteId entityId) {
        super(entityId);
    }
}
