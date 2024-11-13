package GestionVehiculos;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;

public class GestorDeDatos {

	private static final ObjectMapper mapper = new ObjectMapper();


	public void guardarVehiculo(Vehiculo vehiculo, String fileName) {
		try {
			mapper.writeValue(new File(fileName), vehiculo);
			System.out.println("Vehiculo guardado en " + fileName);
		} catch (Exception e) {
			System.err.println("Error al guardar el vehiculo en " + fileName + ": " + e.getMessage());
		}
	}

	public void guardarVehiculosLista(ArrayList<Vehiculo> vehiculos, String fileName) {
		try {
			mapper.writeValue(new File(fileName), vehiculos);
			System.out.println("Lista de vehiculos guardada en " + fileName);
		} catch (Exception e) {
			System.err.println("Error al guardar la lista de vehiculos en " + fileName + ": " + e.getMessage());
		}
	}

	public Vehiculo leerVehiculos(String fileName) {
		try {
			return mapper.readValue(new File(fileName), Vehiculo.class);
		} catch (Exception e) {
			System.err.println("Error al leer el vehiculo desde " + fileName + ": " + e.getMessage());
			return null;
		}
	}

	public ArrayList<Vehiculo> leerVehiculosLista(String fileName) {
		try {
			return mapper.readValue(new File(fileName),
					mapper.getTypeFactory().constructCollectionType(ArrayList.class, Vehiculo.class));
		} catch (Exception e) {
			System.err.println("Error al leer la lista de vehiculos desde " + fileName + ": " + e.getMessage());
			return null;
		}
	}
}