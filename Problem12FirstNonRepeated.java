public class Problem12FirstNonRepeated
 {
   public static void main(String[] args)
    {
       String s = "abbreviation";
       String st = "";
       // need to fix the code???
       
       char test = nonRepeated(s);
       System.out.print(test);
       
     
   }
    public static char nonRepeated(String s)
     {  
       String st = "";
       String replace = "";
       boolean check = false;
       char result = ' ';
       for(int i = 0; i < s.length(); i++)
        {
          st = s.charAt(i) + "";
          replace = s.replaceAll(st, "");
          if((replace.length() == s.length()-1) && check == false)
              {
                 result = s.charAt(i);
                 check = true;
              }
        } 
     return result;
    }
 
 
 
 }