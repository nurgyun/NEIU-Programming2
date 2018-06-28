import java.util.*;
import java.io.*;

public class Problem24
 {
   
     public static void main(String[] args)
      {
        backAgain();    
      
      
      }  
     public static boolean backAgain()
     {        
         String test1 = "";
         
         String test2 = "";
         
         boolean check = true;
         
         System.out.print("Please enter a file name: ");
         Scanner kbd = new Scanner(System.in);
         String f = kbd.nextLine();
         
         try
         {
            Scanner input = new Scanner(new File(f));
            
            while(input.hasNextLine())
             {
                test1 = input.nextLine();
                System.out.println(test1);
                test2 = input.nextLine();
                System.out.println(test2);
                int n = test1.length();
                String t = test1;
                int j = 2;
                
                if(n%2==0)
                  check = false;
                else
                  {
                   
                     for(int i = 0; i < test1.length(); i++) 
                     {
                        t = t + test1.charAt(n-j);
                        j++;
                        if(j==test1.length()+1)
                         i = test1.length();
                     }
                  } 
                
                if(!(test2.equals(t)))
                 { 
                   check = false;
                   System.out.println(check);
                 }
                else
                 {  
                   System.out.println(check);  
                 }
             }
         }
         catch(FileNotFoundException fnf)
         {
            System.out.print("File was not found");
         }
     
     return check;
     }
    
    
    
   
 
 
 
 
 }