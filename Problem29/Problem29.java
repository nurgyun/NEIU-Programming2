public class Problem29
 {
   private int[] arr;
   private int sumEven = 0;
   private double oddProduct = 1;
   
   public Problem29(int[] a)
   {
       this.arr = new int[ a.length];
       
       for(int i = 0; i < a.length; i++)
        {
          this.arr[i] = a[i];
        }
   }
   public void evenSumPlusOddProduct()
    {
       for(int i = 0; i< this.arr.length; i++)
       {
         if (this.arr[i] % 2 ==0)
           this.sumEven = this.sumEven + this.arr[i];

         else
           this.oddProduct = this.oddProduct * arr[i];
       }

    }
   
   public void display()
   {
        System.out.print("The sum of the even indices is: " + this.sumEven + " and the product of the odd indices is: " + this.oddProduct);
   
   }
 }