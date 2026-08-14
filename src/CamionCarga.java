public class CamionCarga extends Vehiculo{
    private double capacidadToneladas;

    public CamionCarga() {

    }

    public CamionCarga(double capacidadToneladas) {
        this.capacidadToneladas = capacidadToneladas;
    }

    public CamionCarga(String placa, String marca, String modelo, int año, double precioBase, double capacidadToneladas) {
        super(placa, marca, modelo, año, precioBase);
        this.capacidadToneladas = capacidadToneladas;
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public void setCapacidadToneladas(double capacidadToneladas) {
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public String toString() {
        return "CamionCarga{" +
                "capacidadToneladas=" + capacidadToneladas +
                '}';
    }
}
