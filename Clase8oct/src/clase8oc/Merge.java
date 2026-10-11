package clase8oc;

import java.util.Arrays;

public class Merge {
	public static int[] merge(int[] arr1, int[] arr2) {
		int[]res = new int [arr1.length + arr2.length];
		
		int pos1 = 0;
		int pos2 = 0;
		
		int posRes = 0;
		
		while (pos1 < arr1.length && pos2 < arr2.length) {
			if(arr1[pos1] <= arr2[pos2]) {
				res[posRes] = arr1[pos1];	
				pos1++;
				posRes++;
			} else {
				res[posRes]=arr2[pos2];
				pos2++;
				posRes++;
				}
		}
		//Solo falta un array por recorrer. Estos while no cuestan tanto porque solo se ejcutará como mucho uno, porque el otro estará vacío. Solo se ejecutará un while
		
		while(pos2 < arr2.length){
			res[posRes]=arr2[pos2];
			pos2++;
			posRes++;
			}
		while(pos1 < arr1.length){
			res[posRes] = arr1[pos1];	
			pos1++;
			posRes++;
			}
		// res está lleno
		return res;
 	}
	
	public static int[] dividirPrimeraMitad(int[] arr) { //complejidad: n/2
		int[] res= new int[arr.length/2];
		for (int i = 0; i < res.length/2; i++) {
			res[i]=arr[i];
		}
		return res;
	}
	public static int[] dividirSegundaMitad(int[] arr) { //complejidad: n/2
		int[] res= new int[arr.length- (arr.length/2)];
		int posRes=0;
		for (int i = arr.length/2; i < arr.length/2; i++) {
				res[posRes]=arr[i];
				posRes++;
			}
			return res;
	}
	
	public static int[] mergeSort(int[] arr) {
		//1º hago el caso base: objetivo que tengo y hacer que mi código llegue al objetivo
		if(arr.length <=1) { //complejidad: 1
			return arr;
		}
		int[] izd = dividirPrimeraMitad(arr); 
		int[] dcha = dividirSegundaMitad(arr); 
		//Empleo recursividad volviendo a llamar a mi método. Reescribo mi variable izd y dcha
		izd = mergeSort(izd);
		dcha = mergeSort(dcha);
		
		return merge(izd, dcha); //complejidad: n
	}
	public static void main(String [] args) {
		System.out.println(Arrays.toString(merge(new int [] {1,3,6,8}, new int [] {2,4, 5,7} )));
		System.out.println(Arrays.toString(mergeSort(new int [] {5,2,4,3,6,1,9,7})));
		
	}
}
