import java.util.Scanner;

class Rectangle
{
      int length, breadth;
      public void acceptData()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the length ");
          length=sc.nextInt();
          System.out.println("Enter the breadth ");
          breadth=sc.nextInt();
      }
      public void printData()
      {    
           int area=length * breadth;
           System.out.print("area of rectangle "+area);
      }
      public static void main(String[] args)
      {
             Rectangle obj= new Rectangle();
             obj.acceptData();
             obj.printData();
      }
}