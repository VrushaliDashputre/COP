import java.util.Scanner;

class Factorial
{
      int i,fact,n;
      public void acceptData()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter any number ");
          n=sc.nextInt();
      }
      public void printData()
      {
         fact=1;
         for(i=1;i<=n;i++)
         {
             fact=fact*i;
         }
         System.out.println("Factorial is "+fact);
      }
      public static void main(String[] args)
      {
             Factorial obj= new Factorial();
             obj.acceptData();
             obj.printData();
      }
}