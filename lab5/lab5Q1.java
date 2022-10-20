package lab5;
import java.util.Scanner;

public class lab5Q1 extends Exception {
   public lab5Q1 (String str) {
	   super(str);
   }
   static public void valAge(int age) throws lab5Q1{
	   if(age<=15) {
		   throw new lab5Q1("Age should be above 15");
	   }else {
		   System.out.println("Valid age");
	   }
   }
   
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int ag=sc.nextInt();
	   try {
	   valAge(ag);
	   }catch(lab5Q1 e) {
		   System.out.println(e);
	   }
   }
}

