package starvation;

import java.util.LinkedList;
import java.util.Queue;

public class Almacen {

    private int rojas = 0;
    private int azules = 0;
    
   Queue<Thread> cola = new LinkedList<>();
    
    public synchronized void producirRoja() {
        rojas++;
        System.out.println("Producida pieza roja. Almacén actual: R="+rojas+" A="+azules);
        // TODO: Tras producir piezas rojas podrían salir más pedidos.
        notifyAll(); 
    }

    public synchronized void producirAzul() {
        azules++;
        System.out.println("Producida pieza azul. Almacén actual: R="+rojas+" A="+azules);
        // TODO: Tras producir piezas azules podrían salir más pedidos.
        notifyAll(); 
    }

    public synchronized void prepararPedido(int necesariasRojas,
                                           int necesariasAzules)
            throws InterruptedException {
    	cola.add(Thread.currentThread()); 
    	
        // TODO: esperar hasta tener AMBOS tipos de piezas.
    	while(cola.peek() != Thread.currentThread() || 
    			rojas  < necesariasRojas || azules < necesariasAzules) {
    		wait(); 
    	} 
        // TODO: retirar las dos cantidades bajo el mismo monitor.
    	rojas -= necesariasRojas;
    	azules -= necesariasAzules; 
    	cola.remove(); 
    	notifyAll();
    }
}
