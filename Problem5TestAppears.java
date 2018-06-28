public class Problem5TestAppears
 {
     public static void main(String[] args)
      {
          Problem5Appears test = new Problem5Appears();
          test.setA("Java");
          System.out.println("String A: " + test.getA());
          test.setB("Java is Fun");
          System.out.println("String B: " + test.getB());
          test.display();
          
          
          System.out.println();
          System.out.println();
          
          Problem5Appears a1 = new Problem5Appears("553322","765533221");
          System.out.println("String A: " + a1.getA());
          System.out.println("String B: " + a1.getB());
          a1.display();
         
         
          
          
      
      } 
  
 } 