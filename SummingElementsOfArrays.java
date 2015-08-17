
public class SummingElementsOfArrays 
{
	public static void main(String[] args) 
	{
		int bucky[] = {1,2,3,4,5};
		
		int sum = 0;
		
		for (int counter = 0; counter < bucky.length; counter++)
		{
			sum +=bucky[counter];
		}
		
		System.out.println("The sum of these numbers is " + sum);
		
	}
}
