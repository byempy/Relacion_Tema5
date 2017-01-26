package Ejercicio_32;

public class Ejercicio_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array = {1,2,3,4};
		int []array2 = CopiaArrayPro(array);
		
		for(int i: array2){
			System.out.print(i + "\t");
		}
	}
	
	public static int[]CopiaArrayPro(int[]array){
		int []array2 = new int[array.length];
		
		for(int i=0; i<array.length; i++){
			array2[i] = array[i];
		}
		
		return array2;
	}

}
