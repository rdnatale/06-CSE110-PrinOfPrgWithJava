
//***********************************************************
// Name: Robert D Natale
// Title: Assignment 1  
// Description: All three parts for Assignent 1
// Time spent: 45 mins
// Date: 3/17/17
//***********************************************************

/*
Part 1

(a) Change TempConverter to tempConverter. 
    Caused by: java.lang.RuntimeException: Uncompilable source code - class tempConverter is public, should be declared in a file named tempConverter.java
    at tempConverter.<clinit>(TempConverter.java:11)
(b) Remove the first quotation mark in the first string literal in the first System.out.println( ) statement.
    Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - Erroneous tree type: <any>
    at TempConverter.main(TempConverter.java:27)
(c) Remove the semicolon at the end of the first println( ) statement.
    Program ran without error code. 
(d) Remove the last brace in the program.
    The program ran without error code. 
(e) Change the variable name fahrenheitTemp to fahrenheit in any one place in the code.
    Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - cannot find symbol
    symbol:   variable fahrenheitTemp
    location: class TempConverter
    at TempConverter.main(TempConverter.java:25)
*/

/*
Part 2

1. a)mystery has the value: 5
   b)mystery has the value: 2.5
   c)mystery has the value: 6

2. A: 0.0
   B: 3.3333333333333335
   C: 2.0
   D: 4.3
   E: 0.24806201550387597
   F: 1.0
   G: 1.0
*/

/*
Part 3
Write a Java program called Assignment1.java that will calculate the tip to leave at a restaurant. Your
program must ask the user for the amount of the bill (this could contain decimals), and the percent they
want to tip. The user will enter the percent they want to tip as an integer, e.g. 15 for 15
• Comments explaining the main parts of the code (Getting input, calculating results, etc)
• Descriptive variable names with appropriate types
• Appropriate indentation between braces
• Use the NumberFormat class to format the output to be display as currency as demonstrated in the
Coding Sample video.
*/

import java.util.Scanner;
import java.text.NumberFormat;


public class Assignment1 {
    
    public static void main (String[] args)
    {
      //variables
      int tipPercent;
      double bill, tip, total;
      
      //input
      Scanner scan = new Scanner (System.in);
      NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
      System.out.print("Enter The Amount Of The Bill: ");
      bill = scan.nextDouble();
      System.out.print("Enter The Percent You Wish To Tip (Mulitple Of 5): ");
      tipPercent = scan.nextInt();
      
      //Calculation
      tip = bill * ((double) tipPercent/100);
      total = tip + bill;
      
      //output
      System.out.println("Your Tip Should Be: " + fmt1.format(tip));
      System.out.println("Your Total Bill Will Be: " + fmt1.format(total));
      
      
    }        

}
