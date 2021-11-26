import java.util.Scanner;
public class keycount
{
   public static void main(String args[])
   {
      int i,n,A[],key,count=0;
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
       for(i=0;i<n;i++){
           if(key==A[i])
            count+=1;
       }
       System.out.println("count of key occured : "+count);
    }
}
