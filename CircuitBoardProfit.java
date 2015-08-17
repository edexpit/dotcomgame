import java.util.Scanner;

public class CircuitBoardProfit {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter retail price for circuit board: ");
		
		double circuitBoardRetailPrice = userInput.nextDouble();
		
		double profit = circuitBoardRetailPrice * 0.4;
		
		System.out.println(profit);
		
	}
	
}
