package domain;

import java.util.List;

public class Cabina {

	//-id
	//-estacion
	//-medioPago
	//+registrarVehiculo(estacion, cabina, vehiculo)
	
	private Integer id;
	private String estacion;
	private String medioPago;
	private Integer registro;
	public List<Cabina> otrasCabinas;

	
	public List<Cabina> getOtrasCabinas() {
		return otrasCabinas;
	}
	public void setOtrasCabinas(List<Cabina> otrasCabinas) {
		this.otrasCabinas = otrasCabinas;
	}
	public Integer getRegistro() {
		return registro;
	}
	public void setRegistro(Integer registro) {
		this.registro = registro;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEstacion() {
		return estacion;
	}
	public void setEstacion(String estacion) {
		this.estacion = estacion;
	}
	public String getMedioPago() {
		return medioPago;
	}
	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}
	public Cabina(Integer id, String estacion, String medioPago, Integer registro) {
		super();
		this.id = id;
		this.estacion = estacion;
		this.medioPago = medioPago;
		this.registro = registro;
	}
	
	public Cabina(List<Cabina> otrasCabinas) {
		super();
		this.otrasCabinas = otrasCabinas;
	}
	@Override
	public String toString() {
		return "Cabina [id=" + id + ", estacion=" + estacion + ", medioPago=" + medioPago + ", registro=" + registro
				+ "]";
	}
	
	//public String cabinaEfectivo() {
		//for (Cabina cabi : otrasCabinas) {
			//if (cabi.getMedioPago() == "EFECTIVO") {
				//System.out.println(cabi.toString());
			//}
		//}
		//return toString();
		
		
	}

