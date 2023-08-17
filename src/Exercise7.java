
/**
 * Week 2, Exercise 7.
 * @author INSERT YOUR NAME HERE
 */
import java.util.Scanner;

public class Exercise7 {

	static final int DAYS_IN_YEAR = 365;
	static final int HOURS_IN_DAY = 24;
	static final int MINUTES_IN_HOUR = 60;
	
	public static void main(String[] args) {
		/*
		 * First, copy across the code from your solution to Exercise 6.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		
		// Assign variables
		int age = scan.nextInt();
		
		int days = age * DAYS_IN_YEAR;
		int hours = days * HOURS_IN_DAY;
		int minutes = hours * MINUTES_IN_HOUR;
		

		// Print them out
		System.out.println(
		"You are " + age + " years old, \n which is the same as "
		+ days + " Days, \n which is the same as "
		+ hours + " Hours,\n which is" + " the same as " 
		+ minutes + " Minutes.");

	}

}
