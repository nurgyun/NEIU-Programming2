public class Problem15
 {
    public static void main(String[] args)
     {
       System.out.print(makeChanges("Java is fun", "Java"));
     
     }
     public static String makeChanges(String s1, String s2)
      {
         String result = s1.replace(s2, "");
         return result;
      }
 
 
   
 }