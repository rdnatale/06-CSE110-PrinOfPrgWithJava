
/*-------------------------------------------------------------------------
// AUTHOR: Robert D Natale
// FILENAME: 
// SPECIFICATION: 
// FOR: CSE 110- 
// TIME SPENT: 
//-----------------------------------------------------------*/
import java.util.Scanner;


public class asstest 
{

    public static void main(String[] args) 
    {
     int i;
        
     Scanner in = new Scanner (System.in);
     System.out.println("Enter something: ");
     String str = in.nextLine();
    
     for (i = str.length() - 1; i != -1; i--)
    {
        char ch = str.charAt(i);
        System.out.print(ch);
    }
     
    
     
    }
        
 }


