public class Chars
 {
   private char[][] ch;
   private String str;
   
   public Chars(char[][] c)
    {
      this.ch = new char[c.length][c[0].length];
      
      for(int i = 0; i < c.length; i++)
       {
         for(int j = 0; j < c[0].length; j++)
          {
             this.ch[i][j] = c[i][j];
          
          }
       
       }
   } 
     public Chars(String str)
     {
       this.str = str;
     
     }
     public String createAString()
     {
        String answ = "";
        
        for(int i = 0; i < this.ch.length; i++)
         {
            for(int j = 0; j < this.ch[i].length; j++)
             {
                answ = answ + this.ch[i][j];
             
             }
         
         
         }
     
      return answ;
     }
    
     
   public char[][] createCharArray()
    {
      int p = 0;
      int n = 0;
      n = this.str.length() / 4;
      
      char [][] AA;
      
       if(this.str.length() % 4 == 0)
        { 
            AA = new char [4][n];
            
            for(int i = 0; i < AA.length; i++)
             {
               for(int j = 0; j < AA.length; j++)
                {
                   AA[i][j] = this.str.charAt(p);
                   p++;
                }
             }
        }
        else 
         {
            AA = new char[4][4];
         }
    
    
    
    return AA;
    }
 
    
 
 
 
 
 }