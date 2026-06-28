package Java.Interfaces;
import Java.Actores.Usuario;

public interface ServicioNotificacion {
    void enviarAlerta(Usuario usuario, String mensaje);
}