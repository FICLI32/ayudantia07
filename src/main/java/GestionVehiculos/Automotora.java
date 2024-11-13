package GestionVehiculos;

import java.util.ArrayList;
import GestionVehiculos.Vehiculo;

public class Automotora {
	private String nombre;
	private GestorDeDatos gestorDeDatos;
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	public Automotora (String nombre) {
		this.nombre = nombre;
		this.gestorDeDatos = new GestorDeDatos();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}

	public void listarVehiculos() {
		System.out.println(vehiculos);
	}

	public void cargarVehiculos(String fileName){
		ArrayList<Vehiculo> vehiculosCargados = gestorDeDatos.leerVehiculosLista(fileName);
		if (vehiculosCargados != null){
			this.vehiculos = vehiculosCargados;
		}else{
			System.out.println("no hay vehiculos");
		}
	}

	public void mostrarDetallesVehiculos() {
		for (Vehiculo vehiculo : vehiculos){
			vehiculo.detallesVehiculo();
		}
	}

	public void almacenarVehiculosLista(ArrayList<Vehiculo> vehiculos, String fileName) {
		gestorDeDatos.guardarVehiculosLista(vehiculos,fileName);
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}
}