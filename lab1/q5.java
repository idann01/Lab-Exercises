package lab1;
import java.util.Scanner;
public class q5 {
	
	
	static int sum(int n, int i, int j)
	{
		int Sum1, Sum2, Sum3;
	
		Sum1 = ((n / i)) * (2 * i + (n / i - 1) * i) / 2;
		Sum2 = ((n / j)) * (2 * j + (n / j - 1) * j) / 2;
		Sum3 = ((n / (i * j))) * (2 * (i * j)+ (n / (i * j) - 1) * (i * j))/ 2;
						
	
		return Sum1 + Sum2 - Sum3;
	}
	
	
	public static void main(String []args)
	{
		int n = 10;
		int i = 3, j = 5;
	
		System.out.println(sum(n, i, j));
	
	}
}