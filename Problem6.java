import java.math.*;
import java.util.*;
public class Problem6
 {
    public static void main(String[] args)
     {
        Scanner kbd = new Scanner(System.in);
        BigInteger two = new BigInteger("2");
        BigInteger zero = new BigInteger("0");
        BigInteger result = new BigInteger("0");
        int countO = 0;
        
        
        System.out.print("Enter BigInteger a: ");
        String a = kbd.next();
        BigInteger a1 = new BigInteger(a);
        result = a1.mod(two);
        
        if(!(result.equals(zero)))
         countO++;
        
        System.out.print("Enter BigInteger b: ");
        String b = kbd.next();
        BigInteger b1 = new BigInteger(b);
        result = b1.mod(two);
        
        if(!(result.equals(zero)))
         countO++;
          
        System.out.print("Enter BigIneteger c: ");
        String c = kbd.next();
        BigInteger c1 = new BigInteger(b);
        result = c1.mod(two);
        
        if(!(result.equals(zero)))
         countO++;
        
        System.out.println();
        
        if(countO ==3)
          System.out.print("Three integers were odd");
          
        else if(countO == 2)
          System.out.print("Two integers were odd");
          
        else if(countO == 1)
          System.out.print("One integer was odd");
        
        else 
          System.out.print("No integers were odd");
     
     }
     
     
 
 
 
 }
  