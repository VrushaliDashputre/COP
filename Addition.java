import java.util.Scanner;

class Addition
{
     int a,b;   
     public void acceptData()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter 1st number ");
         a= sc.nextInt();
         System.out.println("Enter 2nd number ");
         b= sc.nextInt();
     }
     public void doAddition()
     {
         int c=a+b;
         System.out.println("Addition is "+c);
     }
     public static void main(String[] a)
     {
         Addition obj = new Addition();
         obj.acceptData();
         obj.doAddition();
     }
}