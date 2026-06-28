package Java.Entidades;

import java.time.LocalDateTime;

public class Funcion {
    private String id;
    private String pelicula;
    private LocalDateTime fechaHora;
    private Sala sala;

    public Funcion(String id, String pelicula, LocalDateTime fechaHora, Sala sala) {
        this.id = id;
        this.pelicula = pelicula;
        this.fechaHora = fechaHora;
        this.sala = sala;
    }

    public MapaInteractivo obtenerDisponibilidadRealTime() {
        return new MapaInteractivo(this.id);
    }

    public void setFechaHora(LocalDateTime nuevaFechaHora) {
        this.fechaHora = nuevaFechaHora;
    }
}
