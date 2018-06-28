public class Problem11
 {
    public static void main(String[] args)
     {
       String test1 = "apple";
       String test2 = "elppa";
       System.out.println(areTheyReversed(test1, test2));
      
       
       String test11 = "map";
       String test22 = "mapp";
       System.out.println(areTheyReversed(test11, test22));
     
     }
    public static boolean areTheyReversed(String s1, String s2)
     {
       boolean check = true;
       int n = s2.length()-1;
       
       if(s1.length() != s2.length())
         check = false;
       else
       {  
           for(int i = 0; i < s1.length(); i++)
            {
               if(s1.charAt(i) != s2.charAt(n))
                {
                 check = false;
                }
            
              n--;
            }
       }
    
    return check;
    }
    
    
 }