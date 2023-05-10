import java.util.Scanner;

class Student
{
      int m1,m2,m3,total;
      String name;
      double per;
      public void acceptData()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter student name ");
          name=sc.next();
          System.out.println("Enter first subject mark ");
          m1=sc.nextInt();
          System.out.println("Enter second subject mark ");
          m2=sc.nextInt();
          System.out.println("Enter third subject mark ");
          m3=sc.nextInt();
      }
      public void printData()
      {
         total=0;
         total=m1+m2+m3;
         per=total/3.0;    
         System.out.println("Student name is "+name);
         System.out.println("Total marks are "+total);
         System.out.println("Percentage is "+per);
         if(per>=85)
           System.out.println("A");
         else if(per>=75)
           System.out.println("B");
         else if(per>=65)
           System.out.println("C");
         else if(per>=55)
           System.out.println("D");
         else if(per>=40)
           System.out.println("E");
         else
           System.out.println("FAIL");
      }
      public static void main(String[] args)
      {
             Student obj= new Student();
             obj.acceptData();
             obj.printData();
      }
}