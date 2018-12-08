//Seth Soileau
//Greatest Common Divisor Method
import java.util.Scanner;

public class GreatestCommonDivisorMethod {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n1 = 0;
    int n2 = 0;
    
    //Checks user input validation for non-integers
    do {
      System.out.print("Enter first integer: ");
      while(!input.hasNextInt()) {
        System.out.println("That's not a integer! Try Again!");
        input.next();
        System.out.print("Please enter the first integer: ");
      }
      n1 = input.nextInt();

      System.out.print("Enter second integer: ");
      while(!input.hasNextInt()) {
        System.out.println("That's not a integer! Try Again!");
        input.next();
        System.out.print("Please enter the second integer: ");
      }
	  n2 = input.nextInt();
	  
	  System.out.println("The greatest common divisor for " + n1 + " and " + n2 + 
	           " is " + GCD(n1, n2));
    } while (!input.hasNextInt());
  }
  
  public static int GCD(int n1, int n2) {
    int GCD = 1; //The initial GCD is 1
    int x = 2;  //Possible GCD
    
    while (x <= n1 && x <= n2) {
      if (n1 % x == 0 && n2 % x == 0)
        GCD = x;  //Updating GCD
        x++;
    }
    return GCD;  //Return GCD
  }
}