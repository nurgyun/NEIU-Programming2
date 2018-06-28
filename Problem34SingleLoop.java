public class Problem34SingleLoop
 {
   public static void main(String[] args)
    {
       String one = "3 8 5 2 7 9";
       String two = "5,1,22,7,2,15,3";
       
       System.out.print(largestInCommon(one, two));
    
    
    
    
    }
    public static int largestInCommon(String s1, String s2)
    {
          int max = -1;
          
          for (int i = 0; i < s1.length(); i++)
              {
                  if(s2.contains(s1.charAt(i)+""))
                    {
                      int n = Integer.parseInt(s1.charAt(i)+"");
                      if(n > max)
                       max = n;
                    }
              
              
              }
                         
                         
                return max;

       
    
     }
    
    }
 
 
