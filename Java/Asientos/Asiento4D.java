package Java.Asientos;
import Java.Abstract.Asiento;

public class Asiento4D extends Asiento {
    private double factorEfectos = 2.0;

    public Asiento4D(String id, char fila, int columna) {
        super(id, fila, columna);
    }

    @Override
    public double calcularPrecioFinal() {
        return this.precioBase * factorEfectos;
    }

    public void activarEfectosEspeciales() {
        System.out.println("Efectos 4D activados");
    }
}
