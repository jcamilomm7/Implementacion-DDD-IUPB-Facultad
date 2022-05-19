package co.com.sofkau.iupb.facultad.laboratorio.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.iupb.facultad.departamentoAcademico.values.Nombre;
import co.com.sofkau.iupb.facultad.laboratorio.values.Credencial;
import co.com.sofkau.iupb.facultad.laboratorio.values.Estado;

public class AgregarPrestamoEquipos  extends Command {

    private final Nombre nombre;
    private final Credencial credencial;
    private  final Estado estado;

    public AgregarPrestamoEquipos(Nombre nombre, Credencial credencial, Estado estado) {
        this.nombre = nombre;
        this.credencial = credencial;
        this.estado = estado;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public Estado getEstado() {
        return estado;
    }
}
