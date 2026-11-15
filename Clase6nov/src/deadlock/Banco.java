package deadlock;

public class Banco {

	public void transferir (Cuenta origen, Cuenta destino, int cantidad) {
		Cuenta primera;
		Cuenta segunda; 
		
		if(origen.id < destino.id) {
			primera = origen;
			segunda = destino;
		} else {
			primera = destino;
			segunda = origen;
		}
		
		synchronized(primera) {
			synchronized(segunda){
				if (origen.saldo >= cantidad) {
					origen.saldo -= cantidad;
					destino.saldo += cantidad; 
				} else {
					System.out.println("Saldo insuficiente en la cuenta. Operación");
				}
			}
		}
	}

}
