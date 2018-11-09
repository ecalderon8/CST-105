import java.util.Scanner;
/* Eric Calderon, this is my number guessing game.*/
 public class Game {
	
 public static void main(String[] args) {
 // Int answer = random number//
 int answer = (int)(Math.random() * 10001);
 Scanner input = new Scanner(System.in);
System.out.println("Think of a number between 1 and 10000");
 
      int guess = 0;
	   int counter = 0, min = 1, max = 10000;
 	 while (guess != answer) {
 		// guess, counter, min, and max are set to default//
   System.out.print("\nEnter your guess: ");
 		counter ++;
 		guess = input.nextInt();
 		
 // counter ++ is equivalent to counter = counter + 1. Keeps track of attempts
 		if (guess == answer) 
 	System.out.println("You win! The number was " + answer +
 			"! It took you " + counter + " attempt(s)!");
 		
 	// Max = guess & min = guess allow change in range //
 		else if (guess > answer) {
 			max = guess;
 	System.out.println("Think Lower");
 	System.out.print("Think of a number between " + min + " and " + max);
 	}
 		else {
 			min = guess;
 		System.out.println("Think Higher");
 		System.out.print("Think of a number between " + min + " and " + max);
 		}
 		 // End 
 		
 }
}
}
