package domain;

public class Sube extends MedioPago{

	public Sube(String descripcion, Integer diasDemora) {
		super(descripcion, diasDemora);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Sube [getDescripcion()=" + getDescripcion() + ", getDiasDemora()=" + getDiasDemora() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + "]";
	}


	public int descuento() {
		return 9 ;

		//diasDemora <-?
		//descuento()
	}
}
