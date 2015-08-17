import java.util.Scanner;

public class RestaurantBill {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter the charge for the restaurant bill: ");
		
		double restaurantBill = userInput.nextDouble();
		
		System.out.println(restaurantBill);
		
		System.out.println(restaurantBill * .0675);
		
		System.out.println((restaurantBill * .0675) * .15);
		
		System.out.println(restaurantBill + (restaurantBill * .0675) + ((restaurantBill * .0675) * .15));
		
	}
	
}
