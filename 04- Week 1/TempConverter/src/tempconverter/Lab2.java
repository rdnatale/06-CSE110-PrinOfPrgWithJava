package tempconverter;


/*-------------------------------------------------------------------------
// AUTHOR: Robert D Natale
// FILENAME: Lab2.java
// SPECIFICATION: Average Test Grade
// FOR: CSE 110- Lab #2
// TIME SPENT: 30 minutes
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab2 
{

    public static void main(String[] args) 
    {
        final int NUM_TESTS = 3;
        double test1, test2, test3, average; //end variables, start input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Test Grade: ");
        test1 = scan.nextDouble();//test one complete
        System.out.print("Enter Second Test Grade: ");
        test2 = scan.nextDouble();//test two complete
        System.out.print("Enter Third Test Grade: ");   
        test3 = scan.nextDouble();//test three complete
        average = (test1 + test2 + test3) / NUM_TESTS;
        System.out.println("And your Test Average is!: " + average);//answer
       
    }
                     
    

}
