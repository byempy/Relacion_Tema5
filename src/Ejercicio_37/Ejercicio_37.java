package Ejercicio_37;

public class Ejercicio_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []numeros = {1,2,3,4,5};
		int posicion = 4;
		int []numeros2 = {44,55,66};
		int []numeros3 = InsertarArray(numeros, numeros2, posicion);
		
		for(int i: numeros3){
			System.out.print(i + "\t");
		}
		
	}
	
	public static int[]InsertarArray(int[]numeros, int[]numeros2, int posicion){
		int numeros3[] = new int[numeros.length + numeros2.length];
		int posi=0;
		int posi2=0;
		
		for(int i=0; i <= posicion; i++){
			numeros3[i] = numeros[i];
			posi=i;
			posi2=i;
		}
		posi++;
		posi2++;
		
		for(int i=0; i < numeros2.length; i++){
			numeros3[posi] = numeros2[i];
			posi++;
		}

		for(int i=posi2; i< numeros.length; i++){
			numeros3[posi] = numeros[i];
			posi++;
		}
		
		return numeros3;
	}

}
