import java.util.Scanner;
//0 1 1 2 3 5 8 13 21 34 
class Fibonacci
{
      int n,a,b,c,i;
      public void acceptData()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the range ");
          n=sc.nextInt();
      }
      public void printData()
      {    
           a=8;  b=9;
           System.out.print(a + " " + b);
           for(i=3;i<=n;i++)
           {  
                c=a+b;
                System.out.print(" "+c);
                a=b;
                b=c;
           }
       }
       public static void main(String[] args)
       {
             Fibonacci obj= new Fibonacci();
             obj.acceptData();
             obj.printData();
       }
}