public class Problem10
 {
    public static void main(String[] args)
     {
       String test = "AAAyyyyooooppprrtttttqqswq";
       System.out.println(indexOfFirstPair(test));
       String test2 = "banaaaana";
       
       boolean check = false;
       
       System.out.println(indexOfFirstPair(test2));
       String test3 = "cucuuuuuuuummbber";
       System.out.println(indexOfFirstPair(test3));
       String test4 = "mammamma";
       System.out.println(indexOfFirstPair(test4));

     
     }
    public static int indexOfFirstPair(String s)
     {
       int n = -1;
       boolean check = false;
       
       for(int i = 0; i < s.length()-2; i++)
        {
           if(i==0)   
            { 
              if(s.charAt(i) == s.charAt(i+1) && s.charAt(i+1) != s.charAt(i+2)&& check == false)
               {   
                   n = i;
                   check = true;
               }  
            }
           else if(i == s.length() - 2)
            {
               if(s.charAt(i) == s.charAt(i+1) && s.charAt(i) != s.charAt(i-1) && check == false)
                {
                  n = i;
                  check = true;
                }
            }
           else
            {
              if(s.charAt(i) != s.charAt(i-1) && s.charAt(i) == s.charAt(i+1) && s.charAt(i+1) != s.charAt(i+2) && check == false)
               { 
                 n = i;
                 check = true;
               }
            }
        }
     
     return n;
     
     }
 
 
 
 
 }