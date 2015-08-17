import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JFrame
{
	
	private JButton a1;
	private JButton a2;
	private JButton a3;
	private JButton a4;
	private JButton a5;
	private JButton a6;
	private JButton a7;
	
	int coordinate1;
	int coordinate2;
	
	// create array to use as a grid to place targets
	int[][] array = new int[7][7];
	
	int numAttempts;
	int numHits;	
	
	public Game()
	{
		
		super("Game");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		JPanel pane = new JPanel();
	
		GridLayout grid = new GridLayout(1,1,10,10);
				
		pane.setLayout(grid);
		this.a1 = new JButton("A1");
		this.a2 = new JButton("A2");
		this.a3 = new JButton("A3");
		this.a4 = new JButton("A4");
		this.a5 = new JButton("A5");
		this.a6 = new JButton("A6");
		this.a7 = new JButton("A7");
		
		add(pane);
		pane.add(a1);
		pane.add(a2);
		pane.add(a3);
		pane.add(a4);
		pane.add(a5);
		pane.add(a6);
		pane.add(a7);
		
		setVisible(true);
		
		// GAME CODE
		
		array[0][0] = 1;
		array[0][1] = 1;
		array[0][2] = 1;
		
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
		Game game = new Game();
	}
	
	    public void actionPerformed(ActionEvent e) 
	    {
	        if(e.getSource() == a1)
	        {
	        	coordinate1 = 0;
	        	coordinate2 = 0;
	        	
	        	if(array[coordinate1][coordinate2] == 1)
				{
					numAttempts++;
					numHits++;
					array[coordinate1][coordinate2] = 10;  // after a hit, update the coordinates to a "this spot has been hit already" value  
					System.out.println("*** Dot Com 1 HIT! ***");
					System.out.println("");
	        }         
	    }
	

	
}
	    
}
	

