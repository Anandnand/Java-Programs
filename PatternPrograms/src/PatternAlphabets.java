import java.util.Scanner;

public class PatternAlphabets {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch='A';
		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;	
			}
		    System.out.println();    
		}
	
	}

}
