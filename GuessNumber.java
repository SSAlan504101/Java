//Seth Soileau
//Guess Number
import java.util.Scanner;

public class GuessNumber {
  public static void main(String[] args) {
	//Generate a random number to be guessed
    int number = (int)(Math.random() * 101);
    
    Scanner input = new Scanner(System.in);
    System.out.println("Guess a number between 0 and 100.");
    int guess = -1;
    
    //Checks user input validation for non-integers between 0 and 100
    do {
      //Prompt the user to guess the number
      System.out.println("Enter your guess: ");
      while(!input.hasNextInt()) {
        System.out.println("That's not a vaild value! Try Again!");
        input.next();
        System.out.print("Please enter an integer between 0 and 100 as your guess: ");
      }
      guess = input.nextInt();
      
      if (guess == number)
        System.out.println("You are correct! The number is " + number + ".");
      else if (guess > number)
    	System.out.println("Your guess is too high.");
      else
    	System.out.println("Your guess is too low.");
      
    } while (guess != number);
  }
}