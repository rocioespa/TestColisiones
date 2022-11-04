package ar.edu.unlam.pb2;

public class Moto extends Vehiculo {
	
	private String patente;
	private final Integer CAPACIDA_MAXIMA_DE_PASAJEROS = 2;
	private Integer velocidadMaxima;
	
	public Moto(String patente,Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.patente = patente;
		this.velocidadMaxima = velocidadMaxima;
	}

	
	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}


	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public Integer getCAPACIDA_MAXIMA_DE_PASAJEROS() {
		return CAPACIDA_MAXIMA_DE_PASAJEROS;
	}
	
	

}
