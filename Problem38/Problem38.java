import java.util.*;
import java.io.*;

public class Problem38
{
      public static void main(String [] args)
      {
       
         System.out.print(odd());
      
      
      
      
      } 
     public static int odd()
      {
 
        int sum = 0;
        int next = 0;
                  
      try
      {    
         Scanner input = new Scanner(new File("data.txt"));
       
         
       while(input.hasNextLine())
        {
           next = input.nextInt();
           sum = sum + next;
        }
      }     
     catch(FileNotFoundException e)
      {
        System.out.print("File not there");
      }
     catch(NumberFormatException fef)
       {
          System.out.print("Invalid'data'type");
       }                 

      return sum;
     }
   
    
 
 }
