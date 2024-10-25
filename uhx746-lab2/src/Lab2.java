import java.io.FileNotFoundException;
/**
 * 
 * @author CS3443
 *
 */
public class Lab2 {

	public static void main(String[] args) {

		Wilderness wilderness = new Wilderness("Texas, United States");

		try {

			wilderness.populateWilderness("animals.csv");

			System.out.println("The wilderness is home to the following animals:");

			for(Animal animal : wilderness.getAnimals() ) {
				System.out.println(animal);
			}

			System.out.println("\n\nThe animals make wild sounds:");

			for(Animal animal : wilderness.getAnimals() ) {
				animal.makeSound();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
