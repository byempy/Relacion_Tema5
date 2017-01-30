package Ejercicio_36;

public class Ejercicio_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = { 4, 2, 3, 4, 5, 2, 3, 4 };
		int num = 4;
		int cantidad = Contador(numeros, num);
		int posiciones[] = Posiciones(numeros, num, cantidad);
		int numerosFin[] = ArrayLimpio(numeros, posiciones);

		for (int i : numerosFin) {
			System.out.print(i + "\t");
		}
	}

	public static int Contador(int numeros[], int num) {
		int contador = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == num) {
				contador++;
			}

		}
		return contador;
	}

	public static int[] Posiciones(int numeros[], int num, int cantidad) {
		int[] posiciones = new int[cantidad];
		int j = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == num) {
				posiciones[j] = i;
				j++;
			}
		}

		return posiciones;
	}

	public static int[] LimpiarPosicion(int[] numeros, int posicion) {
		int[] numeros2 = new int[numeros.length - 1];

		for (int i = 0; i < posicion; i++) {
			numeros2[i] = numeros[i];
		}

		for (int i = posicion; i < numeros2.length; i++) {
			numeros2[i] = numeros[i + 1];
		}

		return numeros2;
	}

	public static int[] ArrayLimpio(int[] numeros, int[] posiciones) {
		int arraylimpio[] = new int[numeros.length - posiciones.length];
		int j = 0;
		int i = 0;
		boolean coincide = false;

		for (int posicion = 0; posicion <= posiciones.length; posicion++) {
			coincide = false;
			for (i = i; i < arraylimpio.length && !coincide; i++) {
				if (posicion < posiciones.length) {
					if (j == posiciones[posicion]) {
						coincide = true;
						j++;
					}
				}
				arraylimpio[i] = numeros[j];
				j++;

			}
		}

		return arraylimpio;
	}

}
