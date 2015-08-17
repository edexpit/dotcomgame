import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		
		double stateSalesTax = .04;
		double countySalesTax = .02;
		
		System.out.print("Enter purchase amount: ");
		Scanner userInput = new Scanner(System.in);
		
		double purchaseAmount = userInput.nextDouble();
		
		System.out.println(purchaseAmount);
		System.out.println(stateSalesTax);
		System.out.println(countySalesTax);
		System.out.println(stateSalesTax + countySalesTax);
		System.out.println(purchaseAmount + (stateSalesTax + countySalesTax));
		
	}
	
}
