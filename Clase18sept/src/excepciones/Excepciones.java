package excepciones;

public class Excepciones {
	
	public static int accederValor(int[] arr, int i) {
		int e = Integer.parseInt("abc"); // Recibe string y convierte a entero, da error porque abc no puede ser un entero
		int valor = arr[i];
		System.out.println("Valor: " + valor);
		return valor;
	}

	public static void main(String[] args) {
		System.out.println("Empieza mi programa");
		int [] arr = {1, 2, 3};
		
		try {
		System.out.println(accederValor (arr, 5));
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Este índice no es válido");
			
		}
		catch(Exception e) {
			System.out.println("Algo ha ido mal");
		}
		

		
	}

}
