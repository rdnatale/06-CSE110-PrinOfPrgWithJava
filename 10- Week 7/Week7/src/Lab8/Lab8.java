
/*-------------------------------------------------------------------------
// AUTHOR: Robert D Natale
// FILENAME: Lab8.java
// SPECIFICATION: display array data
// FOR: CSE 110- 
// TIME SPENT: unknown
//-----------------------------------------------------------*/
public class Lab8 
{

    public static void main(String[] args) 
    {
        // Create an Arrays object using the first constructor
        Arrays arr1 = new Arrays(5);
        // Print the contents of the array in arr1
        System.out.println(arr1);
        // Call findMin, findMax, and calcAverage on arr1 and print their values
        System.out.println("Min: " + arr1.findMin());
        System.out.println("Max: " + arr1.findMax());
        System.out.println("Average: " + arr1.calcAverage());
        System.out.println();
        
        // Second array
        // Create arr2
        
        int[] a = {1, 2, 3};
        Arrays arr2 = new Arrays(a);
        // Print the contents of the array in arr2
        System.out.println(arr2);
        // min, max, avg on arr2
        System.out.println("Min: " + arr2.findMin());
        System.out.println("Max: " + arr2.findMax());
        System.out.println("Average: " + arr2.calcAverage());
        System.out.println();
    }

}
