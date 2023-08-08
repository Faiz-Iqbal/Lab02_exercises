
/**
 * Week 2, Exercise 7.
 * @author INSERT YOUR NAME HERE
 */
import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		/*
		 * First, copy across the code from your solution to Exercise 6.
		 */
		// Assign variables
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int age = scan.nextInt();

		final int Days = 365 * age;
		final int Hours = 24 * Days;
		final int Minutes = 60 * Hours;

		// Print them out

		System.out.println(
		"You are " + age + " years old, \n which is the same as "
		+ Days + " Days, \n which is the same as "
		+ Hours + " Hours,\n which is" + " the same as " 
		+ Minutes + " Minutes.");

	}

}
