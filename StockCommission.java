import java.util.Scanner;

public class StockCommission {

	public static void main(String[] args) {
		
		double numStocksBought = 600;
		double stockPrice = 21.77;
		double stockCommissionPercent = 0.02;
		
		
		System.out.println(numStocksBought * stockPrice);
		System.out.println((numStocksBought * stockPrice) * stockCommissionPercent);
		System.out.println((numStocksBought * stockPrice) + ((numStocksBought * stockPrice) * stockCommissionPercent));
		
	}
	
}
