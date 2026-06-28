package Java.Asientos;
import Java.Abstract.Asiento;

public class AsientoVIP extends Asiento {
    private double factorComodida = 1.5;
    
    public AsientoVIP(String id, char fila, int columna) {
        super(id, fila, columna);
    }

    @Override
    public double calcularPrecioFinal() {
        return this.precioBase * factorComodida;
    }

    public void reclinarAsiento() {
        System.out.println("Asiento reclinado.");
    }
}
