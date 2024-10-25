/**
 * 
 * @author Trevor Coyle
 * Lion Class
 * ----------
 * 
 * Lion object that is-a type of Animal.
 */

public class Lion extends Animal {
	// Instance Variables
	private double maneLength;
	
	// Lion Constructor
	public Lion(String name, String id, int age, double maneLength) {
		super(name, id, age);
		this.maneLength = maneLength;
	}
	
	// Getter and Setter Methods
	public double getManeLength() {
		return maneLength;
	}
	
	public void setManeLength(double maneLength) {
		this.maneLength = maneLength;
	}
	
	// Abstract Method implementations of the declarations in the Animal class
	@Override
	public void makeSound() {
		System.out.println("Lion's roar: Roarrrr");
	}
	
	@Override
	public String getType() {
		return "Lion";
	}
	
	// toString implementation. Output is a String representation of a Lion Object
	@Override
	public String toString() {
		return super.toString() + String.format(" Mane Length: %-10.1f", maneLength);
	}
	
}
