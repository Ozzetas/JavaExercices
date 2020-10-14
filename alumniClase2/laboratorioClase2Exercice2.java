package alumniClase2;

public class laboratorioClase2Exercice2 {

	public static void main(String[] args) {
		int a = -10;
		int b = 2;
		int c = 5;
		
		if( a > 0 & b > 0) {
			System.out.println("a * b = " + (a * b));
		} else {
			if(a > 0 & c > 0) {
				System.out.println("a * c = " + (a * c));
			} else {
				System.out.println("b * c = " + (b * c));
			}
		}
	}

}
