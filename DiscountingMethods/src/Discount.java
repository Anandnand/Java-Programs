import java.util.Scanner;
public class Discount {
	public static void discountPurchase(double amount ) {
		if(amount>100) {
			System.out.println("Discount is available");
		}else {
			System.out.println("Discount is not available");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the purchase amount");
		double amount=sc.nextDouble();
		discountPurchase(amount);
	}

}
