package lab_3;
import java.util.Scanner;

public class Lab3Q2 {
  public Lab3Q2() {}
  public String getImage(String str) {
	  String st = str;
	  StringBuffer sb = new StringBuffer(st);
	  String s =new String(sb.reverse());
	  String s1=st+"|"+s;
	  return s1;
  }
  public static void main(String [] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter The String");
	  String s2=sc.nextLine();
	  Lab3Q2 o=new Lab3Q2();
	  o.getImage(s2);
	  System.out.println(o.getImage(s2));
  }
}

