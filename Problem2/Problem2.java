import java.math.*;

public class Problem2
 {
    public static void main(String[] args)
     {
        double[][] t = {{5.1, 10.2, 1.8, 5.4},
                        {1.0, 2.1, 1.3, 15.4},
                        {8.8, 7.6, 5.4, 3.2},
                        {6.1, 1.2, 12.3, 1.1}};
      
      System.out.println(indexOfHighestProduct(t));
       int [][] r = {{551156, 102278, 1088, 5004},
                        {1000, 2100, 1333, 15415},
                        {888789, 7896, 54984, 32123},
                        {6111, 1962, 12783, 11789}};
      
      System.out.println(indexOfHighestProduct(r));
     
      int[][] tt = {{5, 1, 1, 5, 5, 1, 1, 5, 5},
                   {8, 2, 4, 6, 7, 8, 1, 7, 4},
                   {4, 7, 4, 6, 3, 0, 1, 7, 4},
                   {1, 2, 5, 6, 7, 8, 9, 7, 1},
                   {6, 1, 1, 2, 1, 2, 3, 1, 1}};

    
     System.out.println(sum(tt));
    
     }
    public static int indexOfHighestProduct(double [][] d)
     {
         int result = -1; 
         double product = 1;
         double max = -1;
         
         for(int i = 0; i < d.length; i++)
          {
             product = 1;
             for(int j = 0; j < d[i].length; j++)
              {
                product = product * d[i][j];
              
              
              }
             if(i == 0)
               max = product;
             else
               {
                  if(product > max)
                    max = product;
                    result = i;
               }
          }
      return result;
      
     }
     
     public static int indexOfHighestProduct(int [][] d)
      {
         BigInteger number = new BigInteger("0");
         BigInteger product = new BigInteger("1");
         BigInteger max = new BigInteger("0");
         int result = -1;
         
         
         for(int i = 0; i < d.length; i++)
          {
             product= new BigInteger("1");
             for(int j = 0; j < d[i].length; j++)
              {
                number = new BigInteger(d[i][j]+ ""); 
                product = product.multiply(number);
              }

             if(i == 0)
               max = product;
             else
               {
                  if((product.compareTo(max)) == 1)
                   {
                    max = product;
                    result = i;
                   }
               }
      
          }
      return result;
      }
     public static BigInteger sum(int [][] d)
        {
           BigInteger result = new BigInteger("0");
           BigInteger number = new BigInteger("0");
           String s = "";
           for(int i = 0; i < d.length; i++)
            {
               s = "";
               number = new BigInteger("0");
               for(int j = 0; j < d[i].length; j++)
                {
                    s = s + d[i][j];
                
                }
              
               number = new BigInteger(s);
               result = result.add(number);
            }
        
        
        
        return result;
        
        }
 
 }