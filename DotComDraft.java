import java.util.Scanner;
import java.util.Random;
import java.text.NumberFormat;

public class DotComDraft 
{
	
	public static void main(String[] args) 
	{
		Game2 gui = new Game2();
		
		// create scanner object to collect user input
		Scanner userInput = new Scanner(System.in);
		
		// create array to use as a grid to place targets
		int[][] grid = new int[7][7];
			
		// create random object to generate random numbers
		Random rand = new Random();
		
		// use random object to generate targets on the grid
		
		// each target will to generate within a specific zone on the grid so the targets don't overlap
			
		// generate target 1
	    int targetStartPoint1h = rand.nextInt((1 - 0) + 1) + 0;
	    int targetStartPoint1w = rand.nextInt((4 - 0) + 1) + 0;			

		grid[targetStartPoint1h][targetStartPoint1w] = 1;
		grid[targetStartPoint1h][targetStartPoint1w + 1] = 1;		
		grid[targetStartPoint1h][targetStartPoint1w + 2] = 1;			
		
		// display target 1 location (debug)
		System.out.println("Dot Com 1 Location:");		
		System.out.println(targetStartPoint1h + " " + targetStartPoint1w);
		System.out.println(targetStartPoint1h + " " + (targetStartPoint1w + 1));
		System.out.println(targetStartPoint1h + " " + (targetStartPoint1w + 2));
		System.out.println("");
		
		// generate target 2
		int targetStartPoint2h = 2;
		int targetStartPoint2w = rand.nextInt((6 - 0) + 1) + 0;		

		grid[targetStartPoint2h][targetStartPoint2w] = 2;
		grid[targetStartPoint2h + 1][targetStartPoint2w] = 2;
		grid[targetStartPoint2h + 2][targetStartPoint2w] = 2;

		// display target 2 location (debug)
		System.out.println("Dot Com 2 Location:");	
		System.out.println(targetStartPoint2h + " " + targetStartPoint2w);
		System.out.println(targetStartPoint2h + 1 + " " + targetStartPoint2w);
		System.out.println(targetStartPoint2h + 2 + " " + targetStartPoint2w);
		System.out.println("");
		
		// generate target 3
	    int targetStartPoint3h = rand.nextInt((6 - 5) + 1) + 5;
	    int targetStartPoint3w = rand.nextInt((4 - 0) + 1) + 0;		

		grid[targetStartPoint3h][targetStartPoint3w] = 3;
		grid[targetStartPoint3h][targetStartPoint3w + 1] = 3;
		grid[targetStartPoint3h][targetStartPoint3w + 2] = 3;
		
		// display target 3 location (debug)
		System.out.println("Dot Com 3 Location:");			
		System.out.println(targetStartPoint3h + " " + targetStartPoint3w);
		System.out.println(targetStartPoint3h + " " + (targetStartPoint3w + 1));
		System.out.println(targetStartPoint3h + " " + (targetStartPoint3w + 2));
		System.out.println("");
		
		/**
		// target 1 coordinates (manually entered)
		grid[0][1] = 1;
		grid[0][2] = 1;
		grid[0][3] = 1;
		
		// target 2 coordinates (manually entered)
		grid[2][3] = 2;
		grid[3][3] = 2;
		grid[4][3] = 2;
		
		// target 3 coordinates (manually entered)
		grid[6][3] = 3;
		grid[6][4] = 3;
		grid[6][5] = 3;	
		**/

		// create variable to track number of targets remaining
		int numTargetsRemaining = 3;
		
		// create variables to track number of hits
		int numTargetHits1 = 0;
		int numTargetHits2 = 0;
		int numTargetHits3 = 0;

		// create variable to track number of attempts
		int numAttempts = 0;

		System.out.println("Welcome to DOT COM DESTROYER!");
		System.out.println("");
		System.out.println("DESTROY all 3 Dot Coms and you win!");
		System.out.println("");		
		
		// loop until targets are destroyed
		while( numTargetsRemaining != 0 ) 
		{
					
			System.out.println("Prepare to FIRE!");
			System.out.println("");
			
			System.out.println("Enter the FIRST coordinate: ");
			int coordinate1 = userInput.nextInt();
			System.out.println("");
			
			System.out.println("Enter the SECOND coordinate: ");
			int coordinate2 = userInput.nextInt();
			System.out.println("");
			
			System.out.println("Aiming weapons at coordinates: " + "[" + coordinate1 + "]" + "[" + coordinate2 + "]");
			System.out.println("");
			
			if(grid[coordinate1][coordinate2] == 10)
			{
				numAttempts++;
				System.out.println("*** You already hit these coordinates... Try again! ***");
				System.out.println("");
			}
			else if(grid[coordinate1][coordinate2] == 1)
			{
				numAttempts++;
				numTargetHits1++;
				grid[coordinate1][coordinate2] = 10;  // after a hit, update the coordinates to a "this spot has been hit already" value  
				System.out.println("*** Dot Com 1 HIT! ***");
				System.out.println("");
				
				if (numTargetHits1 == 3)
				{
					numTargetsRemaining--;
					System.out.println("*** Dot Com 1 DESTROYED! ***");
					System.out.println("");
				}
				
			}
			
			else if(grid[coordinate1][coordinate2] == 2)
			{
				numAttempts++;
				numTargetHits2++;
				grid[coordinate1][coordinate2] = 10;				
				System.out.println("*** Dot Com 2 HIT! ***");
				System.out.println("");
				
				if (numTargetHits2 == 3)
				{
					numTargetsRemaining--;
					System.out.println("*** Dot Com 2 DESTROYED! ***");
					System.out.println("");
				}
				
			}
			
			else if(grid[coordinate1][coordinate2] == 3)
			{
				numAttempts++;
				numTargetHits3++;
				grid[coordinate1][coordinate2] = 10;				
				System.out.println("*** Dot Com 3 HIT! ***");
				System.out.println("");
				
				if (numTargetHits3 == 3)
				{
					numTargetsRemaining--;
					System.out.println("*** Dot Com 3 DESTROYED! ***");
					System.out.println("");
				}				
				
			}			
				
			else
			{
				numAttempts++;
				System.out.println("*** You MISSED! ***");
				System.out.println("");
			}
		}
		
		System.out.println("CONGRATULATIONS! You DESTROYED all 3 Dot Coms!");
		double accuracy = (9 / numAttempts);
		
		// create numberformat object to turn accuracy into a percentage.
		NumberFormat defaultFormat = NumberFormat.getPercentInstance();
		defaultFormat.setMinimumFractionDigits(1);
		System.out.println("Your accuracy was: " + defaultFormat.format(accuracy));
		
	}
	
}
