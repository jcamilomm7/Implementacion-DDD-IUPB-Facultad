package co.com.sofkau.clinica.administracion.programa;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.clinica.administracion.departamentoAcademico.values.Nombre;
import co.com.sofkau.clinica.administracion.programa.values.AsignaturasMatriculadas;
import co.com.sofkau.clinica.administracion.programa.values.Correo;
import co.com.sofkau.clinica.administracion.programa.values.EstudianteId;

import java.util.Set;

public class Estudiante extends Entity<EstudianteId> {

    protected Nombre nombre;
    protected Correo correo;
    protected Set<AsignaturasMatriculadas> asignaturasMatriculadas;

    public Estudiante(EstudianteId entityId) {
        super(entityId);
    }
}
