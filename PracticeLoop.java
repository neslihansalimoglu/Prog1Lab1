import java.util.*;
public class PracticeLoop{

	public static void main(String[] args) {

		char letterGrade;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your grade: ");

		int grade = scan.nextInt();

		if (grade >= 90)
			letterGrade = 'A';

		else if (grade >= 80)
			letterGrade = 'B';

		else if (grade >= 70)
			letterGrade = 'C';

		else if (grade >= 60)
			letterGrade = 'D';

		else 
			letterGrade = 'F';

		System.out.println("Your test grade " + grade  + " is a letter grade of " + letterGrade);
	}
}


