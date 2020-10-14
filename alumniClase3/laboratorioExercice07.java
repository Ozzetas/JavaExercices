package alumniClase3;

public class laboratorioExercice07 {

	public static void main(String[] args) {
		int n = 1;
		int sumatoria = 0;
		while (n <= 25) {
			if (n % 2 == 0) {
				sumatoria += n;
				System.out.println(sumatoria);
			}
			n++;
		}

	}

}
