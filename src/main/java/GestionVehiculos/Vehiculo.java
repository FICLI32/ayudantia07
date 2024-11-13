package GestionVehiculos;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "tipo")
@JsonSubTypes({
		@JsonSubTypes.Type(value = Camion.class, name = "camion"),
		@JsonSubTypes.Type(value = Auto.class, name = "auto"),
		@JsonSubTypes.Type(value = Bicicleta.class, name = "bicicleta")
})

public abstract class Vehiculo {
	private String marca;
	private String modelo;
	private int anio;
	private double precio;

	public Vehiculo(String marca, String modelo, int anio, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.precio = precio;
	}

	public Vehiculo() {
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return this.anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void detallesVehiculo() {
		System.out.println("Marca: "+ marca + "Modelo: "+ modelo + "Anio: " + anio + "Precio: " + precio);
	}
}