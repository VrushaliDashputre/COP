import java.util.Scanner;

class EvenNestedFun
{
      int i;
      public void checkEven(int j)
      {
           if(i>=1 && i<=11)
           {  
                if(i%2==0)
                  System.out.print(" "+i);
           }
      }
      public void printData()
      {    
           System.out.println("Even numbers between 1 to 11 are ");
           for(i=1;i<=11;i++)
           {
              checkEven(i);
           }
      }
      public static void main(String[] args)
      {
             EvenNestedFun obj= new EvenNestedFun();
             obj.printData();
      }
}