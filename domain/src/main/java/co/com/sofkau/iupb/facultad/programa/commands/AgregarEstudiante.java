package co.com.sofkau.iupb.facultad.programa.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.iupb.facultad.laboratorio.values.Nombre;
import co.com.sofkau.iupb.facultad.programa.Asignatura;
import co.com.sofkau.iupb.facultad.programa.values.Correo;
import co.com.sofkau.iupb.facultad.programa.values.EstudianteId;

import java.util.Set;

public class AgregarEstudiante  extends Command {

    private  final EstudianteId estudianteId;
    private  final Nombre nombre;
    private  final Correo correo;

    public AgregarEstudiante(EstudianteId estudianteId, Nombre nombre, Correo correo) {
        this.estudianteId = estudianteId;
        this.nombre = nombre;
        this.correo = correo;
    }

    public EstudianteId getEstudianteId() {
        return estudianteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Correo getCorreo() {
        return correo;
    }
}
