package Java.Entidades;

import Java.Abstract.EstadoAsiento;

public class MapaInteractivo {
    private String funcionId;

    public MapaInteractivo(String funcionId) {
        this.funcionId = funcionId;
    }

    public void renderizarMapa() {
        System.out.println("Renderizando mapa interactivo...");
    }

    public void actualizarEstadoAsiento(String asientoId, EstadoAsiento nuevoEstado) {
        System.out.println("Asiento " + asientoId + " actualizado a: "+ nuevoEstado);
    }
}
