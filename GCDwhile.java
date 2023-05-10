import java.util.Scanner;

class GCDwhile
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
          i=1;
          while(i<=a || i<=b)
          {
              if(a%i==0 && b%i==0)
              {
                  gcd=i;
              }
            i++;
          }
         lcm=(a*b)/gcd;
         System.out.println("LCM of "+a+" & "+b+" is "+lcm);
         System.out.println("GCD of "+a+" & "+b+" is "+gcd);
      }
      public static void main(String[] args)
      {
             GCDwhile obj= new GCDwhile();
             obj.acceptData();
             obj.printData();
      }
}