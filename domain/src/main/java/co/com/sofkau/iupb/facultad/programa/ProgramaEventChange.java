package co.com.sofkau.iupb.facultad.programa;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.iupb.facultad.programa.commands.AgregarAsignatura;
import co.com.sofkau.iupb.facultad.programa.events.AsignaturaAgregada;
import co.com.sofkau.iupb.facultad.programa.events.EstudianteAgregado;

import java.util.HashSet;
import java.util.Set;


public class ProgramaEventChange extends EventChange {

    public ProgramaEventChange  (Programa programa) {
        apply((AsignaturaAgregada event)->{
            programa.asignatura =new HashSet<>() ;
            programa.estudiante = new HashSet<>();
        });

        apply((AsignaturaAgregada event)->{
            var asignaturaId = event.getAsignaturaId();
            var asignatura  =new Asignatura(asignaturaId, event.getNombre(), event.getDescripcion());
            programa.asignatura = (Set<Asignatura>) asignatura;
        });

    }

}
