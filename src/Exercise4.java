/**
 * Week 2, Exercise 4.
 * 
 * @author Michael Lones
 */
public class Exercise4 {

	public static void main(String[] args) {
		/*
		 * First, copy across the code in the main method from your solution to Exercise
		 * 1.
		 */

		// Declare variables
		int daysInAYear = 365;
		int hoursInADay = 24;
		int minutesInAnHour = 60;
		int age = 18;

		// Assign variables
		int Days = age * daysInAYear;
		int Hours = Days * hoursInADay;
		int Minutes = Hours * minutesInAnHour;

		// Print them out
		System.out.println("Age = "+ age);
		System.out.println(Days + " Days");
		System.out.println(Hours + " Hours");
		System.out.println(Minutes + " Minutes");

	}

}
