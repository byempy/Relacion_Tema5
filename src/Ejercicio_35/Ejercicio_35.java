package Ejercicio_35;

public class Ejercicio_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []numeros = {1,2,3,4,5,6,7};
		int num = 4;
		int posicion = Posicion(numeros, num);
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
	
	public static int Posicion(int [] numeros, int num){
		int posicion = 0;
		boolean coincide = false;
		
		for(int i=0; i < numeros.length && !coincide; i++){
			if(numeros[i] == num){
				posicion = i;
				coincide = true;
			}
		}
		
		return posicion;
	}

}
