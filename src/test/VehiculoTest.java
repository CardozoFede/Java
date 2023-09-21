package test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import domain.Cabina;
import domain.CategoriaVehiculo;
import domain.Concesion;
import domain.Efectivo;
import domain.Estacion;
import domain.MedioPago;
import domain.Pase;
import domain.Registro;
import domain.Sube;
import domain.Vehiculo;

public class VehiculoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Concesion concesion = new Concesion("ACCESO OESTE");
		Concesion concesion2 = new Concesion("PANAMERICANA");
		List<Concesion> otrasConcesion = Arrays.asList(concesion, concesion2);
		concesion.add("ACCESO OESTE");
		concesion2.add("PANAMERICANA");
		System.out.println(otrasConcesion);
		System.out.println();

		Estacion estacion = new Estacion(1, "ituzaingo", "cabina");
		Estacion estacion2 = new Estacion(2, "moron", "cabinaDos");
		Estacion estacion3 = new Estacion(3, "haedo", "cabinaTres");
		Estacion estacion21 = new Estacion(21, "Tigre", "cabinaDosUno");
		Estacion estacion22 = new Estacion(22, "pilar", "cabinaDosDos");
		Estacion estacion23 = new Estacion(23, "garin", "cabinaDosTres");
		List<Estacion> otrasEstacion = Arrays.asList(estacion, estacion2, estacion3);
		List<Estacion> otrasEstacion2 = Arrays.asList(estacion21, estacion22, estacion23);
		System.out.println(otrasEstacion);
		System.out.println(otrasEstacion2);
		System.out.println();

		MedioPago sube = new Sube("10% menos", 0);
		MedioPago pase = new Pase("15% menos", 5);
		MedioPago efectivo = new Efectivo("No tiene descuento menos", 0);
		List<MedioPago> otrasPagos = Arrays.asList(sube, pase, efectivo);
		System.out.println(otrasPagos);
		System.out.println();

		// System.out.println(estacion.cabinasConEfectivo());

		Vehiculo vehiculo = new Vehiculo("AB234CV", CategoriaVehiculo.AUTO);
		System.out.println("Vehiculo: " + vehiculo.toString());
		System.out.println("Vehiculo precio: " + vehiculo.getCategoria().getPrecio());

		Vehiculo moto = new Vehiculo("AC345FV", CategoriaVehiculo.MOTO);
		System.out.println("Vehiculo: " + moto.toString());
		System.out.println("Vehiculo precio: " + moto.getCategoria().getPrecio());

		Vehiculo camion = new Vehiculo("AD852XX", CategoriaVehiculo.CAMION);
		System.out.println("Vehiculo: " + camion.toString());
		System.out.println("Vehiculo precio: " + camion.getCategoria().getPrecio());

		List<Vehiculo> otrosVehiculos = Arrays.asList(vehiculo, moto, camion);
		System.out.println(otrosVehiculos);
		System.out.println();

		System.out.println("INGRESE EL VEHICULO A REGISTRAR: 1 = AUTO , 2 = MOTO, 3 = CAMION??");
		int a = sc.nextInt();

		// if(a != 1 || a !=2 || a!=3) {
		// System.out.println("DATOS INCORRECTOS");

		// break;
		// }

		System.out.println("INDIQUE LA HORA DEL REGISTRO:");
		int b = sc.nextInt();
		//System.out.println("INDIQUE LOS MINUTOS DEL REGISTRO:");
		//int h = sc.nextInt();
		
		//System.out.println("LA HORA DEL REGISTRO ES: " + b + ":" + h + " Hs");
		System.out.println();

		// cobrar
		for (Vehiculo vehiculo2 : otrosVehiculos) {
			switch (a) {
			case 1:
				if ((a == 1) && (b >= 6 && b <= 10) || (b >= 17 && b <= 20)) {
					int c = (int) ((int) (((CategoriaVehiculo.AUTO.getPrecio() * 8) / 100))
							+ CategoriaVehiculo.AUTO.getPrecio());
					System.out.println("ES HORA PICO, EL PRECIO A COBRAR ES: " + c);
					System.out.println();
					System.out.println("INDIQUE EL MEDIO DE PAGO, 1 = SUBE, 2 = PASE, 3 = EFECTIVO??");
					int x = sc.nextInt();
					if (x == 1) {
						double d = ((c - (c * 10) / 100));
						System.out.println("EL IMPORTE A PAGAR CON SUBE ES: " + d);
					}
					if (x == 2) {
						double e = ((c - (c * 15) / 100));
						System.out.println("EL IMPORTE A PAGAR CON PASE ES: " + e);
					}
					if (x == 3) {

						System.out.println("EL IMPORTE A PAGAR CON EFECTIVO ES: " + c);
					}
				} else if (a == 1) {
					System.out.print("EL PRECIO A COBRAR ES: ");
					System.out.println(CategoriaVehiculo.AUTO.getPrecio());
					System.out.println();
					System.out.println("INDIQUE EL MEDIO DE PAGO, 1 = SUBE, 2 = PASE, 3 = EFECTIVO??");
					int x = sc.nextInt();
					if (x == 1) {
						double d = ((CategoriaVehiculo.AUTO.getPrecio()
								- (CategoriaVehiculo.AUTO.getPrecio() * 10) / 100));
						System.out.println("EL IMPORTE A PAGAR CON SUBE ES: " + d);
					}
					if (x == 2) {
						double e = ((CategoriaVehiculo.AUTO.getPrecio()
								- (CategoriaVehiculo.AUTO.getPrecio() * 15) / 100));
						System.out.println("EL IMPORTE A PAGAR CON PASE ES: " + e);
					}
					if (x == 3) {

						System.out.println("EL IMPORTE A PAGAR CON EFECTIVO ES: " + CategoriaVehiculo.AUTO.getPrecio());
					}
				}

				break;
			case 2:
				if ((a == 2) && (b >= 6 && b <= 10) || (b >= 17 && b <= 20)) {
					int c = (int) ((int) (((CategoriaVehiculo.MOTO.getPrecio() * 8) / 100))
							+ CategoriaVehiculo.MOTO.getPrecio());
					System.out.println("ES HORA PICO, EL PRECIO A COBRAR ES: " + c);
					System.out.println();
					System.out.println("INDIQUE EL MEDIO DE PAGO, 1 = SUBE, 2 = PASE, 3 = EFECTIVO??");
					int x = sc.nextInt();
					if (x == 1) {
						double d = (double) ((c - (c * 10) / 100));
						System.out.println("EL IMPORTE A PAGAR CON SUBE ES: " + d);
					}
					if (x == 2) {
						double e = (double) ((c - (c * 15) / 100));
						System.out.println("EL IMPORTE A PAGAR CON PASE ES: " + e);
					}
					if (x == 3) {

						System.out.println("EL IMPORTE A PAGAR CON EFECTIVO ES: " + c);
					}
				} else if (a == 2) {
					System.out.print("EL PRECIO A COBRAR ES: ");
					System.out.println(CategoriaVehiculo.MOTO.getPrecio());
					System.out.println();
					System.out.println("INDIQUE EL MEDIO DE PAGO, 1 = SUBE, 2 = PASE, 3 = EFECTIVO??");
					int x = sc.nextInt();
					if (x == 1) {
						double d = ((CategoriaVehiculo.MOTO.getPrecio()
								- (CategoriaVehiculo.MOTO.getPrecio() * 10) / 100));
						System.out.println("EL IMPORTE A PAGAR CON SUBE ES: " + d);
					}
					if (x == 2) {
						double e = ((CategoriaVehiculo.MOTO.getPrecio()
								- (CategoriaVehiculo.MOTO.getPrecio() * 15) / 100));
						System.out.println("EL IMPORTE A PAGAR CON PASE ES: " + e);
					}
					if (x == 3) {

						System.out.println("EL IMPORTE A PAGAR CON EFECTIVO ES: " + CategoriaVehiculo.MOTO.getPrecio());
					}
				}

				break;
			case 3:
				if ((a == 3) && (b >= 6 && b <= 10) || (b >= 17 && b <= 20)) {
					double c = (double) (((CategoriaVehiculo.CAMION.getPrecio() * 8) / 100))
							+ CategoriaVehiculo.CAMION.getPrecio();
					System.out.println("ES HORA PICO, EL PRECIO A COBRAR ES: " + c);
					System.out.println();
					System.out.println("INDIQUE EL MEDIO DE PAGO, 1 = SUBE, 2 = PASE, 3 = EFECTIVO??");
					int x = sc.nextInt();
					if (x == 1) {
						double d = ((c - ((c * 10) / 100)));
						System.out.println("EL IMPORTE A PAGAR CON SUBE ES: " + d);
					}
					if (x == 2) {
						double e = ((c - (c * 15) / 100));
						System.out.println("EL IMPORTE A PAGAR CON PASE ES: " + e);
					}
					if (x == 3) {

						System.out.println("EL IMPORTE A PAGAR CON EFECTIVO ES: " + c);
					}

				} else if (a == 3) {
					System.out.print("EL PRECIO A COBRAR ES: ");
					System.out.println(CategoriaVehiculo.CAMION.getPrecio());
					System.out.println();
					System.out.println("INDIQUE EL MEDIO DE PAGO, 1 = SUBE, 2 = PASE, 3 = EFECTIVO??");
					int x = sc.nextInt();
					if (x == 1) {
						double d = ((CategoriaVehiculo.CAMION.getPrecio()
								- (CategoriaVehiculo.CAMION.getPrecio() * 10) / 100));
						System.out.println("EL IMPORTE A PAGAR CON SUBE ES: " + d);
					}
					if (x == 2) {
						double e = ((CategoriaVehiculo.CAMION.getPrecio()
								- (CategoriaVehiculo.CAMION.getPrecio() * 15) / 100));
						System.out.println("EL IMPORTE A PAGAR CON PASE ES: " + e);
					}
					if (x == 3) {

						System.out
								.println("EL IMPORTE A PAGAR CON EFECTIVO ES: " + CategoriaVehiculo.CAMION.getPrecio());
					}
				}

				break;
			}
			break;
		}

	}

}
