import java.util.Scanner;

class Calc
{
      int a,b,n;
      Scanner sc=new Scanner(System.in);
      public void acceptData()
      {
          System.out.println("Enter your choice bet 1 to 4 ");
          n=sc.nextInt();

          switch(n)
          {
              case 1: Addition(); break;
              case 2: Subtraction(); break;
              case 3: Multiplication(); break;
              case 4: Division(); break;
              default: System.out.println("Wrong choice");
          }
      }
      public void Addition()
      {    
          System.out.println("Enter 1st number ");
          a=sc.nextInt();
          System.out.println("Enter 2nd number ");
          b=sc.nextInt();

           int c=a+b;
           System.out.println("Addition is "+c);
      }
      public void Subtraction()
      {
          System.out.println("Enter 1st number ");
          a=sc.nextInt();
          System.out.println("Enter 2nd number ");
          b=sc.nextInt();
    
           int c=a-b;
           System.out.println("Subtraction is "+c);
      }
      public void Multiplication()
      {    
          System.out.println("Enter 1st number ");
          a=sc.nextInt();
          System.out.println("Enter 2nd number ");
          b=sc.nextInt();

           int c=a*b;
           System.out.print("Multiplication is "+c);
      }
      public void Division()
      {
          System.out.println("Enter 1st number ");
          a=sc.nextInt();
          System.out.println("Enter 2nd number ");
          b=sc.nextInt();
    
           int c=a/b;
           System.out.print("Division is "+c);
      }
      public static void main(String[] args)
      {
             Calc obj= new Calc();
             obj.acceptData();
      }
}