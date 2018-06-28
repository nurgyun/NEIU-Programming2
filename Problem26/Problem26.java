public class Problem26
 {
   public static void main(String[] args)
    {
      int [] arr = {12, 34, 56, 67, 78, 90};
      int val = 44;
      int idx = 3;
      
      insert(arr, val,idx);
    }
    
    public static void insert(int[] arr, int val, int idx)
     {
         int [] newA = new int[arr.length+1];
        
        if(idx < 0 || idx > arr.length-1)
         {
           throw new IndexOutOfBoundsException();
         }
         else
         
         
         
         for(int i = 0; i < arr.length; i++)
          {
             newA[i] = arr[i];
          
          }
         
          for(int i = newA.length-1; i > idx; i--)
           {
               newA[i] = newA[i-1];
           
           }
           
           newA[idx] = val;
     
          System.out.print("[");
          for(int i = 0; i < newA.length; i++)
          {
             System.out.print(newA[i] + " ,");
          
          }
          System.out.print("]");
    
     }
 
 
 
 
 }