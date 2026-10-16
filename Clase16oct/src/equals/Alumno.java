package equals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

public class Alumno implements Comparable <Alumno>{
		String nombre;
		double nota;
		
		public Alumno (String nombre, double nota) {
			this.nombre = nombre;
			this.nota = nota;
		}
	
		@Override
		public String toString() {
			return this.nombre;
		}
		//Sobreescribo el método equals
		@Override
		public boolean equals(Object obj) { //no puedo cambiar Object por Alumno
			if (this == obj) {
				return true;
			}
			if (!(obj instanceof Alumno)) { //compara si el obj es de tipo alumno
				return false;
			}
			Alumno o = (Alumno) obj; //forzar la conversión a alumno con cast 
			
			return this.nombre.equals(o.nombre) && this.nota == o.nota;
		}
		@Override 
		public int hashCode() {
			return java.util.Objects.hash(nombre, nota);
		}
		@Override
		public int compareTo(Alumno o) {
			// return this.nombre.compareTo(o.nombre); es un método de la clase String
			int c = Double.compare(this.nota,o.nota);
			if (c != 0) {
			return c;
			} else {
				return this.nombre.compareTo(o.nombre);
			}
			//si empatan en nota, devuelvemelo ordenandolo por nota
		}

//		public static int[] ordenar(int[] arr) {
//			
//			for (int pasada = 0; pasada < arr.length; pasada++) {
//				boolean changed = false;
//				for (int i = 0; i < arr.length-1-pasada; i++) {
//					if(arr[i]> arr[i+1]) {
//						int tmp = arr[i];
//						arr[i] = arr[i+1];
//						arr[i+1]= tmp;
//						changed = true;
//					}
//				}
		public static Alumno[] ordenar(Alumno[] arr, Comparator<Alumno> comparador) {
			
				for (int pasada = 0; pasada < arr.length; pasada++) {
					boolean changed = false;
					for (int i = 0; i < arr.length-1-pasada; i++) {
						// if(arr[i].compareTo(arr[i+1]) > 0) {
						if(comparador.compare(arr[i],arr[i+1]) > 0) {
							Alumno tmp = arr[i];
							arr[i] = arr[i+1];
							arr[i+1]= tmp;
							changed = true;
						}
					}
					if (!changed) { // equivalente a poner: changed == true
						// System.out.println("Pasada nº: " + (pasada+1));
						break; //terminar cuando en mi pasada no haga ningún cambio
					}
				// System.out.println("Pasada nº: " + (pasada+1));
				}
				return arr;
				
			}
		
		
		public static void main(String[] args) {
			String a = "Ana";
			// String c = "Carlos";
			
			System.out.println(a.compareTo(a)); // forma alfabética. a < c negativo; a = 0 dará 0; a > c positivo
			
			System.out.println(Double.compare(9.0,11.0));
			
			Alumno ana = new Alumno("Ana", 9.0);
			Alumno carlos = new Alumno("Carlos", 8.75);
			Alumno alejandra = new Alumno("Alejandra", 8.75);
			Alumno [] alumnos = {carlos, ana, alejandra};
			
//			System.out.println(ana.compareTo(carlos));
//			System.out.println(ordenar(alumnos)); //así java saca la referencia que tiene sobre ello
//			System.out.println(Arrays.toString((alumnos))); //así también los objetos apuntan a una referencia en memoria
//			System.out.println(Arrays.toString(ordenar(alumnos)));
//			
//			Comparator<Alumno> porNombre = new ComparadorPorNombre();
//			Arrays.sort(alumnos, porNombre); 
////			
//			System.out.println(Arrays.toString((alumnos)));
////			
			
//			Comparator<Alumno> porNombre = new ComparadorPorNombre();
//			System.out.println(Arrays.toString(ordenar(alumnos, porNombre)));
//			
//			Comparator<Alumno> porNota = new ComparadorPorNota();
//			System.out.println(Arrays.toString(ordenar(alumnos, porNota)));
//			
//			//Otra forma de construirlo a través de una interfaz con un solo método. Función lamda
//			
//			Comparator<Alumno> porNombre2 = (o1, o2) -> o1.nombre.compareTo(o2.nombre);
		Alumno a1 = new Alumno("Ana", 9.0);
		Alumno a2 = new Alumno("Ana", 9.0);
		Alumno a4 = new Alumno("Ana", 8.99);
		System.out.println(a1.equals(a2)); //true
		Alumno a3 = a1;
		System.out.println(a3==a1); // true
		System.out.println(a3.equals(a1)); //true
		System.out.println(a1.equals("Ana")); //false
		System.out.println(a3.equals(null)); //false
		
		//List (interfaz) -> Arraylist (clase)
		List<Alumno> alumnos1 = new ArrayList<>();
		alumnos1.add(a1);
		System.out.println(alumnos1.contains(a1));
		System.out.println(alumnos1.contains(a4));
		System.out.println(alumnos1.contains(a2)); //true porque es igual que a1
		
		//Set --> HashSet
		Set<Alumno> alumnosSet = new HashSet<>();
		alumnosSet.add(a1);
		System.out.println(alumnosSet.contains(a2)); //false 
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a4.hashCode());
		
		
		
		}
		
		
}

