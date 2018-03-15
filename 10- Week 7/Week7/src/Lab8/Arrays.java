
/*-------------------------------------------------------------------------
// AUTHOR: Robert D Natale
// FILENAME: Arrays.java
// SPECIFICATION: sorting arrays finding maxs mins avgs
// FOR: CSE 110- 
// TIME SPENT: unknown
//-----------------------------------------------------------*/
import java.util.Random;

public class Arrays
{
    // Instance Variables
    private int count;
    private int[] array;    

    // Constructors
    public Arrays(int size)
    {
        array = new int[size];
        count = size;

        Random rand = new Random();
        for (int i = 0; i < count; i++) 
        {
            array[i] = (rand.nextInt(10));
        }
    } 

    public Arrays(int[] arr)
    {
        array = arr;
        count = array.length;
    }

    // findMin  
    public int findMin() 
    {
        int min = array[0]; // Set min to the first element
     
        for (int i = 0; i < count; i++) 
        {
           // Reassign min if there is a smaller element
           if (array[i] < min) 
           {
               min = array[i];
           }
        }
        return min; // Return the smallest element
    }
    
    // findMax
    public int findMax()
    {
        int max = array[0]; // Set max to the first element
        
        for (int i = 0; i < count; i++)
        {
          // Reassign max if there is a larger element
          if (array[i] > max)
          {
              max = array[i];
          }
        }
        return max; // Return the largest element
    }
    
    // calcSum
    private int calcSum()
    {
        int sum = 0;
        
        for (int i = 0; i < count; i++)
        {
            sum += array[i];                        
        }
        return sum;
    } // Return the sum
    
    // calcAverage
    public double calcAverage()
    {
        double average = calcSum() / count;        
        return average;
    } // Return average
    // toString
    public String toString() 
    {
        String output = "[ ";

        for (int i = 0; i < count; i++) 
        {
            output += array[i];

            if (i != count - 1) 
            {
                output += ", ";
            }
        }
        return output + " ]";
    } // return output
} // end class

