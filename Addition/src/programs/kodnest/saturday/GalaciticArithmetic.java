package programs.kodnest.saturday;
import java.util.Scanner;
public class GalaciticArithmetic {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long num1=sc.nextLong();
	long num2=sc.nextLong();
	System.out.println(galaciticAddition(num1,num2));
	
}
public static long galaciticAddition(long num1,long num2) {
	return num1+num2;
}

}
