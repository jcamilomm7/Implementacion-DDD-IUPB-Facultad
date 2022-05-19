package co.com.sofkau.iupb.facultad.programa;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.iupb.facultad.programa.events.AsignaturaAgregada;
import co.com.sofkau.iupb.facultad.programa.events.EstudianteAgregado;

import java.util.HashSet;


public class ProgramaEventChange extends EventChange {

    public ProgramaEventChange  (Programa programa) {
        apply((AsignaturaAgregada event) ->{
            programa.estudiante = new HashSet<>();
            programa.asignatura = new HashSet<>();
        });

    }


}
