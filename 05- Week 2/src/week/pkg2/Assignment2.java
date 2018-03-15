/*-------------------------------------------------------------------------
// AUTHOR: Robert D Natale
// FILENAME: Assignment2
// SPECIFICATION: Assignment 2
// FOR: CSE 110- 
// TIME SPENT: unknown
//-----------------------------------------------------------*/

/*
Part 1: Written Exercise
Question 1
a) true
b) false
c) true
d) true

Question 2
import java.util.Scanner;

public class Name 
{

    public static void main(String[] args) 
    {
        // define strings & vars
        String name1;
        int length;
        
        // input
        Scanner in = new Scanner(System.in);
        System.out.print("Please type your name: ");
        name1 = in.nextLine();      
    }   
}

Question 3
Hy
*/

// Part 2: Programming
import java.util.Scanner;
import java.text.NumberFormat;

public class Assignment2 
{

    public static void main(String[] args) 
    {
     // Menu display
     System.out.println("\tWelcome to the In-N-Out Burger menu:\n------------------------------------------------------\n\tHamburger $2.75\n\tCheeseburger $3.25\n\tFrench Fries $2.50\n\tShake & Beverage: $1.50");
    
     // Variables
     final double HAM = 2.75, CHEESE = 3.25, FRY = 2.50, SHAKE = 1.50;
     int hamQ, cheeseQ, fryQ, shakeQ, tq; //Q= quanity 
     double hamTC, cheeseTC, fryTC, shakeTC, tc;//TC= Total Cost
     String strHC;
     
     //Input
     NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
     Scanner scan = new Scanner (System.in);
     System.out.println("How many hamburger(s) would you like to buy? ");
     hamQ = scan.nextInt();
     System.out.println("How many cheeseburger(s) would you like to buy? ");
     cheeseQ = scan.nextInt();
     System.out.println("How many french fries would you like to buy? ");
     fryQ = scan.nextInt();
     System.out.println("How many drink(s) would you like to buy? ");
     shakeQ = scan.nextInt();
     
     //Math
     hamTC = HAM * hamQ;
     cheeseTC = CHEESE * cheeseQ;
     fryTC = FRY * fryQ;
     shakeTC = SHAKE * shakeQ;
     tc = hamTC + cheeseTC + fryTC + shakeTC;
     tq = hamQ + cheeseQ + fryQ + shakeQ;
     
     
     if (hamTC > cheeseTC && hamTC > fryTC && hamTC > shakeTC)
        strHC = "hamburgers";  
     else if (cheeseTC > hamTC && cheeseTC > fryTC && cheeseTC > shakeTC)
        strHC = "cheeseburgers";
     else if (fryTC > hamTC && fryTC > cheeseTC && fryTC > shakeTC)
        strHC = "french fries";
     else 
        strHC = "drinks";
     
     
     //Output
     System.out.println("The total cost for hamburgers: " + fmt1.format(hamTC));
     System.out.println("The total cost for cheeseburgers: " + fmt1.format(cheeseTC));
     System.out.println("The total cost for french fries: " + fmt1.format(fryTC));
     System.out.println("The total cost for drinks: " + fmt1.format(shakeTC));
     System.out.println("The most money was spent on " + strHC);    
     System.out.println("The total cost for the meal: " + fmt1.format(tc));        
     System.out.println("The total number of items ordered: " + tq);            
     

     
    }

}
