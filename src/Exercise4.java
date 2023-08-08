/**
 * Week 2, Exercise 4.
 * @author Michael Lones
 */
public class Exercise4 {

	public static void main(String[] args) {
		/* First, copy across the code in the main method
		   from your solution to Exercise 1. */
		// Declare variables
				int Days;
				int Hours;
				int Minutes;
				int age;
				
				// Assign variables
				age = 18;
				Days = 365*age;
				Hours = 24*Days;
				Minutes = 60*Hours;
				
				
				// Print them out
				System.out.println("Days in a Year: " + Days);
				System.out.println("Hours in a Day: " + Hours);
				System.out.println("Minutes in an Hour: " + Minutes);

	}

}
