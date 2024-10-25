/**
 * 
 * @author Trevor Coyle
 * Animal Class
 * ------------
 * 
 * Abstract class that represents and Animal Object.
 * Can be either a Lion, Monkey, or Eagle.
 */

public abstract class Animal {
	// Instance Variables
	private String name;
	private String id;
	private int age;
	
	// Animal Constructor
	public Animal(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	// Getter and Setter Methods
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// toString implementation. Output is a String representation of a Animal Object based on it's type (Monkey, Lion, Eagle)
	@Override
	public String toString() {
		return String.format("Type: %-8s Name: %-8s ID: %-6s Age: %-5d", getType(), name, id, age);
	}
	
	// Abstract Method declarations to be implemented by all Animals based on the type of Animal
	public abstract void makeSound();
	public abstract String getType();
	
}
