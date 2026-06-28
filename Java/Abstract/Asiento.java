package Java.Abstract;

public abstract class Asiento {
    protected String id;
    protected char fila;
    protected int columna;
    protected EstadoAsiento estado;
    protected double precioBase;

    public Asiento(String id, char fila, int columna) {
        this.id = id;
        this.fila = fila;
        this.columna = columna;
        this.estado = EstadoAsiento.DISPONIBLE;
        this.precioBase = 5.0; // Precio por defecto (ejemplo)
    }

    public abstract double calcularPrecioFinal();

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void bloquear() {
        this.estado = EstadoAsiento.EN_PROCESO_COMPRA;
    }

    public void liberar() {
        this.estado = EstadoAsiento.DISPONIBLE;
    }

    public EstadoAsiento getEstado() {
        return this.estado;
    }







}
