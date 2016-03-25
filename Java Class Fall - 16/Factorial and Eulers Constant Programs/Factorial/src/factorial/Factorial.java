/*
 * Rikki Niemi
 * CSC 18A
 * Homework #2 3.37 a.
 */
package factorial;

//Import Scannner class to read in integer
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        //Create new Scanner 
        Scanner input = new Scanner(System.in);
        
        //Assign variables;
        
        int num;        //Number to read in
        int i = 1 ;     //Number to multiply
        int count = 1;  //Counter for loop
        
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
        
        //Calculate factorial by looping for num number of terms
        
        while(count <= num ){
            
            i*=count;

            
            count++;
            
        }
       
        //Print out result
        System.out.printf("%d%s%d", num,"! = ", i);
        
    }
    
}
