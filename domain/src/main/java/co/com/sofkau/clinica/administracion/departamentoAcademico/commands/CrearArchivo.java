package co.com.sofkau.clinica.administracion.departamentoAcademico.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.clinica.administracion.departamentoAcademico.values.DepartamentoAcademicoId;
import co.com.sofkau.clinica.administracion.departamentoAcademico.values.Nombre;

public class CrearArchivo extends Command {

    private final DepartamentoAcademicoId archivoId;

    private final Nombre nombre;

    public CrearArchivo(DepartamentoAcademicoId archivoId, Nombre nombre) {
        this.archivoId = archivoId;
        this.nombre = nombre;
    }

    public DepartamentoAcademicoId getArchivoId() {
        return archivoId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
