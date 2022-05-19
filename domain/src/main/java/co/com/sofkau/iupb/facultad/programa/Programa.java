package co.com.sofkau.iupb.facultad.programa;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.Nombre;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.ProgramaId;
import co.com.sofkau.iupb.facultad.programa.events.AsignaturaAgregada;
import co.com.sofkau.iupb.facultad.programa.values.AsignaturaId;
import co.com.sofkau.iupb.facultad.programa.values.Descripcion;

import java.util.Set;

public class Programa extends AggregateEvent<ProgramaId> {

    //Atributos
    protected Set<Estudiante> estudiante;
    protected  Set<Asignatura> asignatura;

    public Programa(ProgramaId entityId) {
        super(entityId);
    }

    public void AgregarAsignatura(Asignatura asignatura){
        var asignaturaId = new AsignaturaId();
        appendChange(new AsignaturaAgregada(asignaturaId)).apply();
    }
}
