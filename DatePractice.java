import java.util.*;
public class DatePractice{
	public static void main(String[] args) {
		System.out.println("\n*******Date Practice*******");

		Date today = new Date();
		Date afterToday =new Date();

		System.out.println("The year of the date is " + afterToday.getYear());
		System.out.println("The month of the date is " + afterToday.getMonth());
		System.out.println("The date of the date is " + afterToday. getDate());
		System.out.println("The day of the date is " + afterToday.getDay());

		//sets the year to 2040
		afterToday.setYear(140);
	}
	
}