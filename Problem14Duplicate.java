public class Problem14Duplicate
 {
  public static void main(String[] args)
   {
      String str = "MMrrrttttyypppqqqqtress";
      char test1 = displayDublicate(str);
      System.out.print(test1);
      //still working on it
   
   
   }
  public static char displayDublicate(String s)
   {
     String ss = "";
     String answer = ""; 
     char test = '1';
     for(int i = 0; i < s.length(); i++)
      {
        char r = s.charAt(i);
        String e = r + "";
        ss = s.replace(e, "");
        if (ss.length() < s.length()-1)
        return r;
      
      }
   return test;
   
   }
 
 }