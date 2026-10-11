package bst;

public class BST {
	Nodo raiz;
	//REVISAR CÓDIGO FALTAN COSAS SEGURO
	public boolean contains (int valor){
		if(raiz == null) {
			return false; 
		}
		

	public void guardar(int valor) {
		if(raiz== null) {
			raiz = new Nodo(valor);
			return;
		}
		Nodo actual = raiz;
		
	while (actual != null) {
		if (valor == actual.valor) {
			return true;
		} else if (valor < actual.valor) {
			//Se que está a la izda
			if (actual.izquierda == null) {
				actual.izquierda = new Nodo(valor);
				return false;
				
			}
			actual = actual.izquierda; 
		} else {
			//Se que está a la dcha
			if (actual.derecha == null) {
				actual.derecha = new Nodo(valor);
				return false;
			}
			actual = actual.derecha;
			
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		BST tree = new BST();
		tree.guardar(7);
		System.out.println(tree.contains(100));

	}
	
	

}
}
