public class Problem21
 {
   public static void main(String[] args)
    {



   }
   public static int sum(String s1)
   {
       String result = s1.replace("[^0-9]", "");
       int number= Integer.parseInt(result);
       int sumSum = 0;
       int modd = 0;
       int inter = 0;
       while(number > 9)
        {
          modd = number%10;
          sumSum = sumSum + modd; 
          number = number/10;
          modd = number;
        }
       sumSum = sumSum + number;
      
       return sumSum;
   
   }
 
 
 }