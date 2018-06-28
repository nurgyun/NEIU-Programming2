import java.math.*;
public class Problem28
 {
   public static void main(String[] args)
    {
      int [] arr = {12, 34, 9, 4, 34, 14, 19};
     int n = 5;
      
     System.out.println(test(arr, n));
      
     // int [] arr = {1234,99090978, 90987970, 456, 398764876, 14109723, 19098543};
    //  int n = 5067765;
      
    //  System.out.print(test(arr, n));

      
      
    }
    
    public static BigInteger test(int arr[], int n)
     {
        BigInteger result = new BigInteger("1");
        BigInteger m = new BigInteger("0");
        
        for(int i = 0; i < arr.length; i++)
         {
            BigInteger q = new BigInteger(arr[i] + "");
            BigInteger t = new BigInteger(n+"");
            m = q.multiply(t);
            result = result.multiply(m); 
         }
     
     
       return result;
     
     }
 
 
 
 }