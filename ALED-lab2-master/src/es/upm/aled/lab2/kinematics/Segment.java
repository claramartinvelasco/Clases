package es.upm.aled.lab2.kinematics;

import java.util.ArrayList;
import java.util.List;
/**
 * Esta clase represena un segmento del exoesqueleto
 * 
 * @author clara.martin.velasco
 */
public class Segment {
	private double length;
	private double angle;
	private List <Segment> children;
	
	public Segment (double length, double angle) {
		this.length = length;
		this.angle = angle;
		this.children = new ArrayList<>();
	}
	 public double getLength() {
		 return length;
	 }
	 public double getAngle() {
		 return angle;
	 }
	 public void setAngle(double angle) {
		 this.angle = angle;
	 }
	 public List <Segment> getChildren(){
		 return children;
	 }
	 //El método addChild comprueba que en la lista children
	 public void addChild (Segment child) {
			if (!children.contains(child))
				children.add(child);
	 }

}
