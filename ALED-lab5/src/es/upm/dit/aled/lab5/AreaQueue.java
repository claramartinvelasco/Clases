package es.upm.dit.aled.lab5;

import java.util.LinkedList;
import java.util.Queue;

import es.upm.dit.aled.lab5.gui.Position2D;

/**
 * Extension of Area that maintains a strict queue of the Patients waiting to
 * enter in it. After a Patient exits, the first one in the queue will be
 * allowed to enter.
 * 
 * @author rgarciacarmona
 */
public class AreaQueue extends Area {

	// TODO
	private Queue<Patient> waitQueue; 
	

	public AreaQueue(String name, int time, int capacity, Position2D position) {
		super(name, time, capacity, position);
		
		this.waitQueue = new LinkedList<Patient>();
	}
	@Override
	public synchronized void enter(Patient patient) {
		System.out.println("Patient " + patient.getNumber() + " traying to enter" + this.name );
		this.waiting++;
		this.waitQueue.add(patient);
		while(this.numPatients >= this.capacity || this.waitQueue.peek() != patient) {
			System.out.println("Patient " + patient.getNumber() + " waiting for" + this.name 
					+ ". Front of the queue? " + this.waitQueue.peek().equals(patient));
			try {
			wait(); 
			} catch (InterruptedException e) {}
		}
		this.waitQueue.remove();
		this.waiting--;
		this.numPatients++;
		System.out.println("Patient " + patient.getNumber() + " has entered " + this.name );	
	}
}
