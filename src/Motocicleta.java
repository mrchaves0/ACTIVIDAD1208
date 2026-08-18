/**
 * Representa una motocicleta.
 * (Versión esqueleto: estructura y firmas de métodos, sin lógica todavía)
 */
public class Motocicleta extends Vehiculo {

    private int cilindraje;

    public Motocicleta(String placa, String marca, String modelo, int anio, double precioBase,
                       int cilindraje) {
        super(placa, marca, modelo, anio, precioBase);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularPrecioFinal() {
        // TODO: aplicar 3% de impuesto (+2% si cilindraje > 500)
        return 0;
    }

    @Override
    public String mostrarFicha() {
        return super.mostrarFicha() + "\nTipo: Motocicleta | Cilindraje: " + cilindraje + " c.c.";
    }
}