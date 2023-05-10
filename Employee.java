import java.util.Scanner;

class Employee
{
      int empId;
      String firstName,lastName;
      double basicSal;
      Employee()
      {
          System.out.println("Within default constructor");
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Employee's first name ");
          firstName=sc.next();
          System.out.println("Enter Employee's last name ");
          lastName=sc.next();
          System.out.println("Enter employee ID ");
          empId=sc.nextInt();
          System.out.println("Enter employee salary ");
          basicSal=sc.nextDouble();
      }
      Employee(String fn,String ln,int id,double bs)
      { 
         System.out.println("\nWithin 4 parameter constructor");
         firstName=fn;
         lastName=ln;
         empId=id;
         basicSal=bs;
      }
      Employee(String fn,int id,double bs)
      {
          System.out.println("\nWithin 3 parameter constructor"); 
         firstName=fn;
         empId=id;
         basicSal=bs;
      }
      public void printData()
      {
         System.out.print("Employee name is "+firstName);
         System.out.println(" "+lastName);
         System.out.println("Employee ID is "+empId);
         System.out.println("Employee Salary is "+basicSal);
      }
      public static void main(String[] args)
      {
             Employee e1= new Employee(); 
             e1.printData();

             Employee e2=new Employee("Abc","Xyz",123,2500);
             e2.printData();

             Employee e3=new Employee("Pqr",234,5000);
             e3.printData();
      }
}