import java.util.Scanner;

class Swap
{
      int a,b,c;
      public void acceptData()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter first no. ");
          a=sc.nextInt();
          System.out.println("Enter second no. ");
          b=sc.nextInt();
      }
      public void printData()
      {    
         System.out.println("a= "+a+ " b= "+b);
      }
      public void swapValues()
      {
          c=a;
          a=b;
          b=c;   
      }
      public static void main(String[] args)
      {
             Swap obj= new Swap();

             obj.acceptData();
             obj.printData();
             obj.swapValues();
             obj.printData();
      }
}