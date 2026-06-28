package Java.Actores;
import Java.Entidades.*;

public class Usuario {
    private String id;
    private String nombre;
    private String email;

    public Usuario(String id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public void seleccionarAsientos(Sala sala) {
        System.out.println(nombre + " esta seleccionando asientos...");
    }
}
