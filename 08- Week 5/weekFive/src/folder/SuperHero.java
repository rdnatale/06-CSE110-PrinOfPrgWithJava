package folder;


/*-------------------------------------------------------------------------
// AUTHOR: Robert D Natale
// FILENAME: SuperHero.java
// SPECIFICATION: SuperHero class
// FOR: CSE 110- 
// TIME SPENT: not long
//-----------------------------------------------------------*/
public class SuperHero 
{
    // instance variables go below here    
    private static int numberOfHeroes;
    private int numberOfLifeChances;
    private int numberOfPeopleSaved;  
    String heroName;
    String secretIdentity;   
    
    // the two constructors go below here
    public SuperHero(String initHeroName, String initSecretIdentity, int initPeopleSaved) 
    {
     numberOfHeroes++; // one more hero created
     numberOfLifeChances = 2; // start the hero with two lives
     heroName = initHeroName;
     secretIdentity = initSecretIdentity;
     numberOfPeopleSaved = initPeopleSaved;
     
    }
    
    public SuperHero(String heroName)
    {
     numberOfHeroes++; // one more hero created
     numberOfLifeChances = 2; // start the hero with two lives
     heroName = this.heroName; //!!!! not sure of this!!!!
     secretIdentity = "unknown";
     numberOfPeopleSaved = 0;
     
    }
    
    // getNumberOfHeroes() goes below here
    public static int getNumberOfHeroes() 
    {
     return numberOfHeroes;
     
    }
    
    // recordSave() goes below here
    public void recordSave() 
    {
     numberOfPeopleSaved++;
     
    }
    
    // the second recordSave method goes here
    public void recordSave(int num) 
    {
     numberOfPeopleSaved += num;   
        
    }
    
    // killHero() goes below here
    public void killHero() 
    {
     if (numberOfLifeChances >= 0) 
     {
     numberOfLifeChances--;
     } 
     
     else 
     {
      System.out.println("You're dude is muerto... Sorry for the lose... Really");
     }
    }
    
    // printSuperHeroRecord() goes below here
    public void printSuperHeroRecord()
    {
     System.out.println("Name: " + heroName);
     System.out.println("Super-Secret Identity: " + secretIdentity);
     
     if (numberOfLifeChances > 0)
     {
      System.out.println("Your guys is alive!");          
     }
     else
     {
      System.out.println("Your dude is done!");
     }
     System.out.println("People Saved: " + numberOfPeopleSaved);
    }
    
}