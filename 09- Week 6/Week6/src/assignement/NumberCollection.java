
/*-------------------------------------------------------------------------
// AUTHOR: Robert D Natale
// FILENAME: NumberCollection.java
// SPECIFICATION: building arrays
// FOR: CSE 110- 
// TIME SPENT: 1.5 hours
//-----------------------------------------------------------*/
import java.util.Arrays;

public class NumberCollection 
{
 // instance variables
 private int[] numberArray;
 private int count;
 
 // Constructor of array
 public NumberCollection(int arraySize)
 {
     numberArray = new int[arraySize];
     count = 0;
 }
 
 private int indexOf(int searchingNum)
 {
     int i = 0, r;
     do
     {
         if (numberArray[i] == searchingNum)
             r = numberArray[i];
         else
            r = -1; //number does not exist yet
         i++;     
     } while (i < count);
     return r;  
 }
 
 // adding numbers
 public boolean addNumber(int numberToAdd)
 {
    int[] newNumberArray;
    
    if (this.indexOf(numberToAdd) != -1) //number does not exist yet
        return false;
    
    if (count == numberArray.length) //length check
    {
        newNumberArray = Arrays.copyOf(numberArray, 2 * numberArray.length);
        numberArray = newNumberArray;
    }  
    
    numberArray[count] = numberToAdd;
    count++;
    return true;
 } // end add number
 
 // finding the max
 public int findMax()
 {
     int max = 0;
     
     for (int i = 0; i < count; i++)
     {    if (numberArray[i] > max)
             max = numberArray[i];
     }
     return max;
 } // end max
 
 // finding the min
 public int findMin()
 {
     int min = 0;
     
     for (int i = 0; i < count; i++)
     {    
         if (min == 0)
             min = numberArray[i];
         
         if (numberArray[i] < min)
             min = numberArray[i];
     }
     return min;
 } // end min
 
 // compute sum 
 public int computeSum()
 {
     int sum = 0;
     
     if (count == 0)
         return 0;
     else 
        for (int i = 0; i < count; i++)
        {
            sum += numberArray[i];         
        }
            return sum;
 }// end sum
 
 // make the string
 public String toString()
 {
    String result = "{";
        for(int i=0;i < count ; i++)
        {   
            if(i >0 )
                result += ", " ;
                result += numberArray[i];
        }
            return result += "}";  
 }// end string  

} // end class
