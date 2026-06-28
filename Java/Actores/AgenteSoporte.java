package Java.Actores;
import Java.Interfaces.AtenderReportes;

public class AgenteSoporte implements AtenderReportes {
    private String id;
    private String nombre;

    public AgenteSoporte(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void atenderReporte(Reporte reporte) {
        System.out.println("Agente " + nombre + " esta atendiendo el reporte.");
        reporte.actualizarEstado("EN_REVISION");
    }

    public void escalarReporte(Reporte reporte) {
        System.out.println("Reporte escalado a administracion.");
        reporte.actualizarEstado("ESCALADO");
    }
}
