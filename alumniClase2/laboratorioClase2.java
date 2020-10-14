package alumniClase2;

public class laboratorioClase2 {

	public static void main(String[] args) {
		int nro1 = 900;
		int nro2 = 700;
		int nro3 = 650;
		int may = 0;
		
		if (nro1 > nro2 & nro1 > nro2) {
			System.out.println("El nro1: " + nro1 + " es el mayor.");
		} else {
			if(nro2 > nro1 & nro2 > nro3) {
				System.out.println("El nro2: " + nro2 + " es el mayor.");
			} else {
				System.out.println("El nro3: " + nro3 + " es el mayor.");
			}
		}
	}
}
