import java.util.Scanner;

class Even
{
      int i,a,b;
      public void acceptData()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter starting range ");
          a=sc.nextInt();
          System.out.println("Enter ending range ");
          b=sc.nextInt();
      }
      public void printData()
      {    
           System.out.println("Even numbers in given range are ");
           for(i=a;i<=b;i++)
           {  
                if(i%2==0)
                  System.out.print(" "+i);
           }
      }
      public static void main(String[] args)
      {
             Even obj= new Even();
             obj.acceptData();
             obj.printData();
      }
}