package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import domain.Cabina;

public class CabinaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cabina cabina = new Cabina(1, "ituzaingo", "EFECTIVO", 1);
		Cabina cabina2 = new Cabina(2, "ituzaingo", "SUBE", 1);
		Cabina cabina3 = new Cabina(3, "ituzaingo", "PASE", 1);

		Cabina cabina21 = new Cabina(21, "moron", "EFECTIVO", 1);
		Cabina cabina22 = new Cabina(22, "moron", "SUBE", 1);
		Cabina cabina23 = new Cabina(23, "moron", "PASE", 1);

		Cabina cabina31 = new Cabina(31, "haedo", "EFECTIVO", 1);
		Cabina cabina32 = new Cabina(32, "haedo", "SUBE", 1);
		Cabina cabina33 = new Cabina(33, "haedo", "PASE", 1);
	    List<Cabina> otrasCabinas = Arrays.asList(cabina, cabina2, cabina3, cabina21, cabina22, cabina23, cabina31,
			cabina32, cabina33);
		
		System.out.println(cabina);
		System.out.println(cabina2);
		System.out.println(cabina3);
		System.out.println(cabina21);
		System.out.println(cabina22);
		System.out.println(cabina23);
		System.out.println(cabina31);
		System.out.println(cabina32);
		System.out.println(cabina33);
		System.out.println();
		System.out.println(otrasCabinas);
		System.out.println();
		
		//cabinas con efectivo
		System.out.println("LAS CABINAS CON EFECTIVO SON: ");
		for (Cabina cabi : otrasCabinas) {
			if (cabi.getMedioPago() == "EFECTIVO") {
				System.out.println(cabi.toString());
			}
		}

		// La explotación del método promedioDemora que devuelva cuál es el promedio de
		// días de demora entre todas las cabinas que acepten medios de pago
		// electrónicos
		// (SUBE o PASE).
		//Cada medio de pago aplica un descuento distinto al importe a abonar:
			//• En el caso de la tarjeta SUBE es un 10%.
			//• En el caso del PASE, se obtiene un 15% de descuento si la demora es menor a 5
			//días, sino un 12%.
			//• En el caso del medio de pago efectivo, por el momento no ofrece descuento, pero
			//en un futuro puede llegar a hacerlo.
		int contador = 0;
		for (Cabina cabi : otrasCabinas) {
			if (cabi.getMedioPago() == "SUBE" || cabi.getMedioPago() == "PASE") {				
				contador++;
			}
		}
		double promedio = 0.0;
		promedio = (contador * 100) / otrasCabinas.size();
		System.out.println();
		System.out.println("EL PROMEDIO DE LAS CABINAS QUE ACEPTAN PAGOS ELECTRONICOS ES DE; " + promedio + "%" );
	}
}
