package examen1;
//REVISAR CÓDIGO
public class Palindromo {
	public static boolean isPalindrome(String s) { // aquí n es el número de letras
		if(s.length() <=1) { 
			System.out.println("La frase tiene que tener longitud mayor de 1");
		return false; 	
		}
		s=s.toLowerCase(); // como mínimo complejidad O(n)
		int inicio = 0; // O(1)
		int fin = s.length();
		while (fin > inicio) { //suponemos charAt O(1). El while complejidad O(n)
			if(s.charAt(inicio) == ' ') {
				inicio++;
				continue;
		}
		if(s.charAt(fin) == ' ') {
			fin--;
			continue;
		}
		if (s.charAt(inicio) == s.charAt(fin)) {
			return false;
		}
		inicio ++;
		fin--;
		}
		return true;
	}
	public static boolean isPalindromeAlternativa(String s) {
		if(s.length() <=1) {
			System.out.println("La frase tiene que tener longitud mayor de 1");
		return false; 	
		}
		s = s.toLowerCase();
		
		String sentenceClean ="";
		for (int i = 0; i< s.length(); i++) { //Complejidad = O(n) o O(n^2)
			if (s.charAt(i)== ' ') 
				continue; 
			sentenceClean += s.charAt(i);
			}
		for (int i=0; i < sentenceClean.length(); i++) { // O(n^2). El mejor caso string vacio O(1), el siguiente caso mejor con dos letras diferentes (termino rapido). caso peor me pasa un palindomo.
			for(int j=0; j< sentenceClean.length(); j++)
				if(i+j==sentenceClean.length()-1) {
					if(sentenceClean.charAt(i) == sentenceClean.charAt(j)) {
						
					}
				}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Anita lava la tina";
		System.out.println(isPalindrome(s));
	}

}

// ¿qué significa ser mejor? tiempo (en esta asignatura) y memoria 
