public class Problem17
 {
   public static void main(String[] args)
    {
      System.out.print(createAcronym("North", "Eastern", "Illinois", "University"));
    
    
    }
    public static String createAcronym(String s1, String s2, String s3, String s4)
    {
       String result = s1.charAt(0) +"" + s2.charAt(0)+"" + s3.charAt(0)+"" + s4.charAt(0)+"";
       return result;
    
    }
 
 
 
 }