package GestionVehiculos;

public class Camion extends Vehiculo {
	private double capacidadCarga;
	private String tipo;

	public Camion(String marca, String modelo, int anio, double precio, double capacidadCarga) {
		super(marca, modelo, anio, precio);
		this.capacidadCarga = capacidadCarga;
		this.tipo = "camion";
	}

	public Camion() {}

	public String getTipo() {
		return tipo;
	}

	@Override
	public void detallesVehiculo() {
		super.detallesVehiculo();
		System.out.println("Capacidad de carga: " + capacidadCarga);
	}
}