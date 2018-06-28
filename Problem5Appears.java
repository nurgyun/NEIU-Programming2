public class Problem5Appears
 {
    private String A;
    private String B;
    
    public Problem5Appears()
     {
        this.A = "";
        this.B = "";
     }
    
    public Problem5Appears(String A, String B)
     {
       this.A = A;
       this.B = B;
     }
     
     public String getA()
     {
        return this.A;
     }
     public String getB()
     {
       return this.A;
     }
     public void setA(String A)
     {
       this.A = A;
     }
    
    public void setB(String B)
     {
       this.B = B;
     }

     
     
     public boolean appearsCheck()
      {
        boolean check = false;
         
         if(A.length() > B.length())
          check = false;
         else
          {
            if(B.contains(A))
            check = true;
          }
      return check;
      }
     public void display()
     {
        System.out.print("String B contains String A: " + appearsCheck());
     
     }
     
  }
 
 
 
 
