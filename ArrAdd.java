import java.util.Scanner;

class ArrAdd
{
    int i,j;
    int arr1[ ] [ ] = new int [3][3];
    int arr2[ ] [ ] = new int [3][3];
    int arr3[ ] [ ] = new int [3][3];
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
       System.out.println("Sum of 2D array elements is ");
       for(i=0;i<arr1.length;i++)
        {
          for(j=0;j<arr1[i].length;j++)
          { 
             arr3[i][j]=arr1[i][j]+arr2[i][j];
             System.out.print(arr3[i][j]+" ");
          }
         System.out.println("\n");
       }
     }
     public static void main(String[] args)
     {
         ArrAdd obj=new ArrAdd();
         obj.acceptData();
         obj.addition();
     }
}