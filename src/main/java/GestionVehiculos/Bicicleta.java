package GestionVehiculos;

public class Bicicleta extends Vehiculo {
	private String tipoBicicleta;
	private String tipo;

	public Bicicleta(String marca, String modelo, int anio, double precio, String tipoBicicleta) {
		super(marca, modelo, anio, precio);
		this.tipoBicicleta = tipoBicicleta;
		this.tipo = "bicicleta";
	}

	public Bicicleta() {}

	public String getTipo() {
		return tipo;
	}

	@Override
	public void detallesVehiculo() {
		super.detallesVehiculo();
		System.out.println("Tipo de Bicicleta: " + tipoBicicleta);
	}
}