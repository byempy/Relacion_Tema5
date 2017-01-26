package Ejercicio_31;

public class Ejercicio_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = {1,2,3,4};
		int [] numeros2 = {5,6,7,8};
		int[]numcon = Concatenacion(numeros, numeros2);
		
		for(int i: numcon){
			System.out.print(i + "\t");
		}
	}
	
	public static int[]Concatenacion(int[]array, int[]array2){
		int []arraycon = new int[array.length + array2.length];
		int posicion = 0;
		
		for(int i=0; i < array.length; i++){
			arraycon[i] = array[i];
			posicion = i;
		}
		
		posicion++;
		
		for(int i=0; i < array2.length; i++){
			arraycon[posicion] = array2[i];
			posicion++;
		}
		
		return arraycon;
	}

}
