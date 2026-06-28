package Java.Entidades;
import Java.Abstract.*;
import java.util.ArrayList;
import java.util.List;

public class Sala {
    private String id;
    private int numeroSala;
    private int capacidadMaxima;
    private List<Asiento> listaAsientos;

    public Sala(String id, int numeroSala) {
        this.id = id;
        this.numeroSala = numeroSala;
        this.listaAsientos = new ArrayList<>();
    }

    public void agregarAsiento(Asiento asiento) {
        this.listaAsientos.add(asiento);
        this.capacidadMaxima++;
    }

    public List<Asiento> getListaAsientos() {
        return listaAsientos;
    }
}
