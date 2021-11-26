import java.util.Scanner;  
public class squareroot   
{  
public static void main(String[] args)    
{   
System.out.print("Enter a number: ");  
Scanner input = new Scanner(System.in);    
int n = input.nextInt();  
System.out.println(squareroot(n));  
}   
public static double squareroot(int a){  
    double t;  
    double rootvalue=a/2;  
do   
{  
   t=rootvalue;
   rootvalue=(t+(a/t))/2;  
}   
while((t-rootvalue)!= 0);  
return rootvalue;  
}  
}
