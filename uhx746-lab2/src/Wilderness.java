import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author Trevor Coyle (uhx746)
 * Wilderness Class
 * ----------------
 * 
 * Wilderness Object and it's various methods.
 */

public class Wilderness {
	// Instance Variables
	private String location;
	private ArrayList<Animal> animals;
	
	// Wilderness Constructor
	public Wilderness(String location) {
		this.location = location;
		animals = new ArrayList<Animal>();
	}
	
	// Getter and Setter Methods
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public ArrayList<Animal> getAnimals() {
		return animals;
	}
	
	public void setAnimals(ArrayList<Animal> animals) {
		this.animals = animals;
	}
	
	/**
	 * +populateWilderness():void
	 * 
	 * @param filename
	 * @throws FileNotFoundException
	 * 
	 * Reads input from a file using BufferedReader and FileReader
	 * called "filename" which expects a .csv file.
	 * 
	 * It then loops through the entirety of the file and breaks each
	 * line into 4 tokens that represent an Animal's name, ID, and age.
	 * 
	 * The last token varies between a double or a boolean data type.
	 * We use the ID token to see what type of Animal the object being
	 * passed is.
	 * 
	 * After the input is checked and parsed, we can create the Animal
	 * object and add it to the animals ArrayList<Animal> using the
	 * addAnimal(Animal animal) method below.
	 */
	
    public void populateWilderness(String filename) throws FileNotFoundException {
    	filename = "data/" + filename;
    	
    	try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
    		String line;
    		while ((line = reader.readLine()) != null) {
    			Animal animal = null;
    			
    			String[] parts = line.split(",");
    			String name = parts[0].trim();
    			String id = parts[1].trim();
    			int age = Integer.parseInt(parts[2].trim());
    			
    			switch(id.charAt(0)) {
    				case 'L':
    					double maneLength = Double.parseDouble(parts[3].trim());
    					animal = new Lion(name, id, age, maneLength);
    					addAnimal(animal);
    					break;
    				case 'M':
    					boolean hasBananas = Boolean.parseBoolean(parts[3].trim());
    					animal = new Monkey(name, id, age, hasBananas);
    					addAnimal(animal);
    					break;
    				case 'E':
    					double wingSpan = Double.parseDouble(parts[3].trim());
    					animal = new Eagle(name, id, age, wingSpan);
    					addAnimal(animal);
    					break;
    				default:
    					System.out.println("Error Unknown Animal| RED ALERT | RED ALERT |");
    					break;
    			}
    		}
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }	
	
    
    // Adding and Removing Functions for an ArrayList
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void removeAnimal(Animal animal) {
		animals.remove(animal);
	}
	
	// toString implementation. Output is a String representation of a Wilderness Object
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (Animal animal : animals) {
			stringBuilder.append(animal).append("\n");
		}
		return stringBuilder.toString();
	}
}
