import java.math.*;
import java.util.*;
public class Problem7
 {
    public static void main(String[] args)
     {
        Scanner kbd = new Scanner(System.in);
        BigInteger result = new BigInteger("1");
        
        System.out.print("Enter BigInteger a: ");
        String a = kbd.next();
        BigInteger a1 = new BigInteger(a);
        
        System.out.print("Enter int b: ");
        int b = kbd.nextInt();
        

        
        for(int i = 1; i <= b; i++)
         {
           result = result.multiply(a1);
         }

    System.out.print(a1 + " to the power " + b + " is " + result);
    
    }       

 }