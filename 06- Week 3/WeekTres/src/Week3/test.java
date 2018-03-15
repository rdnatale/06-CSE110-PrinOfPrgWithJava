
/*-------------------------------------------------------------------------
// AUTHOR: Robert D Natale
// FILENAME: 
// SPECIFICATION: 
// FOR: CSE 110- 
// TIME SPENT: 
//-----------------------------------------------------------*/


import java.util.Scanner; 

public class Exam1 
{

    public static void main(String[] args) 
    {
               
        // finals
        final double TESTWEIGHT = 0.6, PROGWEIGHT = 0.4;
        
        // variables
        double testInput, testTotal = 0, testQuan = 0, testAvg;
        double progInput, progTotal = 0, progQuan = 0, progAvg;
        double grade;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Please enter the test grade or type 0: ");
        testInput = scan.nextDouble();
        
        while (testInput > 0) // test input
        {
         if (testInput > 0)
             testQuan++;
         
         if (testInput > 0)
             testTotal += testInput;
               
         testInput = scan.nextDouble(); 
        } // end test loop
        testAvg = testTotal / testQuan;
        
        System.out.println("Please enter the program grade or type 0: ");
        progInput = scan.nextDouble();
        
        while (progInput > 0) // prog input
        {
         if (progInput > 0)
             progQuan++;
         
         if (progInput > 0)
             progTotal += progInput;
               
         progInput = scan.nextDouble(); 
        } // end prog loop
        progAvg = progTotal / progQuan;
        
        grade = (progAvg * PROGWEIGHT) + (testAvg * TESTWEIGHT);
        
        System.out.println("Test Average is: " + testAvg);
        System.out.println("Program Average is: " + progAvg);
        System.out.println("Grade is: " + grade);
        
    } // end main  

} // end class test
