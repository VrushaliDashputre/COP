import java.util.Scanner;

class ArrMult
{
    int i,j,k;
    int arr1[ ] [ ] = new int [2][2];
    int arr2[ ] [ ] = new int [2][2];
    int arr3[ ] [ ] = new int [2][2];
    Scanner sc=new Scanner(System.in);
    
    public void acceptData()
    {
        System.out.println("Enter first 2D array elements ");
        for(i=0;i<arr1.length;i++)
        {
          for(j=0;j<arr1[i].length;j++)
          {
            arr1[i][j]=sc.nextInt();
          }
        }
        System.out.println("Enter first 2D array elements ");
        for(i=0;i<arr2.length;i++)
        {
          for(j=0;j<arr2[i].length;j++)
          {
            arr2[i][j]=sc.nextInt();
          }
        }
    }
    public void addition()
    {
       System.out.println("Multiplication of 2D array elements is ");
       for(i=0;i<2;i++)
        {
          for(j=0;j<2;j++)
          { 
              arr3[i][j]=0;
             for(k=0;k<2;k++)
              {
                 arr3[i][j]=arr3[i][j]+(arr1[i][k]*arr2[k][j]);
              }
             System.out.print(arr3[i][j]+" ");
          }
         System.out.println("\n");
       }
     }
     public static void main(String[] args)
     {
         ArrMult obj=new ArrMult();
         obj.acceptData();
         obj.addition();
     }
}