import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);	
			}
		}
	}

}

//number which will not divide

//public class Factors {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the number");
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			if(n%i!=0) {
//				System.out.println(i);	
//			}
//		}
//	}
//
//}
