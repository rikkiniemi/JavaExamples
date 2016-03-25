/*
Rikki Niemi
CSC 18A
Exercise 2.25 Odd or Even
3/2/16
 */
package multiples;
//Import Scanner class
import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {
        
 //Create a Scanner to read in numbers
        Scanner input = new Scanner(System.in);
        
        //Create variables for numbers to be evaluated
        int num1, num2;
        
        //Prompt, and then read in first number
        System.out.println("Enter a number to be divided: ");
        num2 = input.nextInt();
        
        //Prompt, and then read in second number
        System.out.println("Enter the divisor: ");
        num1 = input.nextInt();
        
        //Check to see if user entered zero for divisor. If so, prompt for a new number
        if( num1 == 0)
            System.out.println("Dividing by zero is not allowed. Enter another number.");
            num1 = input.nextInt();

        //If the second number divided by the first number has a remainder of zero, then the first number is a multiple of the second
        if( num2%num1 == 0)
            System.out.printf("%n%d%s%d%n" ,num1, " is a multiple of ", num2);
 
        //If the second number divided by the first number does not have a remainder of zero, then the first number is not a multiple of the second
        if( num2%num1 != 0 )
            System.out.printf("%n%d%s%d%n" ,num1, " is not a multiple of ", num2);        
    }
    
}
