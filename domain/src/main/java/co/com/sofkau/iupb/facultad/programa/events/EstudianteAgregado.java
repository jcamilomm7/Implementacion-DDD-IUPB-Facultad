package co.com.sofkau.iupb.facultad.programa.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.iupb.facultad.laboratorio.values.Nombre;
import co.com.sofkau.iupb.facultad.programa.values.Correo;
import co.com.sofkau.iupb.facultad.programa.values.EstudianteId;

public class EstudianteAgregado extends DomainEvent {

    private  final EstudianteId estudianteId;
    private  final Nombre nombre;
    private  final Correo correo;

    public EstudianteAgregado(String type, EstudianteId estudianteId, Nombre nombre, Correo correo) {
        super("co.com.sofkau.iupb.facultad.programa.events.EstudianteAgregado" );
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
