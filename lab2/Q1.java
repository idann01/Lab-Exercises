package lab_2;
import java.util.Arrays;
import java.util.Scanner;

public class Q1{
	public static void main(String[] args) {
		
		int n;
		Q1 one = new Q1();
		System.out.println("number of elements in array:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the elements of the array:");
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("second smallest : " + one.getSecondSmallest(arr));
	}
	
	public int getSecondSmallest(int arr[]) {
		Arrays.sort(arr);
		return arr[1];
	}
}