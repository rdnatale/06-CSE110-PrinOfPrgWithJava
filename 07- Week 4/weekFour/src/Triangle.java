
/*-------------------------------------------------------------------------
// AUTHOR: Robert D Natale
// FILENAME: Triangle.java
// SPECIFICATION: evaluate the sides of the triangle
// FOR: CSE 110- 
// TIME SPENT: 2 hours
//-----------------------------------------------------------*/
public class Triangle 
{
 
 // variables
 private int side1, side2, side3;
 
 public Triangle (int s1, int s2, int s3)
 {
  side1 = s1;
  side2 = s2;
  side3 = s3;
     
 } // end public Triangle
 
 private int largest()
 {
  return Math.max(side1, Math.max(side2, side3));   
 } // end largest
 
 private int shortest()
 {
  return Math.min(side1, Math.min(side2, side3));   
 } // end shortest
 
 public boolean is_equilateral()
 {
  if (largest() == shortest())
    return true;
  else
    return false;
 } // end equilateral
 
 public boolean is_isosceles()
 {
  if (side1 == side2 || side1 == side3 || side2 == side3)
   return true;
  else
   return false;
 } // end isoceles
 
 public boolean is_scalene()
 {
  if (side1 == side2 || side1 == side3 || side2 == side3)
    return false;
  else
    return true;
 } // end scalene
 
 public String toString()
 {  
  return "" + side1 + " " + side2 + " " + side3;  
 } // end string 
 
} // end public class Triangle
