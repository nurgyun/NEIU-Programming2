import java.util.Scanner;
import java.io.*;

public class Problem46
 {
    public static void main(String[] args)
     {
     
        display();
     
     
     
     }
     
     public static void display()
      {
         char one = '\0';
         
         char two = '\0';
         char tree = '\0';
         boolean check = true;
         
         int count = 0;
         
         try
         {
            Scanner kbd = new Scanner(new File("data1.txt"));
           do
           { 
            try
            {
                one = kbd.next().charAt(0);
                System.out.println("Program read a letter: " + one);
                two = kbd.next().charAt(0);
                System.out.println("Program read a letter: " + two);
                tree = kbd.next().charAt(0);
                System.out.println("Program read a letter: " + tree);
                if (one == two && two == tree)
                  check = false;
                else
                {
                  one = two;
                  two = tree;
                  tree = kbd.next().charAt(0);
                  System.out.println("Program read a letter: " + tree);
                }
            }
            catch(NumberFormatException nfe)
             {
               System.out.print("Not a letter");
             }
          
           }while(check);
         }
         catch(FileNotFoundException fnf)
         {
             System.out.print("File is not there");
         }
         
       System.out.print("Same entered 3 in a row");
      
      }
 
 
 
 
 
 
 }