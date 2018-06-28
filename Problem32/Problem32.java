import java.math.*;

public class Problem32
 {
    public static void main(String[] args)
     {
         System.out.print(range(12, 5));
         
     
     
     
     
     
     }
 
     public static BigInteger range(int x, int y)
      {
         int max = Math.max(x, y);
         int min = Math.min(x, y);
         
         BigInteger result = new BigInteger("1");
        
         for(int i = min ; i <= max; i++)
             {
                 BigInteger number = new BigInteger(i+"");
                 result = result.multiply(number);
             }
          
         return result;
      }
 
 
 
 
 
 
 }