import java.util.Scanner;
public class mid{
    public static void main(String[] args){
        int min,max,mid;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size 1:");
        int n1=input.nextInt();
        System.out.println("Enter array size 2:");
        int n2=input.nextInt();
        int A[] = new int[n1]; 
        System.out.println("Enter array elements 1:");
        for(int i=0;i<n1;i++){
            A[i]=input.nextInt();
        }
        int B[] = new int[n2]; 
        System.out.println("Enter array elements 2:");
        for(int i=0;i<n2;i++){
            B[i]=input.nextInt();
        }
        if(A[0]<=B[0]){
            min = A[0];
        }
        else{
            min = B[0];
        }
        if(A[n1-1]>=B[n2-1]){
            max = A[n1-1];
        }
        else{
            max = B[n2-1];
        }
        mid=(min+max)/2;
        System.out.println("MEDIAN :"+mid);
       }
    }

