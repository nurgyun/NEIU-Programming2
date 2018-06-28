public abstract class NewString
 {
    private String test;
    
    private String result;
    
    public NewString()
    {
      this.test = "Accounting";
    }
 
    public void display()
     {
        System.out.println("In the beginning we had a String: " + this.test);     
     
     }
    public String getTest()
     {
       return this.test;
     }
    public void setTest(String s)
     {
       this.test = s;
     }
    public String getResult()
    {
      return this.result;
    }
    public void setResult(String r)
    {
      this.result = r;
    }
 
 }


