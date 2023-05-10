import java.util.Scanner;

class Evenfor
{
      int i;
      
      public void printData()
      {    
           System.out.println("Even numbers between 1 to 11 are ");
           for(i=1;i<=11;i++)
           {  
                if(i%2==0)
                  System.out.print(" "+i);
           }
      }
      public static void main(String[] args)
      {
             Evenfor obj= new Evenfor();
             obj.printData();
      }
}