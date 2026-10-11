package equals;

public class Equals {

	public static void main(String[] args) {
		int a = 5;
		int b =5;
		System.out.println(a==b);
		//Solo se puede usar el == cuando son tipos primitivos (char, double, float, long...). Porque si son objetos el == comparará la referencia en memoria de esos objetos
//		String s1= new String("hola");
//		String s2= new String("hola");
		// Esto es por optimización y reutilizar string, pool de strings 
		String s1= "hola";
		String s2= "hola";
		// Wrappers: Double, Integer, Long (pasa igual)
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}
