/**
 * Week 2, Exercise 5.
 * @author INSERT YOUR NAME HERE
 */
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Number;
		int Cube;
		
		System.out.println("Welcome to your Math Program");
		System.out.println("Please enter a number: ");
		
		Number = scan.nextInt();
		Cube = Number*Number*Number;
		
		System.out.println("The cube of " + Number + " is " + Cube);
	}

}
