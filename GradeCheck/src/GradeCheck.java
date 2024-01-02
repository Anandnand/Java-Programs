import java.util.Scanner;

public class GradeCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
		int grade=sc.nextInt();
		gradeCheck(grade);
		
	}
	public static void gradeCheck(int grade) {
		if(grade>50) {
			System.out.println("pass");
		}else {
		System.out.println("fail");
	}

	}
}
