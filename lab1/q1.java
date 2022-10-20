package lab1;
import java.util.Scanner;


public class q1
{
  
    
    public static int sumOfCubes(int n)
    {
        int sum = 0;
        while(n!=0) {
        	int k=n%10;
        	k=k*k*k;
        	sum=sum+k;
        	n=n/10;
        }
        return sum;
    }
  

    public static void main(String[] args)
    
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Number");
        int n = sc.nextInt();
        System.out.println("Sum of Cubes:");
        System.out.println(sumOfCubes(n));
  
    }
}