/*
Largest prime factor

Problem 3

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

public class ProjectEuler003 {
	
	public static void main(String[] args) {
		
		int number = 13195;
		
		for (int i = 1; i < number; i++) {
			
			if (number % i == 0) {
				
				System.out.print(i + " is a factor of " + number + ". ");
				
				boolean isPrime = true;
				
				for (int counter = 2; counter < i; counter++) {
					
					if (i % counter == 0) {
						
						isPrime = false;
						
					}
					
				}
				
				System.out.println("Prime: " + isPrime);
								
			}
			
		}
		
	}

}
