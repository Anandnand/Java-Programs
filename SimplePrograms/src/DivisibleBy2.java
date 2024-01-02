import java.util.Scanner;

public class DivisibleBy2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("The numbers divisible by 2 are ");
	int n=sc.nextInt();
	for(int i=0;i<=n;i++) {
		if(i%2==0) {
			System.out.print(i);
		}
	}
 }
}

//int i=1;
//for(;;) {
//	if(i%2==0) {
//		System.out.println(i);
//	}i++;