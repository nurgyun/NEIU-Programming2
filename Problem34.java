public class Problem34
 {
   public static void main(String[] args)
    {
       String one = "3 8 5 2 7 9";
       String two = "5,1,22,7,2,15,3";
       
       System.out.print(largestInCommon(one, two));
    
    
    
    
    }
    public static int largestInCommon(String s1, String s2)
    {
       String[] A = s1.split(" ");
       String[] B = s2.split("[,]");
       //single loop String method
       // for first time you do it you can use at most one nested loop the second time you do one single loop
       int count = 0;
          int largest = 0;
          int value = -1;
          int numberA = 0;
          int numberB = 0;
          
          for (int i = 0; i < A.length; i++)
              {
                for (int j = 0; j < B.length; j++)
                {
                   
                   numberA = Integer.parseInt(A[i]);
                   numberB = Integer.parseInt(B[j]);
                   if (numberA==numberB)
                      {
                      if (numberA > largest) 
                      largest = numberA;
                      value = largest;
                      }
                 }
              }
        
        return value;

       
    
     }
    
    }
 
 
