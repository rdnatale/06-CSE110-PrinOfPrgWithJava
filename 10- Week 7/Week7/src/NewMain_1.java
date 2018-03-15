
/*-------------------------------------------------------------------------
// AUTHOR: Robert D Natale
// FILENAME: 
// SPECIFICATION: 
// FOR: CSE 110- 
// TIME SPENT: 
//-----------------------------------------------------------*/
import java.util.Scanner;

public class NewMain_1 
{

    public static void main(String[] args) 
  {
     final int MAX_CAPACITY = 100;
    java.util.Random ranNum = new java.util.Random();
    int[] x = new int[MAX_CAPACITY];

    for(int j = 0; j < x.length; j++ )
    {
    x[j] = Math.abs( ranNum.nextInt( ) % MAX_CAPACITY + 1 );
    }
    Scanner scan = new Scanner(System.in);
    System.out.print( "Enter number to search for: " );
    int searchInt = scan.nextInt( );
    // complete


    boolean found = false;
    for(int i = 99; i > -1;i--)
    {
      if (x[i] == searchInt)
        found = true; 
    }

    if (found = true)
        System.out.println("found");
    if (found = false)
        System.out.println("not here");

}
