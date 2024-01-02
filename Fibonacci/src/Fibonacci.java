import java.util.Scanner;

//public class Fibonacci {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int fib1=0;
//		int fib2=1;
//		int input=sc.nextInt();
//		 
//		if(input==1) {
//			System.out.print(fib1);
//		}
//		else if(input==2) {
//			System.out.print(fib1+" "+fib2);
//		}else {
//			for(int i=3;i<=input;i++) {
//			  int nextNo=fib1+fib2;
//			System.out.print(nextNo);
//			  fib1=fib2;
//			  fib2=nextNo;
//				
//			}
//		}
//	}
//}

//USING A METHOD

//public class Fibonacci {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int fib1=0;
//		int fib2=1;
//		System.out.println("Enter the number");
//		int input=sc.nextInt();
//		printFibonacci(input,fib1,fib2);
//	}
//		 
//		public static void printFibonacci(int input,int fib1,int fib2) {
//		if(input==1) {
//			System.out.print(fib1);
//		}
//		else if(input==2) {
//			System.out.print(fib1+" "+fib2);
//		}else {
//			for(int i=3;i<=input;i++) {
//			  int nextNo=fib1+fib2;
//			System.out.print(nextNo+" ");
//			  fib1=fib2;
//			  fib2=nextNo;
//				
//			}
//		}
//	}
//}

//USING METHOD TYPE 4

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fib1=0;
		int fib2=1;
		System.out.println("Enter the number");
		int input=sc.nextInt();
		String res=printFibonacci(input,fib1,fib2);
		System.out.println(res);
	}
		 
		public static String printFibonacci(int input,int fib1,int fib2) {
		if(input==1) {
			System.out.print(fib1);
			return "completed";
		}
		else if(input==2) {
			System.out.print(fib1+" "+fib2);
			return "completed";
			
		}else {
			for(int i=3;i<=input;i++) {
			  int nextNo=fib1+fib2;
			System.out.print(nextNo+" ");
			  fib1=fib2;
			  fib2=nextNo;
			}
			return "completed";
		}
	}
}