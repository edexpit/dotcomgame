import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

import javax.swing.*;

public class BattleshipGUI extends JFrame implements ActionListener
{
	int test;
	private JButton a1;
	private JButton a2;
	private JButton a3;
	private JButton a4;
	private JButton a5;
	private JButton a6;
	private JButton a7;
	
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	
	private JButton c1;
	private JButton c2;
	private JButton c3;
	private JButton c4;
	private JButton c5;
	private JButton c6;
	private JButton c7;
	
	private JButton d1;
	private JButton d2;
	private JButton d3;
	private JButton d4;
	private JButton d5;
	private JButton d6;
	private JButton d7;
	
	private JButton e1;
	private JButton e2;
	private JButton e3;
	private JButton e4;
	private JButton e5;
	private JButton e6;
	private JButton e7;
	
	private JButton f1;
	private JButton f2;
	private JButton f3;
	private JButton f4;
	private JButton f5;
	private JButton f6;
	private JButton f7;
	
	private JButton g1;
	private JButton g2;
	private JButton g3;
	private JButton g4;
	private JButton g5;
	private JButton g6;
	private JButton g7;		

	public BattleshipGUI()
	{
		
		super("Battleship");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		JPanel pane = new JPanel();
	
		GridLayout grid = new GridLayout(7,7,10,10);
				
		pane.setLayout(grid);
		
		this.a1 = new JButton("a1");
		a1.addActionListener(this);
		
		this.a2 = new JButton("a2");
		a2.addActionListener(this);;
		
		this.a3 = new JButton("a3");
		a3.addActionListener(this);
		
		this.a4 = new JButton("a4");
		a4.addActionListener(this);
		
		this.a5 = new JButton("a5");
		a5.addActionListener(this);
		
		this.a6 = new JButton("a6");
		a6.addActionListener(this);
		
		this.a7 = new JButton("a7");
		a7.addActionListener(this);
		
		this.b1 = new JButton("b1");
		b1.addActionListener(this);
		
		this.b2 = new JButton("b2");
		b2.addActionListener(this);;
		
		this.b3 = new JButton("b3");
		b3.addActionListener(this);
		
		this.b4 = new JButton("b4");
		b4.addActionListener(this);
		
		this.b5 = new JButton("b5");
		b5.addActionListener(this);
		
		this.b6 = new JButton("b6");
		b6.addActionListener(this);
		
		this.b7 = new JButton("b7");
		b7.addActionListener(this);
		
		this.c1 = new JButton("c1");
		c1.addActionListener(this);
		
		this.c2 = new JButton("c2");
		c2.addActionListener(this);;
		
		this.c3 = new JButton("c3");
		c3.addActionListener(this);
		
		this.c4 = new JButton("c4");
		c4.addActionListener(this);
		
		this.c5 = new JButton("c5");
		c5.addActionListener(this);
		
		this.c6 = new JButton("c6");
		c6.addActionListener(this);
		
		this.c7 = new JButton("c7");
		c7.addActionListener(this);
		
		this.d1 = new JButton("d1");
		d1.addActionListener(this);
		
		this.d2 = new JButton("d2");
		d2.addActionListener(this);;
		
		this.d3 = new JButton("d3");
		d3.addActionListener(this);
		
		this.d4 = new JButton("d4");
		d4.addActionListener(this);
		
		this.d5 = new JButton("d5");
		d5.addActionListener(this);
		
		this.d6 = new JButton("d6");
		d6.addActionListener(this);
		
		this.d7 = new JButton("d7");
		d7.addActionListener(this);
		
		this.e1 = new JButton("e1");
		e1.addActionListener(this);
		
		this.e2 = new JButton("e2");
		e2.addActionListener(this);;
		
		this.e3 = new JButton("e3");
		e3.addActionListener(this);
		
		this.e4 = new JButton("e4");
		e4.addActionListener(this);
		
		this.e5 = new JButton("e5");
		e5.addActionListener(this);
		
		this.e6 = new JButton("e6");
		e6.addActionListener(this);
		
		this.e7 = new JButton("e7");
		e7.addActionListener(this);
		
		this.f1 = new JButton("f1");
		f1.addActionListener(this);
		
		this.f2 = new JButton("f2");
		f2.addActionListener(this);;
		
		this.f3 = new JButton("f3");
		f3.addActionListener(this);
		
		this.f4 = new JButton("f4");
		f4.addActionListener(this);
		
		this.f5 = new JButton("f5");
		f5.addActionListener(this);
		
		this.f6 = new JButton("f6");
		f6.addActionListener(this);
		
		this.f7 = new JButton("f7");
		f7.addActionListener(this);	
		
		this.g1 = new JButton("g1");
		g1.addActionListener(this);
		
		this.g2 = new JButton("g2");
		g2.addActionListener(this);;
		
		this.g3 = new JButton("g3");
		g3.addActionListener(this);
		
		this.g4 = new JButton("g4");
		g4.addActionListener(this);
		
		this.g5 = new JButton("g5");
		g5.addActionListener(this);
		
		this.g6 = new JButton("g6");
		g6.addActionListener(this);
		
		this.g7 = new JButton("g7");
		g7.addActionListener(this);		
		
		add(pane);

		pane.add(a1);
		pane.add(a2);
		pane.add(a3);
		pane.add(a4);
		pane.add(a5);
		pane.add(a6);
		pane.add(a7);
		
		pane.add(b1);
		pane.add(b2);
		pane.add(b3);
		pane.add(b4);
		pane.add(b5);
		pane.add(b6);
		pane.add(b7);
		
		pane.add(c1);
		pane.add(c2);
		pane.add(c3);
		pane.add(c4);
		pane.add(c5);
		pane.add(c6);
		pane.add(c7);
		
		pane.add(d1);
		pane.add(d2);
		pane.add(d3);
		pane.add(d4);
		pane.add(d5);
		pane.add(d6);
		pane.add(d7);
		
		pane.add(e1);
		pane.add(e2);
		pane.add(e3);
		pane.add(e4);
		pane.add(e5);
		pane.add(e6);
		pane.add(e7);
		
		pane.add(f1);
		pane.add(f2);
		pane.add(f3);
		pane.add(f4);
		pane.add(f5);
		pane.add(f6);
		pane.add(f7);
		
		pane.add(g1);
		pane.add(g2);
		pane.add(g3);
		pane.add(g4);
		pane.add(g5);
		pane.add(g6);
		pane.add(g7);		
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) 
	{
	   if (e.getSource() == a1) 
	   {
	      System.out.println("Click!");
	      //test = 1;
	   }
	   if (e.getSource() == a2) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == a3) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == a4) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == a5) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == a6) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == a7) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == b1) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == b2) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == b3) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == b4) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == b5) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == b6) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == b7) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == c1) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == c2) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == c3) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == c4) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == c5) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == c6) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == c7) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == d1) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == d2) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == d3) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == d4) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == d5) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == d6) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == d7) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == e1) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == e2) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == e3) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == e4) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == e5) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == e6) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == e7) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == f1) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == f2) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == f3) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == f4) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == f5) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == f6) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == f7) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == g1) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == g2) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == g3) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == g4) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == g5) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == g6) 
	   {
		   System.out.println("Click!");
	   }
	   if (e.getSource() == g7) 
	   {
		   System.out.println("Click!");
	   }
	}
	
	private void setLookAndFeel()
	{
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		}
		catch (Exception exc)
		{
			System.err.println("Couldn't use the system look and feel: " + exc);
		}
	}
		
	public static void main(String[] args) 
	{
		BattleshipGUI gui = new BattleshipGUI();
		
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
	    

	

