package co.com.sofkau.clinica.administracion.programa;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.clinica.administracion.departamentoAcademico.values.ProgramaId;

import java.util.Set;

public class Programa extends AggregateEvent<ProgramaId> {

    //Atributos
    protected Set<Estudiante> estudiante;
    protected  Set<Asignatura> asignatura;

    public Programa(ProgramaId entityId) {
        super(entityId);
    }
}
