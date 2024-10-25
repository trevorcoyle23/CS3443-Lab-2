/**
 * 
 * @author Trevor Coyle
 * Monkey Class
 * ------------
 * Monkey object that is-a type of Animal.
 */

public class Monkey extends Animal {
	// Instance Variables
	private boolean likeBananas;
	
	// Monkey Constructor
	public Monkey(String name, String id, int age, boolean likeBananas) {
		super(name, id, age);
		this.likeBananas = likeBananas;
	}
	
	// Getter and Setter Methods
	public boolean isLikeBananas() {
		return likeBananas;
	}
	
	public void setLikeBananas(boolean likeBananas) {
		this.likeBananas = likeBananas;
	}
	
	// Abstract Method implementations of the declarations in the Animal class
	@Override
	public void makeSound() {
		System.out.println("Monkey chatter: Ooh ooh ah ah!");
	}
	
	@Override
	public String getType() {
		return "Monkey";
	}
	
	// toString implementation. Output is a String representation of a Monkey Object
	@Override
	public String toString() {
		return super.toString() + String.format(" Banana Eater: %s", likeBananas ? "yes" : "no");
	}
}
