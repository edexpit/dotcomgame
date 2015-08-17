import java.util.Scanner;

public class WordGame {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = userInput.nextLine();
		
		System.out.print("Enter age: ");
		int age = userInput.nextInt();
		
		System.out.print("Enter city: ");
		String city = userInput.nextLine();
		
		System.out.print("Enter college: ");
		String college = userInput.nextLine();
		
		System.out.print("Enter profession: ");
		String profession = userInput.nextLine();
		
		System.out.print("Enter animal: ");
		String animal = userInput.nextLine();
		
		System.out.print("Enter pet name: ");
		String petName = userInput.nextLine();
		
		System.out.println("There was once a person named " + name + " who lived in " + city + ". At the age of " + age + ", " +
		name + " went on to " + college + ". " + name + " graduated and went to work as a " +
		profession + ". Then, " + name + " adopted a(n) " + animal + " named " + petName + ". " + "They both lived "
		+ "happily ever after!");
		
	}
	
}
