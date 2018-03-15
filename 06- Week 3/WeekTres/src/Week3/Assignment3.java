
/*-------------------------------------------------------------------------
// AUTHOR: Robert D Natale
// FILENAME: Assignment3.java
// SPECIFICATION: work assiged for week three
// FOR: CSE 110- 
// TIME SPENT: unknown, i rarely keep track or look at the clock
//-----------------------------------------------------------*/

/*
Part 1
1. (4 pts) What do the following loops print? 
a) for (int i = 10; i > 1; i--)
    System.out.print(i + " ");
    10 9 8 7 6 5 4 3 2

b) int j = 1;
    while (j < 20) 
    {
        if (j % 5 == 0)
            System.out.print(j + " ");
        j += 2;
    }
   5 15

2.(6 pts) Given the following code segment that reads in a String str: 
 String str = in.nextLine();
Write a loop that will print out the value entered into str in reverse. That 
is if the user entered “Harry”, the loop should print “yrraH”. This does 
not have to be a complete program, but you should test your loop inside 
a complete program. Section 4.7.2 in the book and the Examples for Loops 
lecture video show some String loop examples with a for loop. 

public static void main(String[] args) 
    {
     
     Scanner in = new Scanner (System.in);
     System.out.println("Enter something: ");
     String str = in.nextLine();
    
     for (int i = str.length() - 1; i != -1; i--)
    {
        char ch = str.charAt(i);
        System.out.print(ch);
    }    
    } */

//Part 2 programming 

import java.util.Scanner;

public class Assignment3 
{

    public static void main(String[] args) 
    {
     int num1, num2, n1, n2;
     
     Scanner in = new Scanner (System.in);
     
     System.out.println("Enter the first integer: ");
     num1 = in.nextInt();
     n1 = num1;
     
     boolean valid = true;
     
    // num1 positive validation
     while (num1 <= 0)
     {
         System.out.print("Enter a positive number: ");
         num1 = in.nextInt();
         valid = false;
     }
     if (!valid)
         System.out.println();
     
     System.out.println("Enter the second integer: ");
     num2 = in.nextInt();
     n2 = num2;
     
     // num2 positive validation
     while (num2 <= 0)
     {
         System.out.print("Enter a positive number: ");
         num2 = in.nextInt();
         valid = false;
     }
     if (!valid)
         System.out.println();
     
     // gcd loop    
     while (num1 != num2)
     {
         if (num1 > num2)
             num1 -= num2;
         else 
             num2 -= num1;
     }
     
     
     System.out.println("The gcd of " + n1 + " & " + n2 + " is: " + num1);
     
        
    } // end main

}
