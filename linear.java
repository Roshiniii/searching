import java.util.Scanner;
public class linear
{
   public static void main(String args[])
   {
      int i,n,key,A[];
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      n = input.nextInt(); 
      A = new int[n]; 
      System.out.println("Enter array element:");
      for (i = 0; i < n; i++)
        A[i] = input.nextInt();
      System.out.println("Enter key");
      key = input.nextInt();
      for (i = 0; i<n; i++)
      {
         if (A[i] == key) 
         {
           System.out.println("element is founded at index value: "+i);
           break;
         }
      }
      if (i == n)
        System.out.println("element is not founded");
   }
}