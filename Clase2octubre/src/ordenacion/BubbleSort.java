package ordenacion;

import java.util.Arrays;
import java.util.Iterator; 


public class BubbleSort {
	
	public static int[] ordenar(int[] arr) {
		
		
		for (int pasada = 0; pasada < arr.length; pasada++) {
			boolean changed = false;
			for (int i = 0; i < arr.length-1-pasada; i++) {
				if(arr[i]> arr[i+1]) {
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1]= tmp;
					changed = true;
				}
			}
			if (!changed) { // equivalente a poner: changed == true
				System.out.println("Pasada nº: " + (pasada+1));
				break; //terminar cuando en mi pasada no haga ningún cambio
			}
		System.out.println("Pasada nº: " + (pasada+1));
		}
		return arr;
		
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString (ordenar(new int [] {6, 2, 4, 9, -10}))); 
		System.out.println(Arrays.toString (ordenar(new int [] {2,1,3,4,5})));}

}
