package recursividad;

import java.util.ArrayList;
import java.util.List;

public class Backtracking {
	
	public static void backtraking(int[] arr, int objetivo, 
			int acumulado, List<Integer> solucion) {
		if (acumulado == objetivo) {
			System.out.println(solucion);
			return; //siempre porque si no no sigo
		}
		
		if(acumulado>objetivo) {
			return;
		}
		
		for (int i : arr) {
			//	PASO 1: Probar
			solucion.add(i);
			
			//PASO 2: Explorar 
			backtraking (arr, objetivo, acumulado + i, solucion); 
			
			//PASO 3: Volver 
			solucion.remove(solucion.size() - 1); 
		}
	}

	public static void main(String[] args) {
		backtraking(new int [] {1,2,3}, 4, 0, new ArrayList <> ());
		// System.out.println(); //Escribes syso y la das a option y a barra espacio 

	}

}
