
public class Lesson23 {

	public static void main(String[] args) {

		// a = p(1+r)^n
		
		double amount;
		double principal = 10000;
		double rate = .01;
		
		for(int day = 1; day <= 20; day++)
		{
			amount = principal * Math.pow(1 + rate, day);
			System.out.println(day + " " + amount);
		}

	}

}
