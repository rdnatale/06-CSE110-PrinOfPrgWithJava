
/*-------------------------------------------------------------------------
// AUTHOR: Robert D Natale
// FILENAME: Lab4.java
// SPECIFICATION: practice with loops
// FOR: CSE 110- 
// TIME SPENT: 
//-----------------------------------------------------------*/
/*
Notes from the assignment:
  A line stating the smallest integer the user entered
 A line stating the largest integer the user entered
 A line stating the number of integers entered
 A line stating the number of even integers entered
 A line stating the number of odd integers entered
 A line stating the average value of all of the integers 
    that the users entered
*/

import java.util.Scanner;

public class Lab4 
{

    public static void main(String[] args) 
    {

        // declaring int
        int input, even = 0, odd = 0;
        double avg = 0, sum = 0, total = 0; 
        
        Scanner scan = new Scanner (System.in);        
        System.out.println("Enter a series of values (0 to quit): ");
        input = scan.nextInt(); //value inputed
        int large = input;
        int small = input;
        
        if (input == 0)
        System.out.println("No data was entered");
        else
        {    
            while (input != 0)              //establish main loop
            {
                //classifying 
                if (input > large) 
                    large = input;          //update max
                if (input < small)
                    small = input;          //update min
                if ((input/2)*2 == input)                             
                    even++;                 //update even
                else
                    odd++;                  //update odd

                sum += input;
                total = even + odd;
                avg = sum / total;          //average 

                input = scan.nextInt();     //value inputed
            }
        }
                                            //end main loop
        
        //  output 
        System.out.println("The smallest integer entered:  " + small);
        System.out.println("The largest integer entered:  " + large);
        System.out.println("The number of integers entered: " + total);
        System.out.println("The number of even integers entered: " + even);
        System.out.println("The number of odd integers entered: " + odd);
        System.out.println("The average value of all of the integers: " + avg);
        
    }

}
