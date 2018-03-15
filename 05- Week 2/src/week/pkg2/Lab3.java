
/*-------------------------------------------------------------------------
// AUTHOR: Robert D Natale
// FILENAME: Lab3.java
// SPECIFICATION: A program to compare your moods.
// FOR: CSE 110- 
// TIME SPENT: 30 mins
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab3 
{

    public static void main(String[] args) 
    {
        // define strings & vars
        String feel1, feel2;
        int feel1L, feel2L;
        
        // input
        Scanner in = new Scanner(System.in);
        System.out.print("Tell me your mood: ");
        feel1 = in.nextLine();
        System.out.print("What was your mood yesterday: ");
        feel2 = in.nextLine();
        
        // compare strings
        if (feel1.equals(feel2))
        {
            System.out.println("Your moods have not changed.");
        }
        else
        {
            System.out.println("Your moods are different. Hopefully you're happier!");
        }
        
        // compare lengths
        feel1L = feel1.length();
        feel2L = feel2.length();
        
        if (feel1L == feel2L)
        {
            System.out.println("Despite your mood you describe it with the same characters... weird");
        }
        else if (feel1L > feel2L)
        {
            System.out.println("You had more to say about yesterday than today.");
        }
        if (feel1L < feel2L)
        {
            System.out.println("You're feelings are getting more complicated. Call a shrink.");
        }
    }   

}
