import java.util.Scanner;
public class firstindex
{
   public static void main(String args[])
   {
      int i,n,A[],key;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      n = input.nextInt(); 
      A = new int[n]; 
      System.out.println("Enter array element:");
      for (i = 0; i < n; i++)
       { A[i] = input.nextInt();
       }
       System.out.println("Enter key:");
       key = input.nextInt(); 
          if(A[0]==key){
            System.out.println("key element is equal to firstindex");
          }
          else if(A[0]>key){
            System.out.println("key element is less than firstindex"); 
          }
          else
          System.out.println("key element is greater than firstindex");
   }
}