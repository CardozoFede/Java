package domain;

public class Pase extends MedioPago {

	public Pase(String descripcion, Integer diasDemora) {
		super(descripcion, diasDemora);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pase [getDescripcion()=" + getDescripcion() + ", getDiasDemora()=" + getDiasDemora() + ", toString()="
				+ super.toString() + ", descuento()=" + descuento() + ", getClass()=" + getClass() + "]";
	}
	
	public int descuento() {
		return 0 ;
		

}

}