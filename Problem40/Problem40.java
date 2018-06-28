public class Problem40
 {
    public static void main(String[] args)
     {
       String x = "EQAFGOCCUUMM";
       String y = "BZBUUHHOAEAEPA";
       System.out.println(vowelConsonant(x, y));
     
       String x1 = "RTYUWOPRTYOAA";
       String y1 = "WQLPDSTTMNB";
       System.out.print(vowelConsonant(x1, y1));

      
     }
    
    public static String vowelConsonant(String s1, String s2)
     {
         String result1 = s1.replaceAll("[^AOEIU]", "");
         String result2 = s2.replaceAll("[AOEIU]", "");
     
     
         return result1+result2;
     
     
     }
 
 
 
 
 
 }