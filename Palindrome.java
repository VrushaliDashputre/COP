import java.util.Scanner;

class Palindrome
{
      int rem,n,m,rev;
      public void acceptData()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter any number ");
          n=sc.nextInt();
      }
      public void printData()
      {
         m=n;
         rev=0;
         while(n>0)
         {
             rem=n%10;
             n=n/10;
             rev=(rev*10)+rem;
         }
         if(m==rev)
           System.out.println("Palindrome no.");
         else
           System.out.println("not Palindrome no.");
      }
      public static void main(String[] args)
      {
             Palindrome obj= new Palindrome();
             obj.acceptData();
             obj.printData();
      }
}