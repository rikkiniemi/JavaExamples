/*
Rikki Niemi
CSC 18A
Exercise 2.25 Odd or Even
3/2/16
 */
package oddoreven;
//Import Scanner class to read in numbers
import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        //Create a Scanner to read in numbers
        Scanner input = new Scanner(System.in);
        
        //Create variable for number to be evaluated
        int num;
        
        //Prompt, and then read in number
        System.out.println("Enter a number to see if it's odd or even: ");
        
        num = input.nextInt();
        
        //Check to see if user entered zero, and if so, prompt and then read in another value
        if( num == 0 )
            System.out.printf("%s%n", "You cannot enter zero. Enter another number");  
            num = input.nextInt();
        
        //If the number has a remainder of zero when divided by 2, print that it is even
        if( num%2 == 0 )
            System.out.printf("%d%s" ,num, " is even.");
 
        //If the number does not have a remainder of zero when divided by 2, print that it is odd
        if( num%2 != 0 )
            System.out.printf("%d%s" ,num, " is odd.");        
           
        
        
        
        
    }
    
}
