//Seth Soileau
//Chinese Zodiac
import java.util.Scanner;

public class ChineseZodiac {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int year;
    
    //Checks user input validation for non-positive integers and/or non-integers
    do {
      System.out.print("Enter a year: ");
      while(!input.hasNextInt()) {
        System.out.println("That's not a vaild value! Try Again!");
        input.next();
        System.out.print("Please enter a year: ");
      }
      year = input.nextInt();
      
      //Converts the entered year to the proper zodiac animal
      switch(year % 12) {
        case 0: System.out.println("Monkey"); break;
        case 1: System.out.println("Rooster"); break;
        case 2: System.out.println("Dog"); break;
        case 3: System.out.println("Pig"); break;
        case 4: System.out.println("Rat"); break;
        case 5: System.out.println("Ox"); break;
        case 6: System.out.println("Tiger"); break;
        case 7: System.out.println("Rabbit"); break;
        case 8: System.out.println("Dragon"); break;
        case 9: System.out.println("Snake"); break;
        case 10: System.out.println("Horse"); break;
        case 11: System.out.println("Sheep"); break;
      }
    } while(year < 0);
  }
}