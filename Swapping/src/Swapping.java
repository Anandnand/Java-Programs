import java.util.Scanner;

public class Swapping {
	public static void swappingNumbers(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=sc.nextInt();
		System.out.println("Enter the b value");
		int b=sc.nextInt();
		swappingNumbers( a, b);
				
		
	}

}
