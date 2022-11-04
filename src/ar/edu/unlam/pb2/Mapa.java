package ar.edu.unlam.pb2;

import java.util.*;

public class Mapa {

	private String nombre;
	private Set<Vehiculo> vehiculos;

	public Mapa(String nombre) {
		super();
		this.nombre = nombre;
		this.vehiculos = new HashSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Set<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public void agregarVehiculo(Vehiculo v) {
		this.vehiculos.add(v);

	}

	public Boolean hayCoalición() throws ColitionException {
		for (Vehiculo vehiculo : vehiculos) {
			for (Vehiculo vehiculo2 : vehiculos) {
				if (vehiculo.getLatitud().equals(vehiculo2.getLatitud())
						&& vehiculo.getLongitud().equals(vehiculo2.getLongitud())) {
					throw new ColitionException();
				}
				return true;

			}

		}
		return false;

	}

}
