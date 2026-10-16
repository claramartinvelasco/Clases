package equals;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EjemploLinkedListQueue {

	public static void main(String[] args) {
		//Lista
		List<String> lista = new LinkedList<>();
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Lucía");
		System.out.println(lista);
		
		Queue<String> cola = new LinkedList<>();
		cola.offer("Ana");
		cola.offer("Carlos");
		cola.offer("Lucía");
		System.out.println("\nCOLA:");
		System.out.println(cola.peek());
		System.out.println(cola);
		System.out.println(cola.poll());
		System.out.println(cola);

	}

}
