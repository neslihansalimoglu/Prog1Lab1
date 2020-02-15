import java.util.*;
import java.text.DecimalFormat;

public class Question1{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		double pricePerKilometer = 1.16;

		//asks user the total kilometre willl be travelled
		System.out.println("Hey,have a happy and safe journey. How many kilometres you will be travelled? ");
		
		//int kilometres = scan.nextInt();
		double kilometres = scan.nextDouble();

		//asks the user the avarage distance that the vehicle runs per liter of gas
		System.out.println("Oh That's great. What is the avarage distance that your vehicle runs with 1 liter of gas? ");
		
		//int kpl = scan.nextInt();
		double kpl = scan.nextDouble();

		//calculate the cost of driving
		double costOfDriving = (kilometres / kpl) * pricePerKilometer;

		DecimalFormat pricePattern = new DecimalFormat("$0.00");

		//result will be
		System.out.println("Your journey will cost you $" 
							+ pricePattern.format(costOfDriving) +  " Why don't you just stay home? Get a pizza and watch netflix. It won't cost you this much. ");

	}
}