import java.util.Scanner;

class EvenNestedif
{                          
   public void checkEven(int a, int b)   
   {    
      if(a<b)   
      {   
        if(a%2==0)   
        {
           System.out.print(a + " ");   
           checkEven(a+2,b);   
        }
        else   
        { 
            checkEven(a+1,b);
        }
     }
     else
       return 0;
   }
   public static void main(String[] args)
   {
      EvenNestedif obj=new EvenNestedif();
      System.out.println("Even numbers between 1 to 11 are ");       
      obj.checkEven(1,11);
   }
}