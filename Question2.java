import java.util.*;
import java.text.DecimalFormat;

public class Question2{
	public static void main(String[] args) {
		
		System.out.println("Enter an amount in CAD: ");
		Scanner scan = new Scanner (System.in);
		
			double price = scan.nextDouble();

			double tps = price  * 0.05 /100;
			double tvq = price  * 9.975 /100;
			double tips = (price + tps + tvq)*15/100;
			double cost = price +tps +tvq +tips;

			DecimalFormat pricePattern = new DecimalFormat("$0.00");

			System.out.println("The price with taxes and tips will be " + pricePattern.format(cost));

	}
}