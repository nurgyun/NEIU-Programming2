public class TestProblem30//add getters to the problem on google doc
 {
    public static void main(String[] args)
     {
     
         Problem30 t1 = new Problem30();
         t1.interleave(t1.getA(), t1.getB());
         System.out.println(t1.toString());
         System.out.println();
         Problem30 t2 = new Problem30("Internships ", "are important do not wait until you graduate to look for one");
         t2.interleave(t2.getA(), t2.getB());
         System.out.println(t2.toString());
         
         
     
     
     
     }
    
 
 
 
 
 
 
 }