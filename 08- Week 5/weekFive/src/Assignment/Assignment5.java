package Assignment;


/*-------------------------------------------------------------------------
// AUTHOR: Robert D Natale
// FILENAME: Assignment.java
// SPECIFICATION: playing nerd
// FOR: CSE 110- 
// TIME SPENT: a couple hours in total 
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Assignment5 {

	public static void main (String[] args) {

		Scanner console = new Scanner (System.in);

		String choice;
		char command;


		// print the menu
		printMenu();
		
		// create new Geek object
		Geek myGeek = new Geek("Geek", 0);

		do
		{
			// ask a user to choose a command
			System.out.println("\nPlease enter a command or type ?");
			choice = console.next().toLowerCase();
			command = choice.charAt(0);

			switch (command)
			{
				case 'a':
					//prints the Geek's name
					System.out.println("Name:" + myGeek.getName());                                          
					break;
				case 'b': // prints the number of quesitons
					System.out.println("Number of questions: " + 
					myGeek.getNumberOfQuestions());
					break;
				case 'c': // Asks about even numbers 
					System.out.print("Please enter first integer: ");
                                        int eNum1 = console.nextInt();
                                        System.out.print("Please enter second integer: ");
                                        int eNum2 = console.nextInt();
                                        if (myGeek.isEven(eNum1, eNum2))
                                            System.out.print("Your sum is even");
                                        else 
                                            System.out.print("Your sum is uneven");
					break;
				case 'd': // Summing up some numbers
					System.out.print("Let's find the sum of every number between two numbers. Shall we?\n"
                                                       + "Enter your first integer: ");
                                        int sNum1 = console.nextInt();
                                        System.out.print("And your next? ");
                                        int sNum2 = console.nextInt();
                                        int sum = myGeek.sum(sNum1, sNum2);
                                        System.out.print("Your sum is: " + sum);
					break;
				case 'e': // leaping years
					System.out.print("Wanna know if it was a leap year?\n"
                                                       + "Go ahead and ask me a year: ");
                                        int year = console.nextInt();
                                        if (myGeek.leapYear(year))
                                            System.out.println("Your year is a leap year!");
                                        else
                                            System.out.println("Not a leap year!");
					break;
				case '?':
					printMenu();
					break;
				case 'q':
					break;

				default:
					System.out.println("Invalid input");

			}

		} while (command != 'q');

	}  //end of the main method


	public static void printMenu()
	{
		System.out.print("\nCommand Options\n"
			+ "-----------------------------------\n"
			+ "a: get name\n"
			+ "b: number of questions asked\n"
			+ "c: sum is even\n"
			+ "d: sum between two integers\n"
			+ "e: leap year\n"
			+ "?: display the menu again\n"
			+ "q: quit this program\n\n");

	} // end of the printMenu method

}  // end Assignment5 class