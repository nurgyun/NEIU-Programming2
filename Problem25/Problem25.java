import java.util.Scanner;

public class Problem25
 {
    public static void main(String[] args)
     {
       
       check();
     
     
     }
     public static void check()
     {
     
          Scanner kbd = new Scanner(System.in);
          
          char one = '\0';
          Character two = '\0';
          Character tree = '\0';
         
          System.out.print("Enter a letter: ");
          one = kbd.next().charAt(0);
          System.out.print("Another letter: ");
          two = kbd.next().charAt(0);
          System.out.print("One more, please: ");
          tree = kbd.next().charAt(0);
          System.out.println();
     
          if(one == 'a' && two == 'a' && tree == 'a')
            {
               System.out.print("Result = aaa");
            
            }
          else if(one == 'a' && two == 'b' && tree == 'c')
            {
               System.out.print("Result = abcabcabc");
            
            }
          else
            {
               System.out.print("Result = " + one+two+tree);
            
            }
     
     }
 
 
 
 
 }