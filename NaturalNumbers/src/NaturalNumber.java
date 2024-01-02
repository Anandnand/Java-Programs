import java.util.Scanner;

public class NaturalNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sum of natural number");
		int n=sc.nextInt();
		int sum=0;
//		while(n>0) {
//			sum+=n;
//			n--;
//		}
//		System.out.println("sum of n natural numbers "+sum);
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
	System.out.println("the sum is "+sum);
	}

}


