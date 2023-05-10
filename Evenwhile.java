import java.util.Scanner;

class Evenwhile
{
      int i;
      
      public void printData()
      {    
           System.out.println("Even numbers between 1 to 11 are ");
           i=1;
           while(i<=11)
           {  
                if(i%2==0)
                  System.out.print(" "+i);
                i++;
           }
      }
      public static void main(String[] args)
      {
             Evenwhile obj= new Evenwhile();
             obj.printData();
      }
}