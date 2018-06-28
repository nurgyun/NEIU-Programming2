import java.util.*;
import java.io.*;

public class Problem27
{
      public static void main(String [] args)
      {
       
         goingWhichWay();
      
      
      
      
      } 
     public static int goingWhichWay()
      {
 
      
       LinkedList<Integer> arr = new LinkedList<>();
       
        int  beg = 0;
        int  next = 0;
        int p = 0;
        int countI = 0;
        int countD = 0;
        int countN = 0;
        int result = 0;
                  
      try
      {    
         Scanner input = new Scanner(new File("data2.txt"));
       
         beg = input.nextInt();
         arr.add(beg);
         p++;
       while(input.hasNextLine())
        {
           next = input.nextInt();
           arr.add(beg);
           p++;
           
           if(next > beg)
             countI++;
           else if(next < beg)
             countD++;
           else
             countN++;
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
         if(countD == arr.size()-1)
            {
            System.out.println("Decreasing");
            result = 222;
            }
         else if(countI == arr.size()-1)
             {
            System.out.println("Increasing");
            result =  111;
             }
         else
            {
            System.out.println("Neither");
            result = 333;
            }
        return result;
        }
   
    
 
 }
