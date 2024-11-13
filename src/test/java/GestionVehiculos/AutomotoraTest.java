package GestionVehiculos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutomotoraTest {
    private Automotora automotora;
    private Auto auto;
    private Bicicleta bicicleta;
    private Camion camion;

    @BeforeEach
    public void setUp() {
        automotora = new Automotora("Automotora Pruebas");
        auto = new Auto("Toyota", "Corolla", 2022, 20000, 5);
        bicicleta = new Bicicleta("Giant", "Escape 3", 2021, 500, "urbana");
        camion = new Camion("Volvo", "FH16", 2020, 90000, 30);
    }

    @Test
    public void testAgregarVehiculo() {
        automotora.agregarVehiculo(auto);
        automotora.agregarVehiculo(bicicleta);
        automotora.agregarVehiculo(camion);

        assertEquals(3, automotora.getVehiculos().size());
    }

    @Test
    public void testMostrarDetallesVehiculos() {
        automotora.agregarVehiculo(auto);
        automotora.agregarVehiculo(bicicleta);

        assertDoesNotThrow(() -> automotora.mostrarDetallesVehiculos());
    }
}
