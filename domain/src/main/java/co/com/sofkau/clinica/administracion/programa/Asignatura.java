package co.com.sofkau.clinica.administracion.programa;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.clinica.administracion.departamentoAcademico.values.Nombre;
import co.com.sofkau.clinica.administracion.programa.values.AsignaturaId;
import co.com.sofkau.clinica.administracion.programa.values.Descripcion;

public class Asignatura extends Entity<AsignaturaId> {

    protected Nombre nombre;
    protected Descripcion descripcion;


    public Asignatura(AsignaturaId entityId) {
        super(entityId);
    }
}
