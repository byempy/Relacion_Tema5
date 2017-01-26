package Ejercicio_33;

public class Ejercicio_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]numeros = {0,1,2,3,4,5,6,7,8,9};
		int num = 69;
		int posicion = 10;
		int[]numerosfin = ArrayInsertar(numeros, num, posicion);
		
		for(int i: numerosfin){
			System.out.print(i + "\t");
		}
	}
	
	public static int[]ArrayInsertar(int[]numeros, int num, int posicion){
		int [] numeros2 = new int[numeros.length + 1];
		
		for(int i=0; i < posicion; i++){
			numeros2[i] = numeros[i];
		}
		
		numeros2[posicion] = num;
		
		for(int i=posicion; i < numeros.length;i++){
			numeros2[i+1] = numeros[i];
		}
		
		return numeros2;
	}

}
