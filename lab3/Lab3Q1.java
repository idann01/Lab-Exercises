package lab_3;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Lab3Q1 {
 public static void main(String [] args) {
	 int sum = 0;
	 String st;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter");
	 String str = sc.nextLine();
	 StringTokenizer tok = new StringTokenizer(str," ");
	 System.out.println(str);
	 while(tok.hasMoreTokens()) {
		 st = tok.nextToken();
		 System.out.println(st);
		 //System.out.println(tok.nextToken() instanceof String);
		 sum = sum + (Integer.parseInt(st));
		 

	 }
	 System.out.println("SUM : " + sum);
	 
 }
 
}