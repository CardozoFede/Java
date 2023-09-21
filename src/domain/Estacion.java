package domain;

import java.util.Arrays;
import java.util.List;

public class Estacion {
	
	/*-id 
	 -nombre
	 -cabinas
	 
	 +dameHoraActual()
	 addCabina(estacion, ,medioPago)
	*/
	private Integer id;
	private String nombre;
	private String cabinas;
		
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCabinas() {
		return cabinas;
	}
	public void setCabinas(String cabinas) {
		this.cabinas = cabinas;
	}
	public Estacion(Integer id, String nombre, String cabinas) {
		this.id = id;
		this.nombre = nombre;
		this.cabinas = cabinas;
	}
	@Override
	public String toString() {
		return "Estacion [id=" + id + ", nombre=" + nombre + ", cabinas=" + cabinas + "]";
	}
	
	 public int dameHoraActual() {
		return id;		 
	 }
		 
	 public String addCabina(){//(estacion, medioPago//) {
		return cabinas;
	 }
	 
	 //public String cabinasConEfectivo(){
		// for (Cabina otrasCabinas : otrasCabina) {
			 	//System.out.println(cabinas.);
			 	//}
			 
		
		 
		//return cabinas;
		 
	// }
		
	 
	}



