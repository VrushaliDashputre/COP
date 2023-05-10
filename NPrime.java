import java.util.Scanner; 
 
public class NPrime   
{  
    int x;
    Scanner sc = new Scanner(System.in);  
    public void acceptData()
    {
       System.out.print("Enter the value of nth prime number ");  
       x = sc.nextInt();  
    }
    public void printData()
    {
       int n=1, cnt=0, i;  
       while (cnt < x)  
       {  
           n=n+1;  
           for (i=2; i<=n; i++)  
           {   
               if(n%i==0)   
                 break;  
           }     
           if(i==n)  
              cnt++;  
       }    
       System.out.println("The " +x +"th prime number is: " + n);  
     }
     public static void main(String[] args)   
     {  
         NPrime obj=new NPrime();
         obj.acceptData();
         obj.printData();
     }  
}  