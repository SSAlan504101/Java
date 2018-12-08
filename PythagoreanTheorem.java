//Seth Soileau
//Pythagorean Theorem
import java.util.Scanner;

public class PythagoreanTheorem {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double sideA, sideB, sideC;
    
    //Checks user input validation for non-numbers
    do {
      System.out.print("Enter a value for side a: ");
      while(!input.hasNextDouble()) {
        System.out.println("That's not a vaild value! Try Again!");
        input.next();
        System.out.print("Please enter a value for side a: ");
      }
      sideA = input.nextDouble();
    
      System.out.print("Enter a value for side b: ");
      while(!input.hasNextDouble()) {
        System.out.println("That's not a vaild value! Try Again!");
        input.next();
        System.out.print("Please enter a value for side b: ");
      }
      sideB = input.nextDouble();
      
      //Calculates the Pythagorean Theorem: sideC = Sqrt(sideA^2) + Sqrt(sideB^2)
      sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
      System.out.println("The length of the hypotenuse, side c is " + sideC);
    } while(!input.hasNextDouble());	
  }
}