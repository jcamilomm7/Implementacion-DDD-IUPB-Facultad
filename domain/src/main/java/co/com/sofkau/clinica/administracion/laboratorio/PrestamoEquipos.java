package co.com.sofkau.clinica.administracion.laboratorio;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.clinica.administracion.departamentoAcademico.values.Nombre;
import co.com.sofkau.clinica.administracion.laboratorio.values.Credencial;
import co.com.sofkau.clinica.administracion.laboratorio.values.Estado;

public class PrestamoEquipos  extends Entity<LaboratorioId> {

    protected Nombre nombre;
    protected Credencial credencial;
    protected Estado estado;

    public PrestamoEquipos(LaboratorioId entityId, Nombre nombre, Credencial credencial, Estado estado) {
        super(entityId);
        this.nombre = nombre;
        this.credencial = credencial;
        this.estado = estado;
    }
}