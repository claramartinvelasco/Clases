package ordenacion;

import java.util.Arrays;

public class SelectionSort {
	
	public static int[] ordenar(int[] arr) {
		
		for (int pos = 0; pos < arr.length; pos++) {
			int posMin = pos;
			
			//pos indica donde hay que colocar la siguiente carta
			for (int i= pos + 1; i < arr.length; i++) {
				if(arr[i] < arr[posMin]) {
					posMin = i;
				
				}
			}
			//cambio el valor cuando ya he recorrido todas las cartas
			int tmp = arr[pos]; //para recuperar el valor min más tarde
			arr[pos]= arr[posMin];
			arr[posMin]=tmp;
		}
		
		return arr;
		
	}
	public static void main(String [] args) {
		System.out.println(Arrays.toString (ordenar(new int [] {6, 2, 4, 9, -10}))); //los tipos referencia, imprimen la referencia interna de java, por eso hay que poner el toString
	}
	//Complejidad de este algoritmo: dos bucles anidados, el primer for se recorre n veces y el segundo n +(n-1)+(n-2)+(n-3)+...+3+2+1
}
