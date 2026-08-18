/**
 * Representa un camión de carga.
 * (Versión esqueleto: estructura y firmas de métodos, sin lógica todavía)
 */
public class CamionCarga extends Vehiculo {

    private double capacidadToneladas;

    public CamionCarga(String placa, String marca, String modelo, int anio, double precioBase,
                       double capacidadToneladas) {
        super(placa, marca, modelo, anio, precioBase);
        this.capacidadToneladas = capacidadToneladas;
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public void setCapacidadToneladas(double capacidadToneladas) {
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public double calcularPrecioFinal() {
        // TODO: aplicar 5% de impuesto + $500.000 por tonelada
        return 0;
    }

    @Override
    public String mostrarFicha() {
        return super.mostrarFicha() + "\nTipo: Camión de carga | Capacidad: " + capacidadToneladas + " ton";
    }
}