import java.util.Scanner;

class ArraySumfor
{
      int n,i,sum;
      int a[]=new int[10];
      Scanner sc=new Scanner(System.in);
      public void acceptData()
      {
          System.out.println("Enter size of array ");
          n=sc.nextInt();
          System.out.println("Enter array elements ");
          for(i=0;i<n;i++)
          {
              a[i]=sc.nextInt();
          }
      }
      public void printData()
      { 
         sum=0;
         for(i=0;i<n;i++)
          {
              sum=sum+a[i];
          }
         System.out.println("Sum of "+n+" numbers is "+sum);
      }
      public static void main(String[] args)
      {
             ArraySumfor obj= new ArraySumfor();
             obj.acceptData();
             obj.printData();
      }
}