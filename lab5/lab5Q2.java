package lab5;
import java.util.Scanner;
import java.util.regex.*;

public class lab5Q2 extends Exception {
   public lab5Q2 (String str) {
	   super(str);
   }
   static public void valName(String fullName) throws lab5Q2{
	  
	   
	   if(!(Pattern.matches("\\[a-zZ-A]", fullName))) {
		   throw new lab5Q2("Full Name Can Not Be Blank");
	   }else {
		   System.out.println("Full Name Valid");
	   }
   }
   
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   String fullName=sc.next();
	   try {
	   valName(fullName);
	   }catch(lab5Q2 e) {
		   System.out.println(e);
	   }
   }
}
