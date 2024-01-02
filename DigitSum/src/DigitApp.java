import java.util.Scanner;

public class DigitApp {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number ");
	int n=sc.nextInt();
	Digit digit=new Digit();
	System.out.println("the sum of digit is "+digit.digitSum(n));
}

}
