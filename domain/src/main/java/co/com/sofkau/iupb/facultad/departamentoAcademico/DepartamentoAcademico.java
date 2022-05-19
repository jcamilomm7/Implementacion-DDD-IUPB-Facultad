package co.com.sofkau.iupb.facultad.departamentoAcademico;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.iupb.facultad.departamentoAcademico.events.DocenteAgregado;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.*;
import co.com.sofkau.iupb.facultad.programa.Asignatura;
import co.com.sofkau.iupb.facultad.programa.events.AsignaturaAgregada;
import co.com.sofkau.iupb.facultad.programa.values.AsignaturaId;

import java.util.Set;

public class DepartamentoAcademico extends AggregateEvent<DepartamentoAcademicoId>{

    //Atributos del agregado
    protected Nombre nombre;
    protected JefeDepartamento jefeDepartamento;
    protected Set<LaboratorioId> laboratorioId;
    protected Set<ProgramaId> programaId;
    protected Set<Docente> docente;

    public DepartamentoAcademico(DepartamentoAcademicoId entityId) {
        super(entityId);
    }

    public void AgregarDocente(Docente docente){
        var docenteId = new DocenteId();
        appendChange(new DocenteAgregado(docenteId)).apply();
    }


}
