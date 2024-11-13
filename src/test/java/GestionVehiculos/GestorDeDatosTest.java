package GestionVehiculos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.ArrayList;

public class GestorDeDatosTest {
    private final GestorDeDatos gestorDeDatos = new GestorDeDatos();
    private final String testFile = "vehiculosTest.json";

    @Test
    public void testGuardarYLeerVehiculo() {
        Auto auto = new Auto("Honda", "Civic", 2021, 22000, 5);
        gestorDeDatos.guardarVehiculo(auto, testFile);

        Vehiculo vehiculoLeido = gestorDeDatos.leerVehiculos(testFile);
        assertNotNull(vehiculoLeido);
        assertEquals("Honda", vehiculoLeido.getMarca());

        // Limpiar archivo de prueba
        new File(testFile).delete();
    }

    @Test
    public void testGuardarYLeerListaDeVehiculos() {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto("Ford", "Focus", 2019, 18000, 5));
        vehiculos.add(new Bicicleta("Trek", "Marlin 5", 2020, 700, "montaña"));

        gestorDeDatos.guardarVehiculosLista(vehiculos, testFile);

        ArrayList<Vehiculo> vehiculosLeidos = gestorDeDatos.leerVehiculosLista(testFile);
        assertNotNull(vehiculosLeidos);
        assertEquals(2, vehiculosLeidos.size());

        // Limpiar archivo de prueba
        new File(testFile).delete();
    }
}
