import java.util.Random;

public class GameArray 
{

	public int[][] GameArray()
	{
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
		
		return grid;
		
	}
	

}
