
/*-------------------------------------------------------------------------
// AUTHOR: Robert D Natale
// FILENAME: Door.java  
// SPECIFICATION: Work on classes and creating methods  
// FOR: CSE 110- Week 4
// TIME SPENT: 
//-----------------------------------------------------------*/
public class Door 
{
    // variables
     private String name;
     private String state;
     
   // constructor  
   public Door (String newName, String newState) 
   {
    name = newName;
    state = newState;
    
   }
   // State
   //accesor
   public String getState() 
   {
    return state;
    
   }
   
   // mutator 
   public void setState(String newState) 
   {
    state = newState;
   } 
   
   //Name
   //accesor
   public String getName() 
   {
    return name;
    
   }
   
   // mutator 
   public void setName(String newName) 
   {
    state = newName;
   }
   
   
   public void open() 
   {
    state = "open";
   }
   
   public void closed() 
   {
    state = "closed";
   }
}
