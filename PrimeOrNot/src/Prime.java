import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	for(int i=2;i<=n;i++) {
		if(n%i==0) {
			 System.out.println("it is not a prime number");
			 	return;
			 }
	          System.out.println("it is a prime number");
			 }
		
		 }
		
	}
	
