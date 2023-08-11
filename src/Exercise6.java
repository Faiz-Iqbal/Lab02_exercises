/**
 * Week 2, Exercise 6.
 * 
 * @author Mohammed Faiz Iqbal
 */

public class Exercise6 {
	
	static final int DAYS_IN_YEAR = 365;
	static final int HOURS_IN_DAY = 24;
	static final int MINUTES_IN_HOUR = 60;
	
	public static void main(String[] args) {
		/*
		 * First, copy across the code from your solution to Exercise 4.
		 */
		
		// Time variable
		int age = 18;
		
		// Convert values
		int days = age * DAYS_IN_YEAR;
		int hours = days * HOURS_IN_DAY;
		int minutes = hours * MINUTES_IN_HOUR;
		
		// Print them out
		System.out.println(days);
		System.out.println(hours);
		System.out.println(minutes);
		
	}
}
