import java.util.Random;


public class RandomNumberGenerator 
{

	public static void main(String[] args) 
	{
		
		Random dice = new Random();
		int number;
		
		for (int i = 1; i <= 10; i++)
		{
			number = 1+ dice.nextInt(6);  //dice has six sides
			System.out.println(number + " ");
		}

	}

}
