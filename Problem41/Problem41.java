import java.util.Scanner;
import java.io.*;


public class Problem41
{
    public static void main(String[] args)
     {
        
         maxMin();
   
   
   
    }
    public static void maxMin()
     {
       String str = "";
       boolean check = true;
       int n;
       int max = 0;
       int min = 0;
       
       try
       { 
        
        Scanner input = new Scanner(new File("data.txt"));
        
        while(input.hasNextInt())
         {
              n = input.nextInt();
            //  n = Integer.parseInt(str);
              
              if(check)
               {
                 max = n;
                 min = n;
                 check = false;
               
               }
              
              else
               {
                  n = input.nextInt();
                  if(n > max)
                    max = n;
                  else if(n < min)
                    min = n;
               }
         }
     
     System.out.print("The MAX value is: " + max);
     System.out.print("The MIN value is: " + min);
     }
     catch(FileNotFoundException fnf)
      {
         System.out.print("File was not there");
        
      }
   }

}