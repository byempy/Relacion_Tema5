package Ejercicio_34;

public class Ejercicio_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]numeros = {1,2,3,4,5,6};
		int posicion = 3;
		int[]numeroslimpiado = LimpiarPosicion(numeros, posicion);
		
		for(int i: numeroslimpiado){
			System.out.print(i + "\t");
		}
	}
	
	public static int[] LimpiarPosicion(int[]numeros, int posicion){
		int [] numeros2 = new int[numeros.length - 1];
		
		for(int i=0; i < posicion; i++){
			numeros2[i] = numeros[i];
		}
		
		for(int i=posicion; i < numeros2.length; i++){
			numeros2[i] = numeros[i+1];
		}
		
		return numeros2;
	}

}
