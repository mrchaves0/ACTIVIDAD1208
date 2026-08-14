public class Motocicleta extends Vehiculo{

    private int cilindraje;

    public Motocicleta (){

    }

    public Motocicleta(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Motocicleta(String placa, String marca, String modelo, int año, double precioBase, int cilindraje) {
        super(placa, marca, modelo, año, precioBase);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "cilindraje=" + cilindraje +
                '}';
    }
}
