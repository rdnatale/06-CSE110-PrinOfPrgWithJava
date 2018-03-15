
/*-------------------------------------------------------------------------
// AUTHOR: Robert D Natale
// FILENAME: Lab7.java
// SPECIFICATION: filling an array
// FOR: CSE 110- 
// TIME SPENT: 10 mins
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab7 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner (System.in);
        
        // constant
        final int SIZE = 5;
        
        // array
        int[] array = new int[SIZE];
        
        // loop- array input
        for (int index = 0; index < 5; index++)
        {
            System.out.print("Enter an integer: ");
            int input = scan.nextInt();            
            array[index] = input;            
        }// end input
        
        // loop- array display
        System.out.println("\nProcessing each array element...");
        for (int index = 0; index < 5; index++)
        {
           System.out.println(array[index]);             
        } // end display
    }

}
