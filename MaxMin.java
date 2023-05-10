import java.util.Scanner;

class MaxMin
{
      int n,i,max,min,x,y;
      int a[]=new int[10];
      Scanner sc=new Scanner(System.in);
      public void acceptData()
      {
          System.out.println("Enter size of array ");
          n=sc.nextInt();
          System.out.println("Enter array elements ");
          for(i=0;i<n;i++)
          {
              a[i]=sc.nextInt();
          }
      }
      public void findMax()
      { 
         max=0;
         for(i=0;i<n;i++)
          {
              if(a[i]>max)
              {
                  max=a[i];
                  x=i;
              }
          }
         System.out.println(max + " is maximum & present at "+x+" position");
      }
      public void findMin()
      { 
         min=a[0];
         for(i=0;i<n;i++)
          {
              if(a[i]<min)
              {
                  min=a[i];
                  y=i;
              }
          }
         System.out.println(min + " is minimum & present at "+y+" position");
      }
      public static void main(String[] args)
      {
             MaxMin obj= new MaxMin();
             obj.acceptData();
             obj.findMax();
             obj.findMin();
      }
}