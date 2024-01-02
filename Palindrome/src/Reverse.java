import java.util.Scanner;

public class Reverse {
	public  static int reverse(int n) {
		int reversed=0;
		while(n!=0) {
			reversed=reversed*10+n%10;
			n/=10;
		}
		return reversed;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		System.out.println(reverse(n));
		
	}

}
