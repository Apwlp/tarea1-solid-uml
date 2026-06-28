package Java.Entidades;
import java.util.List;
import Java.Abstract.Asiento;
import Java.Abstract.EstadoAsiento;
import Java.Actores.Usuario;

public class Reserva {
    private String id;
    private Usuario usuario;
    private Funcion funcion;
    private List<Asiento> asientosSeleccionados;
    private double montoTotal;
    private boolean pagado;

    public Reserva(Usuario usuario, Funcion funcion, List<Asiento> asientos) {
        this.id = java.util.UUID.randomUUID().toString();
        this.usuario = usuario;
        this.funcion = funcion;
        this.asientosSeleccionados = asientos;
        this.pagado = false;
        calcularMontoTotal();
    }

    public void calcularMontoTotal() {
        montoTotal = 0;
        for (Asiento asiento : asientosSeleccionados) {
            montoTotal += asiento.calcularPrecioFinal();
        }
    }

    public void registrarPago() {
        this.pagado = true;
        for (Asiento asiento : asientosSeleccionados) {
            asiento.setEstado(EstadoAsiento.RESERVADO);
        }
        System.out.println("Pago registrado. Monto: $" + montoTotal);
    }

    public List<Asiento> getAsientosSeleccionados() {
        return asientosSeleccionados;
    }
}
