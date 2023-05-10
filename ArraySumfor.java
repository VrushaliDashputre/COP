import java.util.Scanner;

class ArraySumForEach
{
      int sum;
      int a[]=new int[20];
      Scanner sc=new Scanner(System.in);
      public void acceptData(int...i)
      {
          System.out.println("Enter array elements ");
          for(int i: a)
          {
              i=sc.nextInt();
          }
      }
      public void printData()
      { 
         sum=0;
         for(int i: a)
          {
              System.out.println(i);
              sum=sum+i;
          }
          
         System.out.println("Sum of "+n+" numbers is "+sum);
      }
      public static void main(String[] args)
      {
             ArraySumForEach obj= new ArraySumForEach();
             obj.acceptData(1,2);
             obj.printData();
             obj.acceptData(1,2,3,4,5);
             obj.printData();
             obj.acceptData(10,20,30,40,50,60);
             obj.printData();
             obj.acceptData(12,34,30,45);
             obj.printData();
      }
}