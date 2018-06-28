public class Problem30 implements IProblem30
  {
  
     private String A;
     private String B;
     
   
     
     
     public Problem30()
      {
         this.A = "acegikmoqsuwy";
         this.B = "bdfhjlnprtvxz";
      
      }
     
     public Problem30(String A, String B)
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
        return this.B;
      }

      
      
      public String interleave(String A, String B)
       {
      
      String C = "";
      
      int ai = 0, bi = 0;
       
      for(int ci = 0; ci < A.length()+B.length();)
        {
          if(ai < A.length())
            {
              C = C + A.charAt(ai); 
              ai++;
              ci++;
           
           }
          if (bi < B.length())
           {
              C = C + B.charAt(bi);
              bi++;
              ci++;
       
           }  
        }
     return C;
  
  }

   public String toString()
    {
       return "String one is: " + this.A+
              "\nString two is: "  + this.B+
              "\nString result is: " + interleave(this.A, this.B);
    
    
    }
   
  
  
  
  }