import java.util.Scanner;

public class MultipleOfChecker {
	public static void multipleOfTen(int n,int m) {
		if(n%m==0) {
			System.out.println("Enter number "+n+"is Multiple of 10"+m);
		}else {
			System.out.println("Enter number "+n+"is not Multiple of 10"+m);
		}
			
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a two number");
		int n=sc.nextInt();
		int m=sc.nextInt();
		multipleOfTen(n,m);
	}


}
