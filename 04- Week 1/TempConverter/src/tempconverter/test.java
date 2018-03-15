
public class test 
{

    public static void main(String[] args) 
    {
        
        final int a = 3, b = 10, c = 7;
        final double w = 12.9, y = 3.2, A1, B1, C1, D1, E1, F1, G1; 
                
                A1 = (double) a / b;
                B1 = (double) b / a;
                C1 = a - b / c;
                D1 = w / (int) y;
                E1 = y / w;
                F1 = b % c / a;
                G1 = b % a;
                
        System.out.println("A: " + A1);
        System.out.println("B: " + B1);
        System.out.println("C: " + C1);
        System.out.println("D: " + D1);
        System.out.println("E: " + E1);
        System.out.println("F: " + F1);
        System.out.println("G: " + G1);
       
    }

}
