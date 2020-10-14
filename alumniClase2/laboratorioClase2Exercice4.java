package alumniClase2;

import java.util.Scanner;

public class laboratorioClase2Exercice4 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Ingrese dos numeros: ");
		
		int nro1 = myObj.nextInt();
		int nro2 = myObj.nextInt();
		
		System.out.println("MENU:\n1 - Suma\n2 - Resta\n3 - Producto\n4 - Division");
		
		int opcion = myObj.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("La suma entre nro1 = " + nro1 + " y nro2 = " + nro2 + " es igual a: " + (nro1 + nro2));
			break;
		case 2:
			System.out.println("La resta entre nro1 = " + nro1 + " y nro2 = " + nro2 + " es igual a: " + (nro1 - nro2));
			break;
		case 3:
			System.out.println("El producto entre nro1 = " + nro1 + " y nro2 = " + nro2 + " es igual a: " + (nro1 * nro2));
			break;
		case 4:
			System.out.println("La division entre nro1 = " + nro1 + " y nro2 = " + nro2 + " es igual a: " + (nro1 / nro2));
			break;
		default:
			System.out.println("Por favor elija una opcion!");
			break;
		}
	}
}
