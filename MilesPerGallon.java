import java.util.Scanner;

public class MilesPerGallon {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter miles driven: ");
		
		double milesDriven = userInput.nextDouble();
		
		System.out.print("Enter gallons of gas used: ");
		
		double gallonsOfGasUsed = userInput.nextDouble();		
		
		double milesPerGallon = milesDriven / gallonsOfGasUsed; 
		
		System.out.println("Miles Per Gallon: " + milesPerGallon);
	}

}
