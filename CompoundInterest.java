import java.util.Scanner;
import java.lang.Math;

class CompoundInterest
{
      double p,r,t,sum,ci;
      public void acceptData()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter principle amount ");
          p=sc.nextDouble();
          System.out.println("Enter interest rate ");
          r=sc.nextDouble();
          System.out.println("Enter number of years ");
          t=sc.nextDouble();
      }
      public void printData()
      {
         sum=0;
         sum=p*(Math.pow((1+(r/100)),t));
         ci=sum-p;    
         System.out.println("Sum is "+sum);
         System.out.println("Compound Interest is "+ci);
      }
      public static void main(String[] args)
      {
             CompoundInterest obj= new CompoundInterest();
             obj.acceptData();
             obj.printData();
      }
}