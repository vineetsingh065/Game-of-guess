
import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int numberToGuess = rand.nextInt(10);
		int numberOfTries = 0;
		Scanner input = new Scanner(System.in);
		int guess;
		boolean win = false; 
		while (win = false){
			System.out.println("Enter your Guess between 1 to 10");
			 guess = input.nextInt();
			 numberOfTries++;
			 if (guess == numberToGuess){
				 win = true;
			 }
			 else if (guess < numberToGuess){
				 System.out.println("Your Guess is too low");
			 }
			 else if(guess > numberToGuess){
				 System.out.println("Your Guess is too High");
			 }
			 System.out.println("You win");
			 System.out.println("Your Guess:"+numberToGuess);
			 System.out.println("You take:"+numberOfTries+"Tries");
		}
		
		
	}

}
