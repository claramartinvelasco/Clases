package recursividad;
import java.util.Arrays;

public class Backtracking {
	static class Laberinto{
		int[][] mapa; 
		public Laberinto(int[][] mapa) {
			this.mapa= mapa; 
		}
		@Override 
		public String toString() {
			String resultado = "";
			for (int[] fila: mapa) {
				for (int valor: fila) {
						resultado+= valor + "";
				}
				resultado +="\n";
			}
			return resultado;
		}
	}

	public static String matrizToString (int[][] arr) {
		String resultado = "";
		for (int[] fila: arr) {
			for (int valor: fila) {
					resultado+= valor + "";
			}
			resultado +="\n";
		}
		return resultado;
	}
	// public static boolean camino(int[][] mapa, int fila, int columna) {
		public static boolean camino(Laberinto laberinto, int fila, int columna, boolean [][] visitado) {
		//Fuera de límites
		if (fila > laberinto.mapa.length-1 || fila <0 || columna > laberinto.mapa[0].length -1|| columna < 0)
			return false; 
		//Me choco con un 1
		if (laberinto.mapa[fila][columna] == 1)
			return false;
		//Salida CASO BASE: está fijada la salida
		if (fila == laberinto.mapa.length - 1 && columna == laberinto.mapa[0].length - 1) {
			return true;
		// revisar esto	laberinto.mapa[fila][columna]=2;
		}
		//Backtracking
			//1- Probar. Cuando lo pruebo y esa posición tiene un 0, lo marco como un 2 como que eso ya es parte del camino
		laberinto.mapa[fila][columna]=2;
		visitado[fila][columna] = true; 
		System.out.println(laberinto);
		
			//2-Explorar
		if((camino(laberinto, fila + 1, columna, visitado) ||
				camino(laberinto, fila-1, columna, visitado) || 
				camino(laberinto, fila, columna +1, visitado) || 
				camino(laberinto, fila, columna-1, visitado))) {
				return true;
		}
			//3-Volver
		laberinto.mapa[fila][columna]=0; 
	
		System.out.println("Retrocedo desde: (" + fila + ", " + columna);
		
		System.out.println(laberinto);
		return false;
		
	}
	
	
	public static void main(String[] args) {
		int [][] mapa = {{0,0,1,0}, {1,0,0,0},{0,0,1,1}, {0,0,0,0}};
		Laberinto laberinto = new Laberinto(mapa);
		boolean [][] visitado = {{false, false, false}, {false, false, false}, 
				{false, false, false}, {false, false, false}};
		
		System.out.println(matrizToString(mapa));
		System.out.println(camino(laberinto,0,0, visitado));
		System.out.println(laberinto);
	}
}
