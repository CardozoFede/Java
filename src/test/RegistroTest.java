package test;

import java.util.Arrays;
import java.util.List;

import domain.Cabina;
import domain.Registro;

public class RegistroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Registro registro = new Registro(12-10-2022, "cabina1", 12, "AUTO");
		Registro registro1 = new Registro(12-10-2022, "cabina2", 11, "AUTO");
		Registro registro2 = new Registro(12-10-2022, "cabina3", 10, "AUTO");
		Registro registro3 = new Registro(12-10-2022, "cabina1", 9, "AUTO");
		Registro registro4 = new Registro(12-10-2022, "cabina2", 8, "AUTO");
		
		List<Registro> otrasRegistros = Arrays.asList(registro, registro1, registro2, registro3, registro4);
		
		for (Registro regi : otrasRegistros) {
			
			System.out.println("LA HORA DE LOS MOVIMIENTOS REGISTRADOS SON: ");			
				System.out.println(regi.getHora() + "Hs");
			}
		}

	}


