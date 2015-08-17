import java.util.Scanner;
public class TestAverage {

	public static void main(String[] args) {
		
	Scanner userInput = new Scanner(System.in);
	
	System.out.print("Enter test score 1: ");
	
	double testScore1 = userInput.nextDouble();
	
	System.out.print("Enter test score 2: ");
	
	double testScore2 = userInput.nextDouble();
	
	System.out.print("Enter test score 3: ");
	
	double testScore3 = userInput.nextDouble();
	
	System.out.println(testScore1);
	System.out.println(testScore2);
	System.out.println(testScore3);
	System.out.println((testScore1 + testScore2 + testScore3) / 3);
	
	}
	
}
