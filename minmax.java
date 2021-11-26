import java.util.Scanner;
public class minmax{
    public static void main(String[] args) {
        int temp,i,j,A[],n;
        Scanner input=new Scanner(System.in);
        System.out.println("enter array size:");
        n=input.nextInt();
        A = new int[n];
        System.out.println("enter array element:");
        for(i=0;i<n;i++){
        A[i]=input.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(A[i]<A[j]){
                temp=A[i];
                A[i]=A[j];
                A[j]=temp;
                }
            }
        }
        System.out.println("max num : "+A[0]+" "+"min num : "+A[n-1]);

    }
}