import java.util.Scanner;

class Prime
{
      int n, i, cnt;
      public void acceptData()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a no. ");
          n=sc.nextInt();
      }
      public void checkPrime()
      {    
           cnt=0;
           for(i=1;i<=n;i++)
           {  
                 if(n%i==0)
                    cnt++;
           }
           if(cnt==2)
             System.out.println("Prime no");
           else
             System.out.println("not prime no");
       }
       public static void main(String[] args)
       {
             Prime obj= new Prime();
             obj.acceptData();
             obj.checkPrime();
       }
}