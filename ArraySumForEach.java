import java.util.Scanner;

class ArraySumForEach
{
      static int sum;
      int a[]=new int[10];
       public static void printData(int...i)
      { 
         sum=0;
         for(int j : a)
          {
             // System.out.println(j);
              sum=sum+j;
          }
          
         System.out.println("Sum is "+sum);
      }
      public static void main(String[] args)
      {
            // ArraySumForEach obj= new ArraySumForEach();
             printData(1,2);
             printData(1,2,3,4,5);
             printData(10,20,30,40,50,60);
             printData(12,34,30,45);
      }
}