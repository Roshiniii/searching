import java.util.Scanner;
class bs{  
    int binarySearch(int arr[], int first, int last, int key){  
        if (last>=first){  
            int mid = first + (last - first)/2;  
            if (arr[mid] == key){  
            return mid;  
            }  
            if (arr[mid] > key){  
            return binarySearch(arr, first, mid-1, key);
            }else{  
            return binarySearch(arr, mid+1, last, key);
            }  
        }  
        return -1;  
    } 
} 
class binary{
    public static void main(String args[]){  
        {int i,n,key,A[];
         Scanner input = new Scanner(System.in);
         System.out.println("Enter number of elements:");
         n = input.nextInt(); 
         A = new int[n]; 
         System.out.println("Enter array element:");
         for (i = 0; i < n; i++)
           A[i] = input.nextInt();
        System.out.println("Enter key");
        key = input.nextInt();
        int first=0;
        int last=n-1;  
        bs searching= new bs();
        int result = searching.binarySearch(A,first,last,key);  
        if (result == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    }  
}
}