public class FinalNewString extends NewString
 {
    private char remove;
    
    public FinalNewString()
     {
        super();
        this.remove = 'c';
     }
    
    private char getRemove()
     {
        return this.remove;
     }
    
    public void setRemove(char cc)
     {
       this.remove = cc;
     }
     public void display()
     {
        super.display();
        System.out.println("After removing letter " + getRemove() +" now we have a new String: " + getResult());     
     }
     
     
     public void newSmallerArray()
     {
         String m = getRemove() +"";
        
         String rr = getTest().replace(m, "");
        
         setResult(rr);  
     }
    
 } 

