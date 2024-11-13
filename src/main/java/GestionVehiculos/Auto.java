package GestionVehiculos;

public class Auto extends Vehiculo {

	private int cantidadPasajeros;
	private String tipo;

	public Auto(String marca, String modelo, int anio, double precio, int cantidadPasajeros) {
		super(marca, modelo, anio, precio);
		this.cantidadPasajeros = cantidadPasajeros;
		this.tipo = "auto";
	}

	public Auto() {
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public void detallesVehiculo() {
		super.detallesVehiculo();
		System.out.println("Cantidad de pasajeros: " + cantidadPasajeros);
	}

}