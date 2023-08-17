
/**
 * Week 2, Exercise 3.
 * @author Mohammed Faiz Iqbal
 */
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// create scanner
		Scanner input = new Scanner(System.in);

		// read in value from user: note nextDouble for double variable
		System.out.println("Enter temperature in degrees Celcius (C):");
		double ctemp = input.nextDouble();

		double ftemp = ctemp * 9 / 5 + 32;

		// print out the result to the user
		System.out.println("In Farenheit, " + ctemp + " Celcius is " + ftemp + " degrees");
	}

}
