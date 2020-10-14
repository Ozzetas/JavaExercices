package alumniClase3;

public class laboratorioExercice08 {

	public static void main(String[] args) {
		int n = -10;
		int resultado = 1;
		while (n <= 10) {
			if (n % 2 != 0) {
				resultado *= n;
				System.out.println(resultado);
			}
			n++;
		}

	}

}
