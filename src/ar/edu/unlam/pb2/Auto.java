package ar.edu.unlam.pb2;

public class Auto extends Vehiculo {

	private String patente;
	private Integer cantidadMaximaDePasajeros;
	private Integer velocidadMaxima;
	
	public Auto(String patente,  Integer cantidadMaximaDePasajeros, Integer velocidadMaxima, Double latitud,
			Double longitud) {
		super(latitud, longitud);
		this.patente = patente;
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getCantidadMaximaDePasajeros() {
		return cantidadMaximaDePasajeros;
	}

	public void setCantidadMaximaDePasajeros(Integer cantidadMaximaDePasajeros) {
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	
}
