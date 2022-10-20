package lab1;
import java.util.Scanner;
public class q2{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//red=stop(1);
	//yellow=ready(2);
	//green=go(3);
	System.out.println("Enter Number");
	int x = sc.nextInt();
	switch(x) {
	case 1: System.out.println("STOP!");
	break;
	case 2: System.out.println("READY");
	break;
	case 3: System.out.println("GO");
	break;
	
		}

	
	}
}