import java.util.ArrayList;

/**
 * Clase principal.
 * (Versión esqueleto: solo crea el inventario e instancia los vehículos,
 * llamando a las clases. La lógica de validación y cálculo se completa después.)
 */
public class Main {

    public static void agregarVehiculo(ArrayList<Vehiculo> inventario, Vehiculo v) {
        inventario.add(v);
    }

    public static void listarInventario(ArrayList<Vehiculo> inventario) {
        for (Vehiculo v : inventario) {
            System.out.println(v.mostrarFicha());
        }
    }

    public static double calcularValorTotalInventario(ArrayList<Vehiculo> inventario) {
        double total = 0;
        for (Vehiculo v : inventario) {
            total += v.calcularPrecioFinal();
        }
        return total;
    }

    public static Vehiculo buscarPorPlaca(ArrayList<Vehiculo> inventario, String placa) {
        for (Vehiculo v : inventario) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                return v;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Vehiculo> inventario = new ArrayList<>();

        agregarVehiculo(inventario, new Automovil("ABC123", "Mazda", "3", 2022, 35000000, 4, "Gasolina"));
        agregarVehiculo(inventario, new Automovil("TES500", "Tesla", "Model 3", 2023, 90000000, 4, "Eléctrico"));

        agregarVehiculo(inventario, new Motocicleta("XYZ789", "Yamaha", "MT-07", 2023, 25000000, 689));
        agregarVehiculo(inventario, new Motocicleta("MOT111", "Honda", "CB190R", 2021, 9000000, 184));

        agregarVehiculo(inventario, new CamionCarga("CAM456", "Kenworth", "T800", 2021, 150000000, 12.0));
        agregarVehiculo(inventario, new CamionCarga("CAM789", "Volvo", "FH16", 2020, 130000000, 8.0));

        listarInventario(inventario);
    }
}