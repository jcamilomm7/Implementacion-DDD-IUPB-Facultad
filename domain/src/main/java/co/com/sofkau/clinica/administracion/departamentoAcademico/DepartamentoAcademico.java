package co.com.sofkau.clinica.administracion.departamentoAcademico;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.clinica.administracion.departamentoAcademico.values.*;

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


    //Constructores


}
