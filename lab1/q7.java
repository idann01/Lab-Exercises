package lab1;
import java.util.Scanner;

 public class q7 {
    public static void main(String args[]) {
        
      
       int num;
       boolean flag = false;
        
    
       Scanner scanner = new Scanner(System.in);
        
 
       System.out.println("number : ");
       num = scanner.nextInt();
        
    
       int currentDigit = num % 10;
       num = num/10;
        
      
       while(num>0){
         
           if(currentDigit <= num % 10){
               flag = true;
               break;
           }

           currentDigit = num % 10;
           num = num/10;
       }
        
     
       if(flag){
           System.out.println("Digits not in increasing order");
       }else{
           System.out.println("Digits in increasing order");
       }
    }
}
