//Seth Soileau
//Display Time
import java.util.Scanner;

public class DisplayTime {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int seconds;
    
    //Checks user input validation for non-positive integers and/or non-integers
    do {
      System.out.print("Enter a positive integer for seconds: ");
      while(!input.hasNextInt()) {
        System.out.println("That's not a integer! Try Again!");
        input.next();
        System.out.print("Please enter a positive integer for seconds: ");
      }
      seconds = input.nextInt();
    } while (seconds < 0);
    
    //Conversions
    int minutes = seconds/60;
    int hours = minutes/60;
    int days = hours/24;
    int years = days/365;
    int remainingDays = days % 365;
    int remainingHours = hours % 24;
    int remainingMinutes = minutes % 60;
    int remainingSeconds = seconds % 60;
    System.out.println(seconds + " second(s) is " + years + " year(s) and " + remainingDays + 
    		           " day(s) and " + remainingHours + " hour(s) and " + remainingMinutes + 
    		           " minute(s) and " + remainingSeconds + " second(s)");
  }
}