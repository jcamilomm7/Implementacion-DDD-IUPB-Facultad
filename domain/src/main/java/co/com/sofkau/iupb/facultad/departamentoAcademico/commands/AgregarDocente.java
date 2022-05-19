package co.com.sofkau.iupb.facultad.departamentoAcademico.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.Nombre;

public class AgregarDocente  extends Command {

    private final Nombre nombre;

    public AgregarDocente(Nombre nombre) {
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
