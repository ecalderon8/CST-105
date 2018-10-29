import java.util.Scanner;

	public class Celsius {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		//Convert Fahrenheit to Celsius
		double celsius = (fahrenheit - 32) * 5.0 / 9;
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
		
		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter a Celsius: ");
		double celsius1 = input2.nextDouble();
		
		//Convert Celsius to Fahrenheit
		double fahrenheit1 = (celsius1 * (9.0 / 5) + 32);
		System.out.println(" Celsius " + celsius1 + " is " + fahrenheit1 + " in Fahrenheit");
		
}
	}