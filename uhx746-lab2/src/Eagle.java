/**
 * 
 * @author Trevor Coyle (uhx746)
 * Eagle Class
 * -----------
 * 
 * Eagle object that is-a type of Animal.
 */

public class Eagle extends Animal {
	// Instance Variables
	private double wingSpan;
	
	// Eagle Constructor
	public Eagle(String name, String id, int age, double wingSpan) {
		super(name, id, age);
		this.wingSpan = wingSpan;
	}
	
	// Getter and Setter Methods
	public double getWingSpan() {
		return wingSpan;
	}
	
	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}
	
	// Abstract Method implementations of the declarations in the Animal class
	@Override
	public String getType() {
		return "Eagle";
	}
	
	@Override
	public void makeSound() {
		System.out.println("Eagle screeches loudly!");
	}
	
	// toString implementation. Output is a String representation of an Owl Object
	public String toString() {
		return super.toString() + String.format(" Wingspan: %-10.1f", wingSpan);
	}
}
