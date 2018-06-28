public class Problem8HowMany
 {
    public String str1;
    public String str2;
    
    public Problem8HowMany()
    {
       this.str1 = "";
       this.str2 = "";
    }

    
    
    public Problem8HowMany(String str1, String str2)
    {
       this.str1 = str1;
       this.str2 = str2;
    }
    public String getStr1()
    {
       return this.str1;
    }
    public String getStr2()
    {
       return this.str2;
    }
    public void setStr2(String str2)
    {
       this.str2 = str2;
    }
     public void setStr1(String str1)
    {
       this.str1 = str1;
    }
    
     public int howManyInCommon()
     {
        int count = 0;
       
        for(int i=0; i < this.str1.length(); i++)
         {
           char test = this.str1.charAt(i);
           
           if(this.str2.contains(test+""))
             count++;
         
         }
     
     
     return count;
     }
     
     public String toString()
      {
         return "String one is " + this.str1 + " and String two is " +this.str2
                 + "they have " + howManyInCommon() + " letters in common" ;
      
      }
 
 }