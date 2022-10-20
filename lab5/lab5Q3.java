package lab5;
import java.util.Scanner;


public class lab5Q3  {
	public static void main(String [] args) {
    Employee emp = new Employee();
    Scanner sc = new Scanner(System.in);
    double sal = sc.nextDouble();
    emp.setSalary(sal);
    try {
    	emp.checkSalary(sal);
    }catch(EmployeeException e){
    	System.out.println(e);
    }
}
}