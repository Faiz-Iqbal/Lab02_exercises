
/**
 * Week 2, Exercise 8.
 * @author Mohammed Faiz Iqbal
 */
import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// Declaring variables to store user info
		String name;
		double height;
		int noOfSiblings;
		int nameLength;

		// Scanner object to take input from user
		Scanner scan = new Scanner(System.in);

		System.out.println("Whats your name?");
		name = scan.nextLine();
		nameLength = name.length();

		System.out.println("How tall are you in meters?");
		height = scan.nextDouble();

		System.out.println("How many siblings do you have?");
		noOfSiblings = scan.nextInt();

		System.out.println("Hello " + name + ", you are " + height + " meters tall," + " you have " + noOfSiblings
				+ " siblings, and your name is " + nameLength + " letters long");

	}

}
