package co.com.sofkau.iupb.facultad.departamentoAcademico;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.iupb.facultad.departamentoAcademico.events.DocenteAgregado;

import java.util.HashSet;
import java.util.Set;

public class DepartamentoAcademicoEventChange extends EventChange {

    public DepartamentoAcademicoEventChange  (DepartamentoAcademico departamentoAcademico) {
        apply((DocenteAgregado event)->{
            departamentoAcademico.docente = new HashSet<>();
        });

       apply((DocenteAgregado event)->{
            var docenteId = event.getDocenteId();
            var docente  =new Docente(docenteId, event.getNombre());
            departamentoAcademico.docente = (Set<Docente>) docente;
        });

    }

}
