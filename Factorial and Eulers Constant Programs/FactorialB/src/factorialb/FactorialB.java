/*
 * Rikki Niemi
 * CSC 18A
 * Homework #2 3.37 b.
 */
package factorialb;

//Import Scannner class to read in integer
import java.util.Scanner;

public class FactorialB {

    public static void main(String[] args) {
        
        //Create new Scanner 
        Scanner input = new Scanner(System.in);
        
        //Assign variables;
        
        int num;                    //Number of terms
        double factorial = 1 ;      //Factorial  
        double count = 1;           //Loop counter for terms
        double eulers = 1;          //Number to approximate
        
        //Prompt to read in non-negative integer
        System.out.println("Enter a non-negative integer greater than zero: ");
        
        //Read in integer
        num = input.nextInt();

        //Check to see if a non-negative integer was entered, or a zero
        if(num <= 0){
            
            //If a zero or negative integer was entered, prompt to read in new integer
            System.out.println("You cannot enter a number greater than or equal to zero. Enter a non negative integer: ");
        
            //Read in new integer
            num = input.nextInt();
        }
        
        //Approximate e value with num number of terms
        
        while(count <= num ){
            
            //Calculate factorial for term
            factorial*= count;

            //Add 1/factorial to eulers
            eulers += 1/factorial;
            
            //Increment counter        
            count++;
        }

        //Print out result
        System.out.printf("%s%d%s%.10f", "e approximated to the ", num,"th term = ",eulers);
        
    }
    
}
