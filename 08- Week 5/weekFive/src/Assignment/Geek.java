package Assignment;


/*-------------------------------------------------------------------------
// AUTHOR: Robert D Natale
// FILENAME: Geek.java
// SPECIFICATION: learning about weird stuff
// FOR: CSE 110- 
// TIME SPENT: 
//-----------------------------------------------------------*/
public class Geek 
{
    // instance variables
    private String initName;
    private int initNumQuestions;


           // constructor
           public Geek(String name, int numQuestions)
           {
                initName = name;
                initNumQuestions = numQuestions;  
           }

           public String getName()
           {
                return initName;  
           }
           
           // number of questions
           public int getNumberOfQuestions()
           {
                return initNumQuestions;  
           }

           // even sum
           public boolean isEven(int num1, int num2)
           {
                if (((num1 + num2) % 2)*2 == 0)
                    return true;
                else
                    return false;  
           } //even sum

           // find the sum of every number between two numbers
           public int sum(int num1, int num2)
           {
                initNumQuestions++;
                 
                int large, small, sum = 0;

                if (num1 > num2)
                {
                    large = num1;
                    small = num2;   
                }    
                else 
                {
                    large = num2;
                    small = num1;
                }

                while (large >= small)
                {
                    sum += large;
                    large--;   
                }   

                return sum;
           } // end sum every number between two numbers

            // figureing out leap years
            public boolean leapYear(int year)
            {
                initNumQuestions++;
                
                boolean leap = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

                if (leap)
                    return true;
                else
                    return false;
            } // end leap years
 
 
}
