package Java.Entidades;
import Java.Abstract.Asiento;

public class TemporizadorReserva {
    private int tiempoLimiteMinutos;
    private Reserva reservaAsociada;

    public TemporizadorReserva(int tiempoLimite, Reserva reserva) {
        this.tiempoLimiteMinutos = tiempoLimite;
        this.reservaAsociada = reserva;
    }

    public void iniciarCuentaRegresiva() {
        System.out.println("Iniciando temporizador de " + tiempoLimiteMinutos + " minutos.");
    }

    public void ejecutarLiberacion() {
        System.out.println("Tiempo expirado. Liberando asientos...");
        for(Asiento a : reservaAsociada.getAsientosSeleccionados()) {
            a.liberar();
        }
    }
}
