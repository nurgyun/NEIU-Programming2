public class Problem16
 {
   public static void main(String[] args)
    {
      countVCD("JTuireoqw4ptyqss4");
      System.out.println();
      countVCD("JTuireoqw4ptyqss4");
      
    
    
    }
    public static void countVCD(String s1)
     {
       String vowels = s1.replaceAll("[^aouieAOUIE]", "");
       int vCount = vowels.length();
       
       String consonants = s1.replaceAll("[aouieAOUIE0-9]", "");
       int cCount = consonants.length();

       String digits = s1.replaceAll("[^0-9]", "");
       int numberCount = digits.length();
       
       System.out.println("Number of vowels: " + vCount);
       System.out.println("Number of consonants: " + cCount);
       System.out.println("Number of digits: " + numberCount);
       
       
     
     
     }
 
 
 
 }