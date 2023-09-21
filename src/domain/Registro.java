package domain;

public class Registro {
	
	//fecha
	//cabina
	//hora
	//vehiculo

	//getMontACobrar()
	
	private Integer fecha;
	private String cabina;
	private Integer hora;	
	private String vehiculo;
	public Integer getFecha() {
		return fecha;
	}
	public void setFecha(Integer fecha) {
		this.fecha = fecha;
	}
	public String getCabina() {
		return cabina;
	}
	public void setCabina(String cabina) {
		this.cabina = cabina;
	}
	public Integer getHora() {
		return hora;
	}
	public void setHora(Integer hora) {
		this.hora = hora;
	}
	public String getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}
	public Registro(Integer fecha, String cabina, Integer hora, String vehiculo) {
		super();
		this.fecha = fecha;
		this.cabina = cabina;
		this.hora = hora;
		this.vehiculo = vehiculo;
	}
	@Override
	public String toString() {
		return "Registro [fecha=" + fecha + ", cabina=" + cabina + ", hora=" + hora + ", vehiculo=" + vehiculo + "]";
	}
	
	
	
	public int getMontACobrar() {
		return fecha;
		
	}
	
	
	


}
