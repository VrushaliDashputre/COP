import java.util.Scanner;
import java.lang.Math;

class Power
{
      double base,power,ans;
      public void acceptData()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter base value ");
          base=sc.nextInt();
          System.out.println("Enter power value ");
          power=sc.nextInt();
      }
      public void printData()
      {
         ans=Math.pow(base,power);    
         System.out.println("Answer is "+ans);
      }
      public static void main(String[] args)
      {
             Power obj= new Power();
             obj.acceptData();
             obj.printData();
      }
}