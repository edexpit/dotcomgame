/*
Even Fibonacci numbers

Problem 2

Each new term in the Fibonacci sequence is generated by 
adding the previous two terms. By starting with 1 and 2, 
the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence 
whose values do not exceed four million, find the sum of 
the even-valued terms.
*/

public class ProjectEuler002 {
	
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 0;
		int maxNumValue = 4000000;
		int fNum = 0;
		int fNumEvenSum = 0;
				
		while (num1 <= maxNumValue && num2 <= maxNumValue) {
			
			fNum = num1 + num2;
	
			System.out.println(num1 + " + " + num2 + " = " + fNum);
			
			num2 = num1;
			num1 = fNum;
			
			if (fNum % 2 == 0) {
				
				fNumEvenSum += fNum;
				
			}
		
		} 
		
		System.out.println("EVEN NUMBER SUM: " + fNumEvenSum);
	}
}
