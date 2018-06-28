public class Problem19
 {
    public static void main(String[] args)
     {
     
    System.out.println(longestSub("abXYab"));
     System.out.println(longestSub("Nura"));
     System.out.println(longestSub("XXtXX"));
     System.out.println(longestSub("qqqTUYTxxyyqqq"));


     
     }
     public static String longestSub(String s)
      {
         
         
         int n = s.length()/2;
         int end = s.length();
         
         String sub1 = "";
         String sub2 = "";
         String result = null;
         int max = 0; 
         
         if(s.length()%2==0)
         {      
         for(int i = 0; i < s.length()/2; i++)
          {
              sub1 = s.substring(0,n-i);
              sub2 = s.substring(n+i,end );
              
              if(sub1.equals(sub2))
               {
                 return sub1;
               }
           }
          }
          else
          {
             for(int i = 0; i < s.length()/2; i++)
          {
              sub1 = s.substring(0,n-i);
              sub2 = s.substring(n+1+i,end );   // we need this change(+1) if the size is ODD.
              
              if(sub1.equals(sub2))
               {
                 return sub1;
               }
           }
          }
          
          
      return result;
      }
 }