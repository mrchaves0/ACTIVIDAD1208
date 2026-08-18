/**
 * Representa un automóvil.
 * (Versión esqueleto: estructura y firmas de métodos, sin lógica todavía)
 */
public class Automovil extends Vehiculo {

    private int numeroPuertas;
    private String tipoCombustible;

    public Automovil(String placa, String marca, String modelo, int anio, double precioBase,
                     int numeroPuertas, String tipoCombustible) {
        super(placa, marca, modelo, anio, precioBase);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public double calcularPrecioFinal() {
        // TODO: aplicar 8% de impuesto (4% si es Eléctrico)
        return 0;
    }

    @Override
    public String mostrarFicha() {
        return super.mostrarFicha() + "\nTipo: Automóvil | Puertas: " + numeroPuertas
                + " | Combustible: " + tipoCombustible;
    }
}