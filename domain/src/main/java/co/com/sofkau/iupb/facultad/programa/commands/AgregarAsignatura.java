package co.com.sofkau.iupb.facultad.programa.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.Nombre;
import co.com.sofkau.iupb.facultad.programa.Asignatura;
import co.com.sofkau.iupb.facultad.programa.values.AsignaturaId;
import co.com.sofkau.iupb.facultad.programa.values.Descripcion;

public class AgregarAsignatura extends Command {

    private final Nombre nombre;
    private final AsignaturaId asignaturaId;
    private final Descripcion descripcion;

    public AgregarAsignatura(Nombre nombre, AsignaturaId asignaturaId, Descripcion descripcion) {
        this.nombre = nombre;
        this.asignaturaId = asignaturaId;
        this.descripcion = descripcion;
    }



    public Nombre getNombre() {
        return nombre;
    }

    public AsignaturaId getAsignaturaId() {
        return asignaturaId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
