package co.com.sofkau.clinica.administracion.departamentoAcademico.values;

import co.com.sofka.domain.generic.Identity;

public class DepartamentoAcademicoId extends Identity {
    public DepartamentoAcademicoId(String id){
        super(id);
    }
    public static DepartamentoAcademicoId of(String id) {
        return new DepartamentoAcademicoId(id);
    }
}

