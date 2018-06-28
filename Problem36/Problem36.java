import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.util.*;

public class Problem36
 {
   public static void main(String[] args)
    {
     test(7, 11);
    } 
   public static void test(int n1, int n2)
    { 
       int count = 0;
       int entered = 0;
   
       
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
          entered++;
          if(n == n1)
           {
              count++;
           }
           else
           {  
             if(n == n2)
              count++;
          }
         if(count == 2)
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
         System.out.print("Not a number try again. ");
       }
     }
     while(check == false);
    
    System.out.println("You entered " + entered +" values before you entered both " + n1 + " and " + n2);
    
 
  }
 
 
 }