import java.util.Scanner;

public class StringManipulator {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter the name of your favorite city: ");
		
		String cityName = userInput.nextLine();
		
		System.out.println(cityName.length());
		
		System.out.println(cityName.toUpperCase());
		
		System.out.println(cityName.toLowerCase());
		
		System.out.println(cityName.charAt(0));
		
	}
	
}
