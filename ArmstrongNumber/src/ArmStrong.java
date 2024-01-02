import java.util.Scanner;
public class ArmStrong {
	public static int armStrong(int num,int numDigit) {
		int sum=0;
		while(num!=0) {
		int rem=num%10;
			 sum+=(int) Math.pow(rem,numDigit);	
			 num/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int numDigit=String.valueOf(num).length();
		int original=num;
		int res=armStrong(num,numDigit);
		System.out.println(armStrong(num,numDigit));
		if(original==res) {
			System.out.println(num+"is a armStrong Number");
		}else {
			System.out.println(num+"is not a armStrong Number");
			
		}	
	}

}
