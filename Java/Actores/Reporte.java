package Java.Actores;

public class Reporte {
    private String id;
    private Usuario usuario;
    private String descripcion;
    private String estado;

    public Reporte(Usuario usuario, String descripcion, String estado) {
        this.usuario = usuario;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Reporte actualizado a: " + estado);
    }
}
