package domain;

public class Efectivo extends MedioPago {

	public Efectivo(String descripcion, Integer diasDemora) {
		super(descripcion, diasDemora);
		// TODO Auto-generated constructor stub
		
		
	}

	@Override
	public String toString() {
		return "Efectivo [getDescripcion()=" + getDescripcion() + ", getDiasDemora()=" + getDiasDemora()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

	public int descuento() {
		return 0 ;
	}
}
