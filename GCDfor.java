import java.util.Scanner;

class GCDfor
{
      int a,b,i,lcm,gcd;
      Scanner sc=new Scanner(System.in);
      public void acceptData()
      {
          System.out.println("Enter any 2 numbers ");
          a=sc.nextInt();
          b=sc.nextInt();
      }
      public void printData()
      { 
          for(i=1;i<=a || i<=b;i++)
          {
              if(a%i==0 && b%i==0)
              {
                  gcd=i;
              }
          }
         lcm=(a*b)/gcd;
         System.out.println("LCM of "+a+" & "+b+" is "+lcm);
         System.out.println("GCD of "+a+" & "+b+" is "+gcd);
      }
      public static void main(String[] args)
      {
             GCDfor obj= new GCDfor();
             obj.acceptData();
             obj.printData();
      }
}