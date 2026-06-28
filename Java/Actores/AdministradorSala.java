package Java.Actores;
import Java.Interfaces.AtenderReportes;
import Java.Abstract.Asiento;
import Java.Entidades.*;

public class AdministradorSala implements AtenderReportes {
    private String id;
    private String nombre;


    public AdministradorSala(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void atenderReporte(Reporte reporte) {
        resolverReporteEscalado(reporte);
    }

    public void resolverReporteEscalado(Reporte reporte) {
        System.out.println("Administrador " + nombre + " esta resolviendo el reporte escalado.");
        reporte.actualizarEstado("RESUELTO_POR_ADMIN");
    }

    public void configurarPrecios(Class<? extends Asiento> tipoClase, double nuevoPrecio, Sala sala) {
        for (Asiento asiento : sala.getListaAsientos()) {
            if (tipoClase.isInstance(asiento)) {
                asiento.setPrecioBase(nuevoPrecio);
            }
        }
    }

    public void gestionarInventario(Sala sala, Asiento asientoNuevo) {
        sala.agregarAsiento(asientoNuevo);
    }

}