package co.com.sofkau.iupb.facultad.laboratorio;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.iupb.facultad.laboratorio.events.PrestamoEquiposAgregado;
import java.util.HashSet;
import java.util.Set;

public class LaboratorioEventchange extends EventChange {

    public LaboratorioEventchange (Laboratorio laboratorio) {
        apply((PrestamoEquiposAgregado event)->{
            laboratorio.prestamoEquipos = new HashSet<>();
        });

        apply((PrestamoEquiposAgregado event)->{
            var prestamoEquiposId = event.getPrestamoEquiposId();
            var prestamoEquipos  =new PrestamoEquipos(prestamoEquiposId,event.getNombre(), event.getCredencial(), event.getEstado());
            laboratorio.prestamoEquipos= (Set<PrestamoEquipos>) prestamoEquipos;
        });

    }
}
