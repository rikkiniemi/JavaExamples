/*
*3.17
*/
package gasmileage;

//Import scanner class
import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {

        //Assign variables
        int miles, gals, i=1, trips;
        
        float mpg, avgmpg=0;
        
        //Create input
        Scanner input = new Scanner(System.in);
        
        //Prompt number of trips
        System.out.println("How many trips do you want to calculate?");
        
        //Read in number of trips
        trips = input.nextInt();
        
        //Loop to calculate mpg per trip until all mpg's per trip are calculated
        while( i <= trips ){
            
            //Prompt for miles traveled
            System.out.printf("%s%d%s%n", "How many miles were traveled on trip #", i,"?" );
            
            //Input miles
            miles = input.nextInt();
            
            //Prompt for gallons used
            System.out.printf("%s%d%s%n", "How many gallons were used on trip #", i,"?" );
            
            //Input gallons used
            gals = input.nextInt();
            
            //Calculate miles per gallon
            mpg = miles/gals;
            
            //Output mpg for trip
            System.out.printf("%s%d%s%f%s%n","Trip #",i," used ",mpg," miles per gallon." );
            
            //Add to average mpg variable to calculate after loop
            avgmpg = mpg;
           
            //Increment trip counter
            i++;
        }
            //Complete calculation for average miles per gallon
            avgmpg = avgmpg/trips;
            
        //Output average miles per gallon for all trips
        System.out.printf("%s%d%s%f%s%n","Average miles per gallon for ",trips," trips = ",avgmpg,"." );
        
    }
    
}
