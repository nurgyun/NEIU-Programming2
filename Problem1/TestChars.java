public class TestChars
 {
    public static void main(String[] args)
     {
       char[][] t = {{'J', 'A', 'V', 'A'},
                     {' ', 'I', 'S', ' '},
                     {' ', 'F', 'U', 'N'}};
       
       
       Chars p1 = new Chars(t);
       System.out.print(p1.createAString());
       
       
       Chars p2 = new Chars("JAVA-IS-VERY-FUN");
       char[][] w1 = p2.createCharArray();
       
       for(int i = 0; i < w1.length; i++)
        {
          for(int j = 0; j < w1.length; j++)
           {
             System.out.print(w1[i][j]);
           }
        System.out.println();
        }
        
       
        Chars p3 = new Chars("JAVA IS FUN!!");
       
       char[][] w2 = p3.createCharArray();
       for(int i = 0; i < w2.length; i++)
        {
          for(int j = 0; j < w2.length; j++)
           {
             System.out.print(w2[i][j]);
           
           }
        System.out.println();
        }
     }
 
 
 
 
 
 
 
 }