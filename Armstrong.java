import java.util.Scanner;

class Armstrong
{
      int rem,n,m,sum;
      public void acceptData()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter any number ");
          n=sc.nextInt();
      }
      public void printData()
      {
         m=n;
         sum=0;
         while(n>0)
         {
             rem=n%10;
             n=n/10;
             sum=sum+(rem*rem*rem);
         }
         if(m==sum)
           System.out.println("Armstrong no.");
         else
           System.out.println("Not Armstrong");
      }
      public static void main(String[] args)
      {
             Armstrong obj= new Armstrong();
             obj.acceptData();
             obj.printData();
      }
}