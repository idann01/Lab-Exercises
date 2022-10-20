package lab1;
import java.util.Scanner;

public class q3{  
public static void main(String args[])  
{    
 
 int x1=0;
 int x2=1;
 int x3,i;
 int n = 10;    
 System.out.println(x1);
 System.out.println(x2);
 
    
 for(i=2;i<n;++i)  
 {    
  x3 =x1 + x2;
  
  
	  System.out.println(x3); 
	
  if(i==n-2) {
  System.out.println(x3+x2 + ":  nth value " ); 
  }else {
  x1 = x2;    
  x2 = x3;
  }
  
 }    
 
  
}}