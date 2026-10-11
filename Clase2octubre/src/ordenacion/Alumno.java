package ordenacion;

public class Alumno implements Comparable <Alumno>{
	String nombre;
	double nota;
	
	public Alumno (String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	@Override
	public int compareTo(Alumno o) {
		return Double.compare(this.nota,o.nota);
	}
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
		String a = "Ana";
		String c = "Carlos";
		
		System.out.println(a.compareTo(a)); // forma alfabética. a < c negativo; a = 0 dará 0; a > c positivo
		
		System.out.println(Double.compare(9.0,11.0));
		
		Alumno ana = new Alumno("Ana", 9.0);
		Alumno carlos = new Alumno("Carlos", 8.75);
		Alumno [] alumnos = {carlos, ana};
		
		System.out.println(ana.compareTo(carlos));
		
	}

}




