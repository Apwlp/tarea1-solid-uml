package Java.Asientos;
import Java.Abstract.Asiento;

public class AsientoEstandar extends Asiento {
    public AsientoEstandar(String id, char fila, int columna) {
        super(id, fila, columna);
    }

    @Override
    public double calcularPrecioFinal() {
        return this.precioBase;
    }
}
