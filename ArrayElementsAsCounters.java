import java.util.Random.*;

public class ArrayElementsAsCounters 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int freq[] = new int[7];
		
		for(int roll = 1; roll < 1000; roll++)
			++freq[1+rand.nextInt(6)];

	}

}
