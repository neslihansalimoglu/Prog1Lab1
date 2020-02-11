import java.util.*;
public class ScannerPractice1{

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");

		//input.nextInt();

		int value = input.nextInt();
		System.out.println("You've typed" + value);

		System.out.println("Enter a double: ");
		double valueD = input.nextDouble();
		System.out.println("You've typed" + valueD);

		System.out.println("Enter your full name");
		String firstName = input.next();
		System.out.println("your firstName is " + firstName);

		String name = input.nextLine();
		System.out.println("Your full name is " + firstName + name);

	}
}