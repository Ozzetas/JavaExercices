package alumniClase4;

import java.util.Arrays;

public class CopiaDeArray2 {

	public static void main(String[] args) {
		int [] losValores = new int[10];
		losValores[0] = 0;
		losValores[1] = 1;
		losValores[2] = 2;
		losValores[3] = 3;
		losValores[4] = 4;
		losValores[5] = 5;
		losValores[6] = 6;
		losValores[7] = 7;
		losValores[8] = 8;
		losValores[9] = 9;
		
		int [] datos = new int[losValores.length];
		System.arraycopy(losValores, 0, datos, 0, losValores.length);
		
		for (int j = 0; j < datos.length; j++) {
			 System.out.println(datos[j]);			 
		 }

	}

}
