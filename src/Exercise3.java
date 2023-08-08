/**
 * Week 2, Exercise 3.
 * @author INSERT YOUR NAME HERE
 */
public class Exercise3 {

	public static void main(String[] args) {
		double TempC = 20.5;
		System.out.println("Tempreture in Celcius: " + TempC + "C");
		
		double TempFaren = FarenConvert(TempC);
		System.out.print("Tempreture in Farenheit: " + TempFaren + "F");
		
	}
	
	public static double FarenConvert(double Temp) {
		double TempF = Temp;
		TempF = (TempF * 9/5) + 32;
		return TempF;
	}

}
