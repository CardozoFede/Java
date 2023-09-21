package domain;

public enum CategoriaVehiculo {
	
	AUTO (100.0),
	MOTO (50.0),
	CAMION (250.0);
	
	private Double precio;

	private CategoriaVehiculo(Double precio) {
		this.precio = precio;
	}

	public Double getPrecio() {
		return precio;
	}

	

	
	//solo gettets en enum
	
	
	

}
