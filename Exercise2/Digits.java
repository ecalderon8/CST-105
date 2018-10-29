import java.util.Scanner;
/*Eric Calderon, this is my 5-digit input*/
public class Digits {
public static void main(String[] args) {
 
	Scanner input = new Scanner(System.in);
 
 System.out.print("Enter + integers");
 int number1 = input.nextInt();
 int number2 = input.nextInt();
 int number3 = input.nextInt();
 int number4 = input.nextInt();
 int number5 = input.nextInt();
 
 //Compute sum, average, and remainder
 int sum = (number1 + number2 + number3 + number4 + number5);
 int average = (number1 + number2 + number3 + number4 + number5) / 5;
 int remainder = (number1 + number2 + number3 + number4 + number5) % 5;
 
 //Leave a space between each number during input.
 System.out.println("The sum of " + number1 + " " + number2
		 + " " + number3 + " " + number4 + " " + number5 + " is " + sum);
 System.out.println("The average of " + number1 + " " + number2
		 + " " + number3 + " " + number4 + " " + number5 + " is " + average);
 System.out.println("The remainder of " + number1 + " " + number2
		 + " " + number3 + " " + number4 + " " + number5 + " is " + remainder);
 
	}
}

