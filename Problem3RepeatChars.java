public class Problem3RepeatChars
 {
     public static void main(String[] args)
      {
      
         String freq = "3152";
         String text = "mskp";
         System.out.print(repeatChars(freq, text));
      
      }
     
     public static String repeatChars(String freq, String text)
      {
         String answ = "";
         int sum = 0;
         int result = 0;
         
         int n = Integer.parseInt(freq);
         int p = 0;
         int t = 0;
         
         for(int i = 0; i < freq.length(); i++)
          {
             t = Integer.parseInt(freq.charAt(p)+""); 
             
             for(int j = 0; j < t; j++)
              {
                answ = answ + text.charAt(i);
              }
             p++;
          }
      
      return answ;
      }
 
 
 
 
 
 }