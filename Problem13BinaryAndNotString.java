/* Write a Java method that takes a String. The String contains numbers from 0 to 2.
The numbers in the String are separated by comma and space.
The method should return a String where all zeros are folowed by 1s and all 1s are folowed by 2s. 
One loop is permited hovewer the problem can be solved without using a loop.
*/

public class Problem13BinaryAndNotString
 {
    public static void main(String[] args)
    {
        System.out.println(orderString("1, 2, 0, 1, 2, 1, 0"));
    

    } 
    public static String orderString(String s)
    {
          String answ = "";
        
           answ = s.replace("[,\\s]", "");
           String[] r = s.split(", ");
          
         
         
          for(int i = 0; i < r.length; i++)
          {
              answ = answ + r[i]; 
          }
         
         String arr0 = "";
         String arr1 = "";
         String arr2 = "";
         
         arr0 = answ.replaceAll("[^0]", "");
         arr1 = answ.replaceAll("[^1]", "");
         arr2 = answ.replaceAll("[^2]", "");
         
         return arr0+arr1+arr2;
    
    }
 
 
 
 }