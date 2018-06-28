import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.util.*;

public class Problem44
{
   public static void main(String[] args)
   {
       test();
    } 
   public static void test()
    { 
       double product = 1;
       
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
          if(n>0)
           {
              check = true;
              for(int i = 1; i <=n; i++)
               {
                 product = product * i;
               
               }
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
 
    System.out.print(product);
   
   
   }
}