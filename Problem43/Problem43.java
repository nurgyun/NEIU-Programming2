import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.util.*;

public class Problem43
 {
   public static void main(String[] args)
    {
     ten();
    } 
   public static void ten()
    { 
       int max = 0;
       int min = 0;
       
       boolean check = false;
       boolean test = false;
       int n;
     
      do
      {
       Scanner kbd = new Scanner(System.in);
       System.out.print("Enter a number: ");
       
       try
       {
       
          n = kbd.nextInt();
          if(test == false)
           {
              max = n;
              min = n;
              test = true;
           }
           else
           {  
             if(n >max)
             max = n;
             if(n < min)
             min = n;
          }
         if(n == 10)
          {
            check = true;
          }
       
       }
       catch(NumberFormatException ime)
       {
         System.out.print("Not a number try again. ");
         
       }
       catch(InputMismatchException ime)
       {
         System.out.print("Not a number try again: ");
       }
     }
     while(check == false);
    
    System.out.println("The maximum value entered was: " + max);
    System.out.println("The minimum value entered was: " + min);
 
  }
 
 
 }