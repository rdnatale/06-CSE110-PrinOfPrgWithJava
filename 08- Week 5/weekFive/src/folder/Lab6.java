package folder;


/*-------------------------------------------------------------------------
// AUTHOR: Robert D Natale
// FILENAME: Lab6.java
// SPECIFICATION: Keeping track of super people
// FOR: CSE 110- 
// TIME SPENT: too long
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab6 
{

    public static void main(String[] args) 
    {
     // Create a Scanner object for later use
     Scanner scan = new Scanner(System.in);
     // Create a superhero called Spider-Man
     System.out.println("Creating Spider-Man.......");
     SuperHero spiderman = new SuperHero("Spider-Man");
     
     // Ask the user to enter a superhero name
     System.out.println("\nWhat is the name of your superhero?");
     String heroName = scan.nextLine(); // This is line 10
     System.out.println("What is his secret identity?");
     String secretIdentity = scan.nextLine();
     System.out.println("Creating your super hero.......");
     
     /** 16: Create the hero called yourHero, who saved 10 people */
     SuperHero yourHero = new SuperHero(heroName, secretIdentity, 10);  
     System.out.println("\nSpider-Man just saved 100 lives!");
     spiderman.recordSave(100);
     System.out.println("Oops, Spider-Man was shot dead twice!");
     spiderman.killHero();
     spiderman.killHero();
     System.out.print("\nYour hero saved a kidnapped kid ");
     System.out.println("but was shot once");
     yourHero.killHero();
     yourHero.recordSave();
     System.out.println("\n---- Superhero information ----");
     
     int numHeroes = SuperHero.getNumberOfHeroes();     
     System.out.println("There are " + numHeroes + " known superheroes.");
     spiderman.printSuperHeroRecord();
     System.out.println();
      
     yourHero.printSuperHeroRecord();
     System.out.println();
    }

}
