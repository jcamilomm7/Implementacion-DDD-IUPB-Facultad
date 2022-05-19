package co.com.sofkau.iupb.facultad.programa;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.ProgramaId;

import java.util.Set;

public class Programa extends AggregateEvent<ProgramaId> {

    //Atributos
    protected Set<Estudiante> estudiante;
    protected  Set<Asignatura> asignatura;

    public Programa(ProgramaId entityId) {
        super(entityId);
    }
}
