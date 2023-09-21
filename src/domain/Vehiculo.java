package domain;

import java.util.Objects;

public class Vehiculo {

	private String patente;
	private CategoriaVehiculo categoria;

	public CategoriaVehiculo getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaVehiculo categoria) {
		this.categoria = categoria;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Vehiculo(String string, CategoriaVehiculo categoria) {
		super();
		this.patente = string;
		this.categoria = categoria;
	}

	

	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", categoria=" + categoria + ", categoria=" + categoria.getPrecio() + "]";
	}

	public String getPatente() {
		return patente;

	}

	@Override
	public int hashCode() {
		return Objects.hash(patente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(patente, other.patente);
	}
	
	//public String cobrar(String categoria) {
		//for (Vehiculo vehi : Vehiculo.getCategoria()) {
			
		//}		
	
		//return categoria ;
	
	public int cobrar(int a, int b) {
		
		
		
		
		
		return 0;
		
	}
		
	
	 
}