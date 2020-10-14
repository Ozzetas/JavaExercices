package alumniClase2;

public class laboratorioClase2Exercice3 {

	public static void main(String[] args) {
		String usuario = "Pepito";
		String clave = "1234";
		if (usuario == "Pepito" & clave == "1234") {
			System.out.println("Bienvenido pepito!");
		} else {
			if (usuario == "Pepito" & clave != "1234") {
				System.out.println("ERROR: Contraseña incorrecta!");
			} else {
				if (usuario != "Pepito" & clave == "1234") {
					System.out.println("ERROR: Usuario incorrecto!");
				} else {
					System.out.println("ERROR: Usuario y contraseña incorrectos!");
				}
			}
		}
	}

}
