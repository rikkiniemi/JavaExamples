/*
 * Rikki Niemi
 * CSC 18A
 * Homework #2 3.37 c.
 */
package factorialc;

//Import Scannner class to read in integer
import java.util.Scanner;

public class FactorialC {

    public static void main(String[] args) {
        
        //Create new Scanner 
        Scanner input = new Scanner(System.in);
        
        //Assign variab;es
        int i=1, exp=1, y=1, num=1;
        double eulers=1, factorial=1, x=1;
        
        //Prompt for number of terms to approximate to
        System.out.println("Enter the number of terms to approximate e^x to ");
        
        num = input.nextInt();
        
        //Prompt for number the exponent
        System.out.println("Enter the exponent ");        
        
        exp = input.nextInt();
        
        //Loop for each term
        
        while ( i <= num ){
            
            //Calculate factorial
            factorial*=i;
        
                    //Loop to calculate exponent
                    while(y <= i){
                        
                        x*=exp;
                        
                        //Increment counter
                        y++;
                    }
        
        //Increment for new term
        i++;
        
        //Add values to eulers
        eulers+=x/factorial;

        }
        //Print result
        System.out.printf("%s%d%s%f%n", "e^", exp," = ", eulers);
    }
    
}
