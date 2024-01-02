package powerofSquares;
import java.util.Scanner;

public class PowerSquares {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter a Number");
int num=scan.nextInt();
System.out.println(Powersq.squareNumber(num));
scan.close();
}
}

