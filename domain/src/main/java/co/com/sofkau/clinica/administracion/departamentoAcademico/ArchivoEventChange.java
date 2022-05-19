package co.com.sofkau.clinica.administracion.departamentoAcademico;

import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;
import java.util.Set;

public class ArchivoEventChange extends EventChange {

    public ArchivoEventChange(DepartamentoAcademico archivo) {
        apply((HistoriaAlmacenada event) ->{
            archivo.historias = new HashSet<>();
            archivo.inventarios = new HashSet<>();
        });

        apply((InventarioAlmacenado event)->{
            var inventarioid = event.getInventarioId();
            var inventario = new Inventario(inventarioid, (Set<Insumo>) event.getInsumo());
            archivo.inventarios = (Set<Inventario>) inventario;
        });
    }
}
