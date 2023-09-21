package domain;

//-descripcion
//-diasDemora

//+(abstract) descuento() 

abstract public class MedioPago {
private String descripcion;
private Integer diasDemora;

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public Integer getDiasDemora() {
	return diasDemora;
}

public void setDiasDemora(Integer diasDemora) {
	this.diasDemora = diasDemora;
}


public MedioPago(String descripcion, Integer diasDemora) {
	this.descripcion = descripcion;
	this.diasDemora = diasDemora;
}



@Override
public String toString() {
	return "MedioPago [descripcion=" + descripcion + ", diasDemora=" + diasDemora + "]";
}

public int descuento() {
	return diasDemora;
	
}

}
