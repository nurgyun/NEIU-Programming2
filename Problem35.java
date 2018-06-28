public class Problem35
 {
   public static void main(String[] args)
    {
       String s = "Accelerated Depreciation";
       char c = 'e';
       
       System.out.print(atLeastThreeMatch(s, c));
    
    
    }
    public static boolean atLeastThreeMatch(String s1, char c)
    {
       boolean check = false;
       String n = "";
       String test = "";
       
       test = c + "";
       n = s1.replace(test, "");
       
       if(s1.length() - n.length()>=3)
         {
           check = true;
         }
       return check;
    }
 
 
 
 
 }