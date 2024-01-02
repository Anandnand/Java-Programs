import java.util.Scanner;
public class DoubleTrouble {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(doubleNumber(n));
		
	}
	
public static int doubleNumber(int n) {
	return n*2;
}
}
