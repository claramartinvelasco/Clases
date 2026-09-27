package excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExcepcionFIle {
	public static void abrirFichero(String s) {
		try {
			FileReader f = new FileReader(s);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println("Abrir fichero ha terminado");
	}
	public static void abrirFichero2(String s) throws Exception {
			FileReader f = new FileReader(s);
	}
	
	public static void main(String[] args) {
		abrirFichero("Direccion");
		System.out.println("Mi programa ha terminado");
		
	}

}
