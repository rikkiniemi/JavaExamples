/*
Rikki Niemi
CSC 18A
Exercise 2.24 Largest and Smallest Integers
3/2/16
 */
package landsint;

//Import scanner class to read in integers
import java.util.Scanner;

public class LandSInt {

    //Begins execution of Java application
    public static void main(String[] args) {

        //Create Scanner to read in integers from keyboard
        Scanner input = new Scanner(System.in);
        
        //Create variables for integers
        int num1, num2, num3, num4, num5;
        
        //Create variables for largest and smallest numbers;
        int lrg, sml;
        
        //Prompt for integer input, and then read in integer
        System.out.println("Enter integer one: ");
        num1 = input.nextInt();
        
        System.out.println("Enter integer two: ");
        num2 = input.nextInt();
        
        System.out.println("Enter integer three: ");
        num3 = input.nextInt();
        
        System.out.println("Enter integer four: ");
        num4 = input.nextInt();
        
        System.out.println("Enter integer five: ");
        num5 = input.nextInt();        
        
        //Set large and small numbers equal to first integer to compare
        sml = num1;
        lrg = num1;
        
        //Compare first number to all other numbers to find the largest
        if( lrg < num2)
            lrg = num2;
        
        if( lrg < num3)
            lrg = num3;
        
        if( lrg < num4)
            lrg = num4;
        
        if( lrg < num5)
            lrg = num5;        
        
        //Compare first number to all other numbers to find the smallest
        if( sml > num2)
            sml = num2;
        
        if( sml > num3)
            sml = num3;
        
        if( sml > num4)
            sml = num4;
        
        if( sml > num5)
            sml = num5;     
        
        //Print Results
        System.out.printf("%d%s%n", lrg, " is the largest number");
        
        System.out.printf("%d%s", sml, " is the smallest number");
        
        
        
        
        
    }
    
}
